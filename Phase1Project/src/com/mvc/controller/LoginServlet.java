package com.mvc.controller;
import java.io.IOException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Have included this despite I abandoned its use.
//Still don't have enough knowledge to create and
// destroy sessions an update them properly.
//import javax.servlet.http.HttpSession;

import com.mvc.bean.LoginBean;
import com.mvc.dao.LoginDao;
import com.mvc.util.DBConnection;
 
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
 
	private static final long serialVersionUID = 1L;
	
     public LoginServlet() {
     }

     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


         String fullName = "";
         String email = "";
         String userName = request.getParameter("userName");
         String password = request.getParameter("password");
        
         LoginBean loginBean = new LoginBean();

         loginBean.setUserName(userName);
         loginBean.setPassword(password); 
         
         LoginDao loginDao = new LoginDao();
         
         //Login user on LoginDao.java Page
         String userLogin = loginDao.loginUser(loginBean);
         
         
         if(userLogin.equals("SUCCESS"))
         {
        	 
	         Connection con = null;
	         PreparedStatement preparedStatement = null;         
	         try
	         {
	             
	        	 //get use rdetails for use on profile page.
	        	 con = DBConnection.createConnection();
	             String query = "select fullName, Email, userName, password from User_Registration where userName = ? and password = ?"; 
	             preparedStatement = con.prepareStatement(query);
	             preparedStatement.setString(1, userName);
	             preparedStatement.setString(2, password);
	            
	             ResultSet rs = preparedStatement.executeQuery();
	             
	             if (!rs.next()){
	                 request.setAttribute("errMessage", userLogin);
	                 request.getRequestDispatcher("/Login.jsp").forward(request, response);
		          }else{

		        	  fullName = rs.getString(1); 
		        	  email = rs.getString(2);
		        	  userName = rs.getString(3);
		        	  
		        	//Have included this despite I abandoned its use.
		              //HttpSession session=request.getSession();  
		              //session.setAttribute("userName",userName);
		              
		              //reference only...
		        	  //request.setAttribute("varName", variable);
		        	  //getServletContext().getRequestDispatcher("servlet2").forward(request,response);
		        	  
		        	  //pass details to profile page
		        	  //second query was to get additional details
		        	  //If time permits I will add a related table
		        	  
		        	  request.setAttribute("fullName",fullName);
		        	  request.setAttribute("email",email);
		        	  request.setAttribute("userName",userName);
		              request.getRequestDispatcher("/Profile.jsp").forward(request, response);
		             
		          }
	             
	         }
	         catch(SQLException e)
	         {
	            e.printStackTrace();
	         }
         }
         else   //On Failure, display a meaningful message to the User.
         {
            request.setAttribute("errMessage", userLogin);
            request.getRequestDispatcher("/Login.jsp").forward(request, response);
         }
         
     }
}