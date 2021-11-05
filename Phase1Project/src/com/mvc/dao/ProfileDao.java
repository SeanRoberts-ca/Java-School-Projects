package com.mvc.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mvc.bean.ProfileBean;
import com.mvc.util.DBConnection;

public class ProfileDao{ 
     public String updateUser(ProfileBean profileBean){

    	//get values from bean file.
         String fullName = profileBean.getFullName();
         String email = profileBean.getEmail();
         String userName = profileBean.getUserName();
         String password =profileBean.getPassword();
         String oldpassword =profileBean.getOldPassword();

         Connection con = null;
         PreparedStatement preparedStatement = null; 

         try
         {
        	 //connect to db
             con = DBConnection.createConnection();
             String query = "select userName from User_Registration where userName = ? and password = ?";
             preparedStatement = con.prepareStatement(query); 
             preparedStatement.setString(1, userName);
             preparedStatement.setString(2, oldpassword);
             //run query
             ResultSet rs = preparedStatement.executeQuery();
             if (!rs.next()){
            	 return "Account Not Found, try again.";  // On failure, send a message from here. 
	          }
        	 //connect to db
             con = DBConnection.createConnection();
             query = "select email from User_Registration where email = ? and userName <> ? and password <> ?";
             preparedStatement = con.prepareStatement(query); 
             preparedStatement.setString(1, email);
             preparedStatement.setString(2, userName);
             preparedStatement.setString(3, oldpassword);
             //run query
             rs = preparedStatement.executeQuery();
             if (rs.next()){
            	 return "Email address is already in use.";  // On failure, send a message from here. 
	          }
         }//End Try
         catch(SQLException e)
         {
            e.printStackTrace();
         }  
 
             
         try
         {
        	 //account found update profile
		     con = DBConnection.createConnection();
		     preparedStatement=con.prepareStatement("update user_registration set fullName = ?, Email = ?, password = ? where userName = ? and password = ?");  
			 preparedStatement.setString(1, fullName);
			 preparedStatement.setString(2, email);
			 preparedStatement.setString(3, password);
			 preparedStatement.setString(4, userName);
			 preparedStatement.setString(5, oldpassword);
			 int i= preparedStatement.executeUpdate();
			 if (i!=0) {  //Just to ensure data has been updated in the database
				 return "Account Updated!";
				 
			 }else {
				 return "Failed to update Account!";  // On failure, send a message from here. 
			 }
         }//End Try
         catch(SQLException e)
         {
            e.printStackTrace();
         }
     
         return "Oops.. Something went wrong there..!";  // On failure, send a message from here.
     }
}