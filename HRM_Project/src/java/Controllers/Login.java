/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controllers;

import DAL.Login.DAOLogin;
import Models.Account;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 *
 * @author xuxum
 */
public class Login extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("Views/Login/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        DAOLogin login = new DAOLogin();

        String email = request.getParameter("username");
        String password = request.getParameter("password");
        String submit = request.getParameter("submitLogin");
        //cheeck that button submit is not empty
        if (submit != null) {

            //Check that username and password are not empty
            if (email == null || email.trim().isEmpty() || password == null || password.trim().isEmpty()) {
                request.setAttribute("mess", "Email or Password can't be empty!");
                request.getRequestDispatcher("Views/Login/login.jsp").forward(request, response);
                return;
            }

            //Check format email
            if (!email.matches("^[\\w.%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
                request.setAttribute("mess", "Invalid email format!");
                request.getRequestDispatcher("Views/Login/login.jsp").forward(request, response);
                return;
            }
            try {
                Account account = login.loginUser(email, password);
                if (account != null) {
                    HttpSession session = request.getSession();
                    session.setAttribute("account", account);
                    if (account.getRoleId() == 1) {
                        response.sendRedirect("admin");
                    } else if (account.getRoleId() == 4) {
                        response.sendRedirect("manager");
                    } else if (account.getRoleId() == 5) {
                        response.sendRedirect("home");
                    }
                } else {
                    request.setAttribute("mess", "Email or Password is not correct!");
                    request.getRequestDispatcher("Views/Login/login.jsp").forward(request, response);
                }
            } catch (Exception e) {
                e.printStackTrace();
                request.setAttribute("mess", "An error occurred. Please try again.");
                request.getRequestDispatcher("Views/Login/login.jsp").forward(request, response);
            }

        }
    }

}
