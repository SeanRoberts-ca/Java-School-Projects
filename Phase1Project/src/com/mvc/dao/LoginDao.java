package com.mvc.dao;
 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mvc.bean.LoginBean;
import com.mvc.util.DBConnection;

public class LoginDao { 
     public String loginUser(LoginBean loginBean)
     {

    	 		//get values from bean file.
    	 		String userName = loginBean.getUserName();
    	 		String password = loginBean.getPassword();
	         
	         Connection con = null;
	         PreparedStatement preparedStatement = null;  
	         
	         try
	         {
	        	 //connect to db
	             con = DBConnection.createConnection();
	             String query = "select userName, password from User_Registration where userName = ? and password = ?"; //check for valid 'USER'
	             //prepare statement to prvent injection attacks.
	             preparedStatement = con.prepareStatement(query); //Making use of prepared statements here to get a bunch of data
	             preparedStatement.setString(1, userName);
	             preparedStatement.setString(2, password);
	            
	             //run query.
	             ResultSet rs = preparedStatement.executeQuery();
	             
	             //test for record
	             if (!rs.next()){
	            	 //no record found
		             return "Login Failed";
		          }else{
		        	 //user found
		            return "SUCCESS";
		          }
	             
	         }
	         catch(SQLException e)
	         {
	            e.printStackTrace();
	         }
	         
			return "Login Failed";
			
     }
}