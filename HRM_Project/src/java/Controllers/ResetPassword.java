package Controllers;

import DAL.Login.DAOForgot;
import Models.Account;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(name = "ResetPassword", urlPatterns = {"/resetpassword"})
public class ResetPassword extends HttpServlet {

    private static final Logger LOGGER = Logger.getLogger(ResetPassword.class.getName());

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("Views/Login/ResetPassword.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        String code = request.getParameter("code");
        String newPassword = request.getParameter("newPassword");
        String confirmPassword = request.getParameter("confirmPassword");
        String mess = "";

        try {
            // Validate that the code is not empty and does not contain spaces
            if (code == null || code.trim().isEmpty() || code.contains(" ")) {
                mess = "Verification code cannot be empty or contain spaces.";
                request.setAttribute("mess", mess);
                request.getRequestDispatcher("Views/Login/ResetPassword.jsp").forward(request, response);
                return;
            }

            // Validate that the newPassword is not empty
            if (newPassword == null || newPassword.trim().isEmpty()) {
                mess = "New password cannot be empty.";
                request.setAttribute("mess", mess);
                request.getRequestDispatcher("Views/Login/ResetPassword.jsp").forward(request, response);
                return;
            }

            // Validate that the confirmPassword is not empty
            if (confirmPassword == null || confirmPassword.trim().isEmpty()) {
                mess = "Confirm password cannot be empty.";
                request.setAttribute("mess", mess);
                request.getRequestDispatcher("Views/Login/ResetPassword.jsp").forward(request, response);
                return;
            }

            // Validate newPassword against the password pattern
            String passwordPattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,15}$";
            if (!newPassword.matches(passwordPattern)) {
                mess = "Password must be 8-15 characters long, include a number, a lowercase letter, an uppercase letter, and a special character.";
                request.setAttribute("mess", mess);
                request.getRequestDispatcher("Views/Login/ResetPassword.jsp").forward(request, response);
                return;
            }

            // Check if newPassword and confirmPassword match
            if (!newPassword.equals(confirmPassword)) {
                mess = "Passwords do not match!";
                request.setAttribute("mess", mess);
                request.getRequestDispatcher("Views/Login/ResetPassword.jsp").forward(request, response);
                return;
            }

            int resetCode;
            try {
                resetCode = (int) session.getAttribute("resetCode");
            } catch (Exception e) {
                mess = "Invalid session. Please request a new password reset.";
                request.setAttribute("mess", mess);
                request.getRequestDispatcher("Views/Login/ResetPassword.jsp").forward(request, response);
                return;
            }

            String userEmail = (String) session.getAttribute("userEmail");
            if (userEmail == null || userEmail.trim().isEmpty()) {
                mess = "Invalid session. Please request a new password reset.";
                request.setAttribute("mess", mess);
                request.getRequestDispatcher("Views/Login/ResetPassword.jsp").forward(request, response);
                return;
            }

            //check if the entered code matches the reset code
            if (Integer.parseInt(code) == resetCode) {
                DAOForgot dao = new DAOForgot();
                Account account = dao.checkAccountForChangePass(userEmail);
                //Check account
                if (account != null) {
                    dao.changePassword(account.getId(), newPassword);
                    mess = "Password changed successfully";
                    request.setAttribute("mess", mess);
//                    request.getRequestDispatcher(request.getContextPath() + "/login").forward(request, response);
//                    response.sendRedirect(request.getContextPath() + "/login");
                    response.sendRedirect(request.getContextPath() + "/login?mess=" + mess);
                } else {
                    mess = "Account not exist";
                    request.getRequestDispatcher("Views/Login/ResetPassword.jsp").forward(request, response);
                }
            } else {
                mess = "Invalid verification code!";
                request.setAttribute("mess", mess);
                request.getRequestDispatcher("Views/Login/ResetPassword.jsp").forward(request, response);
            }
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error in ResetPassword servlet", e);
            mess = "An unexpected error occurred. Please try again.";
            request.setAttribute("mess", mess);
            request.getRequestDispatcher("Views/Login/ResetPassword.jsp").forward(request, response);
        }
    }
}
