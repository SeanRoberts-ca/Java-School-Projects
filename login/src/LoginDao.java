package com.mvc.dao;
 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mvc.bean.RegisterBean;
import com.mvc.util.DBConnection;
 
public class LoginDao { 
     public String loginUser(LoginBean loginBean)
     {

         String userName = loginBean.getUserName();
         String password = loginBean.getPassword();
         
         Connection con = null;
         PreparedStatement preparedStatement = null;         
         try
         {
             con = DBConnection.createConnection();
             String query = "select userName, password from user_registration where userName = ? & password = ?"; //check for valid 'USER'
             preparedStatement = con.prepareStatement(query); //Making use of prepared statements here to get a bunch of data
             preparedStatement.setString(1, userName);
             preparedStatement.setString(2, password);
             
             ResultSet rs = preparedStatement.executeQuery();
             
             if (!rs.next()){
            	  return "Login Failed";
            	}else{
            	  return "SUCESS";
            	}
         }
         catch(SQLException e)
         {
            e.printStackTrace();
         }
     }
}