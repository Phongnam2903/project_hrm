/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL.Login;

import DAL.DBContext;
import Models.Account;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author xuxum
 */
public class DAOForgot extends DBContext {

    //change password
    public void changePassword(int id, String newPass) {
        //Hash the password using SHA-256
        byte[] hashedPassword = hashPasswordToBytes(newPass);
        String sql = "UPDATE Account SET [password] = ? WHERE id = ?";

        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setBytes(1, hashedPassword); // Use setBytes to set binary data
            statement.setInt(2, id);
            statement.executeUpdate();
        } catch (SQLException ex) {
            // Handle SQL exception
            ex.printStackTrace();
        }
    }

    private byte[] hashPasswordToBytes(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            return digest.digest(password.getBytes());
        } catch (NoSuchAlgorithmException e) {
            // Handle exception
            e.printStackTrace();
            return null;
        }
    }

    //check Account is exits or not
    public Account checkAccountForChangePass(String emails) {
        String sql = "SELECT * FROM Account WHERE email = ?";

        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, emails);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                Account account = new Account(rs.getInt(1), rs.getString(2),
                        rs.getString(3), rs.getInt(4), rs.getInt(5),
                        rs.getDate(6), rs.getDate(7));
                return account;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOForgot.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static void main(String[] args) {
        DAOForgot dao = new DAOForgot();

        String testEmail = "phongnnhe176274@fpt.edu.vn";
        Account account = dao.checkAccountForChangePass(testEmail);

        if (account != null) {
            System.out.println("User found: " + testEmail);
            int userId = account.getId();
            String newPass = "123";

            dao.changePassword(userId, newPass);
            System.out.println("Password changed successfully for user: " + testEmail);
        } else {
            System.out.println("User not found!");
        }
    }
}
