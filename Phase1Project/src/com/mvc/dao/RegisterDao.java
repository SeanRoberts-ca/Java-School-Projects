package com.mvc.dao;
 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mvc.bean.RegisterBean;
import com.mvc.util.DBConnection;

public class RegisterDao { 
     public String registerUser(RegisterBean registerBean)
     {
         String fullName = registerBean.getFullName();
         String email = registerBean.getEmail();
         String userName = registerBean.getUserName();
         String password = registerBean.getPassword();
         
         Connection con = null;
         PreparedStatement preparedStatement = null;
         
         
         try
         {
             con = DBConnection.createConnection();
             String query = "select Email, userName from User_Registration where userName = ? or Email = ?";
             preparedStatement = con.prepareStatement(query); 
             preparedStatement.setString(1, userName);
             preparedStatement.setString(2, email);
             ResultSet rs = preparedStatement.executeQuery();

             
             while(rs.next()){
            	 return "Username or Email Address Already Exists";  // On failure, send a message from here. 
             }
             
                 query = "insert into user_registration(fullName,Email,userName,password) values (?,?,?,?)"; 
                 preparedStatement = con.prepareStatement(query); 
                 preparedStatement.setString(1, fullName);
                 preparedStatement.setString(2, email);
                 preparedStatement.setString(3, userName);
                 preparedStatement.setString(4, password);
                 int i= preparedStatement.executeUpdate();
                 if (i!=0) {
                	 return "SUCCESS";
                 }
             
             
         }
         catch(SQLException e)
         {
            e.printStackTrace();
         }
    
         return "Oops.. Something went wrong there..!";  // On failure, send a message from here.
     }
}