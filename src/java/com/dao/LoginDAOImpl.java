/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Esoft
 */
public class LoginDAOImpl {

    public String login(String username, String password) {
        Connection conn = DBConnection.getConnection();
        if (conn != null) {
            String loginQuery = "SELECT * FROM login WHERE username=? AND password=?";

            try {
                PreparedStatement pstmt = conn.prepareStatement(loginQuery);
                pstmt.setString(1, username);
                pstmt.setString(2, password);
                ResultSet rs = pstmt.executeQuery();
                if (rs.next()) {
                    String userType = rs.getString(2);

                    return "success-" + userType;
                } else {
                    return "invalid";
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return null;
    }

}
