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

    
    //get the loging info that user provide and validate it
    public String login(String username, String password) {
        
        //make DataBase connection object 
        Connection conn = DBConnection.getConnection();
        
        //make sure connection is work correctly by using connection object
        //if connection is valid
        if (conn != null) {
            
            //make  a query to  execute and check that user provide data are valid 
            //and put that out put result in to string variable
            String loginQuery = "SELECT * FROM login WHERE username=? AND password=?";

            
            try {
                //make a object to handle that query result variable
                PreparedStatement pstmt = conn.prepareStatement(loginQuery);
                
                //put the checking values that user provide  to validate by using were condition
                pstmt.setString(1, username);
                pstmt.setString(2, password);
                
                //execute the query to get result
                ResultSet rs = pstmt.executeQuery();
                
                //if result is valid 
                if (rs.next()) {
                    
                    //get usertype of that correct result and put it into the userType variable
                    String userType = rs.getString(2);

                    //return out put as "success" 
                    return "success-" + userType;
                    
                 //if result is invalid 
                } else {
                    //return out put as "invalid" 
                    return "invalid";
                }
                
                
                //if catching some errors
            } catch (Exception ex) {
                //print that errors
                ex.printStackTrace();
            }
        }
        
        //if connecton is not valid
        return null;
    }

}
