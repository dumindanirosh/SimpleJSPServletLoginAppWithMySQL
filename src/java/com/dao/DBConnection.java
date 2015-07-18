/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Esoft
 */
public class DBConnection {
    
    private static final String driverName = "com.mydql.jdbc.Driver";
    private static final String url = "jdbc:mysql:192.168.0.119:3306/login_db";
    private static final String username = "root";
    private static final String password = "1234";
    
    public static Connection getConnection(){
        
        try{
        Class.forName(driverName).newInstance();
        
        Connection conn = DriverManager.getConnection(url, username, password);
        
        return conn;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    
    
}
