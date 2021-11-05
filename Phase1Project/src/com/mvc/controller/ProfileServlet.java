package com.mvc.controller;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.bean.ProfileBean;
import com.mvc.dao.ProfileDao;
 
@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet {
 
	private static final long serialVersionUID = 1L;
	
     public ProfileServlet() {
     }
 
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    	 
    	 // This section of code prevents the word null being displayed
    	 //in the name and email address field should the user delete it.
    	 //instead I show an empty field and provide an error message.
    	 
    	 String fullName = "";
    	 String email = "";
    	
    	 if(request.getParameter("fullname") != "" && request.getParameter("fullname") != null) {
    		 fullName = request.getParameter("fullname");
    	 }
    	 if(request.getParameter("email") != "" && request.getParameter("email") != null) {
    		 email = request.getParameter("email");
    	 }
    	 
    	//get form values
    	 
         String userName = request.getParameter("userName");
         String password = request.getParameter("password");
         String oldpassword = request.getParameter("oldpassword");
         String conpassword = request.getParameter("conpassword");
         
         ProfileBean profileBean = new ProfileBean();
         
         //set form values in the bean obj
         profileBean.setFullName(fullName);
         profileBean.setEmail(email);
         profileBean.setUserName(userName);
         profileBean.setPassword(password); 
         profileBean.setOldPassword(oldpassword); 
         profileBean.setConPassword(conpassword); 

         //update user on DAO page...
         ProfileDao profileDao = new ProfileDao();
         
         String userUpdated;
         
         //update results
         userUpdated = profileDao.updateUser(profileBean);

         //server-side validation of form values.
         if (profileBean.getPassword().equals(profileBean.getConPassword())) {
        	String tmpPass = profileBean.getPassword();
        	String tempConPass = profileBean.getConPassword();
        	 
        	 if((tmpPass == null || tmpPass == "") || (tempConPass == null || tempConPass == "")) {
        		 userUpdated = "New Passwords must not be empty."; 
        	 }
        	 if(tmpPass.length() < 6) {
        		 userUpdated = "New Passwords must be at least 6 Characters Long."; 
        	 }
         }else {
        	 userUpdated = "New Passwords did not match."; 
         }
    	 if((fullName == null || fullName == "") || (email == null || email == "")) {
    		 userUpdated = "All fields are required."; 
    	 }
    	 if(userUpdated.equals("New Passwords must be at least 6 Characters Long.")) {
   	  	  request.setAttribute("errMessage", userUpdated);
	       	  request.setAttribute("fullName",fullName);
	       	  request.setAttribute("email",email);
	       	  request.setAttribute("userName",userName);
	       	  request.getRequestDispatcher("/Profile.jsp").forward(request, response);
    	 }
    	 else if(userUpdated.equals("Email address is already in use.")) {
    	  	  request.setAttribute("errMessage", userUpdated);
	       	  request.setAttribute("fullName",fullName);
	       	  request.setAttribute("email","");
	       	  request.setAttribute("userName",userName);
	       	  request.getRequestDispatcher("/Profile.jsp").forward(request, response);
    	 }
    	 else if(userUpdated.equals("All fields are required.")) {
     	  	  request.setAttribute("errMessage", userUpdated);
	       	  request.setAttribute("fullName",fullName);
	       	  request.setAttribute("email",email);
	       	  request.setAttribute("userName",userName);
	       	  request.getRequestDispatcher("/Profile.jsp").forward(request, response);
        }
         else if(userUpdated.equals("New Passwords must not be empty.")) {
      	  	  request.setAttribute("errMessage", userUpdated);
	       	  request.setAttribute("fullName",fullName);
	       	  request.setAttribute("email",email);
	       	  request.setAttribute("userName",userName);
	       	  request.getRequestDispatcher("/Profile.jsp").forward(request, response);
         }
         else if(userUpdated.equals("New Passwords did not match.")) {
       	  	  request.setAttribute("errMessage", userUpdated);
	       	  request.setAttribute("fullName",fullName);
	       	  request.setAttribute("email",email);
	       	  request.setAttribute("userName",userName);
	       	  request.getRequestDispatcher("/Profile.jsp").forward(request, response);
         }
         else if(userUpdated.equals("Account Not Found, try again.")) {
              request.setAttribute("errMessage", userUpdated);
	       	  request.setAttribute("fullName",fullName);
	       	  request.setAttribute("email",email);
	       	  request.setAttribute("userName",userName);
              request.getRequestDispatcher("/Profile.jsp").forward(request, response);
              
         }else if(userUpdated.equals("Account Updated!"))
         {
        	  request.setAttribute("errMessage", userUpdated);
	       	  request.setAttribute("fullName",fullName);
	       	  request.setAttribute("email",email);
	       	  request.setAttribute("userName",userName);
              request.getRequestDispatcher("/Profile.jsp").forward(request, response);
         }
         else
         {
            request.setAttribute("errMessage", "Unhandled error occured. Try logging in again.");
            request.getRequestDispatcher("/Login.jsp").forward(request, response);
         }
     }
}