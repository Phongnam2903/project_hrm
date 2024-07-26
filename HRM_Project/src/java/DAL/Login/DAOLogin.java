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
            // Hash the input password using SHA-256
            String hashedPassword = hashPassword(password);

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, hashedPassword);
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

    private String hashPassword(String password) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hashedPasswordBytes = md.digest(password.getBytes());
        StringBuilder sb = new StringBuilder();
        for (byte b : hashedPasswordBytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
}
