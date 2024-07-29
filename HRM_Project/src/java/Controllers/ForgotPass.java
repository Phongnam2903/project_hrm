/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controllers;

import DAL.Login.DAOForgot;
import Models.Account;
import Validations.RandomCode;
import Validations.SendEmail;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 *
 * @author xuxum
 */
@WebServlet(name = "ForgotPass", urlPatterns = {"/forgotpass"})
public class ForgotPass extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("Views/Login/forgotPass.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        //trim spaces
        String email = request.getParameter("email").trim();
        //Initailize message
        String mess = "";

        //Validate email is Empty
        if (email.isEmpty()) {
            mess = "Email can't be empty";
            request.setAttribute("mess", mess);
            request.getRequestDispatcher("Views/Login/forgotPass.jsp").forward(request, response);
            return;
        }

        //email does not match format
        if (!email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            mess = "Invalid email format.";
            request.setAttribute("mess", mess);
            request.getRequestDispatcher("Views/Login/forgotPass.jsp").forward(request, response);
            return;
        }

        DAOForgot dao = new DAOForgot();
        Account account = dao.checkAccountForChangePass(email);

        if (account != null) {
            //Generate a new random code
            int code = RandomCode.randomCode(6);
            String newCode = String.valueOf(code);

            //send Email
            String subject = "Code Reset Resquest";
            String content = "<h1>Code to change pasword</h1>"
                    + "<p>Your Code is: <strong>" + newCode + "</strong></p>";
            SendEmail.sendMail(email, subject, content);

            session.setAttribute("resetCode", code);
            session.setAttribute("userEmail", email);
            response.sendRedirect("Views/Login/resetpassword.jsp");
        } else {
            mess = "Account not exist!!";
            request.setAttribute("mess", mess);
            request.getRequestDispatcher("Views/Login/forgotPass.jsp").forward(request, response);
        }

    }

}
