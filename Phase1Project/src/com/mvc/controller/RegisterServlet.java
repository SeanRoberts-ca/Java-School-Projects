package com.mvc.controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
 
import com.mvc.bean.RegisterBean;
import com.mvc.dao.RegisterDao;
 
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
 
	private static final long serialVersionUID = 1L;
	
     public RegisterServlet() {
     }
 
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Copying all the input parameters in to local variables
         String fullName = request.getParameter("fullname");
         String email = request.getParameter("email");
         String userName = request.getParameter("username");
         String password = request.getParameter("password");
         
         RegisterBean registerBean = new RegisterBean();
        //Using Java Beans - An easiest way to play with group of related data
         registerBean.setFullName(fullName);
         registerBean.setEmail(email);
         registerBean.setUserName(userName);
         registerBean.setPassword(password);

         RegisterDao registerDao = new RegisterDao();
         
        //The core Logic of the Registration application is present here. We are going to insert user data in to the database.
         String userRegistered = registerDao.registerUser(registerBean);

         if(userRegistered.equals("Username or Email Address Already Exists")) {
             request.setAttribute("errMessage", userRegistered);
             request.getRequestDispatcher("/Login.jsp").forward(request, response);             
         }else if(userRegistered.equals("SUCCESS"))   //On success, you can display a message to user on Profile page
         {
       	  	  request.setAttribute("errMessage", "Account Created");
	       	  request.setAttribute("fullName",fullName);
	       	  request.setAttribute("email",email);
	       	  request.setAttribute("userName",userName);
              request.getRequestDispatcher("/Profile.jsp").forward(request, response);
         }
         else   //On Failure, display a meaningful message to the User.
         {
            request.setAttribute("errMessage", userRegistered);
            request.getRequestDispatcher("/Register.jsp").forward(request, response);
         }
     }


}