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
    
    // Intializing Database connection required resource data
    private static final String driverName = "com.mydql.jdbc.Driver";
    private static final String url = "jdbc:mysql:localhost:3306/login_db";
    private static final String username = "root";
    private static final String password = "123";
    
    /*
    getConnection method used to release database connection object
    */
    public static Connection getConnection(){
        
        try{
           // Get new instance of Driver class
        Class.forName(driverName).newInstance();
        
        // Initialize sql Connection object.
        Connection conn = DriverManager.getConnection(url, username, password);
        
        return conn;
        }catch(Exception ex){
            
            ex.printStackTrace();
        }
        return null;
    }
    
    
}
