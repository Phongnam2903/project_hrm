package DAL.Login;

import DAL.DBContext;
import Models.Account;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAOLogin extends DBContext {

    public Account loginUser(String username, String password) {
        String sql = "SELECT * FROM Account WHERE email = ? AND password = ?";
        Account acc = null;

        try {
            // Hash the input password using SHA-256 and convert to binary format
            byte[] hashedPasswordBytes = hashPasswordToBytes(password);

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, username);
            statement.setBytes(2, hashedPasswordBytes);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                acc = new Account(rs.getInt(1), rs.getString(2),
                        rs.getString(3), rs.getInt(4),
                        rs.getInt(5), rs.getDate(6), rs.getDate(7));
            }
        } catch (SQLException | NoSuchAlgorithmException ex) {
            Logger.getLogger(DAOLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return acc;
    }

    private byte[] hashPasswordToBytes(String password) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        return md.digest(password.getBytes());
    }

    public static void main(String[] args) {
        DAOLogin login = new DAOLogin();
        String testEmail = "phongnnhe176274@fpt.edu.vn";
        String testPassword = "admin";
        Account acc = login.loginUser(testEmail, testPassword);
        if (acc != null) {
            System.out.println("Login successful");
            System.out.println("UserId: " + acc.getId());
            System.out.println("Role: " + acc.getRoleId());
        } else {
            System.out.println("Login Failed!");
        }
    }
}
