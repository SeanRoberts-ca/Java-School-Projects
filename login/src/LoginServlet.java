package com.mvc.controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import com.mvc.bean.RegisterBean;
import com.mvc.dao.RegisterDao;
 
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
 
	private static final long serialVersionUID = 1L;
	
     public LoginServlet() {
     }
 
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Copying all the input parameters in to local variables
         String userName = request.getParameter("username");
         String password = request.getParameter("password");
         
         LoginBean loginBean = new LoginBean();
        //Using Java Beans - An easiest way to play with group of related data
         loginBean.setUserName(userName);
         loginBean.setPassword(password); 
         
         LoginDao loginDao = new LoginDao();
         
        //The core Logic of the Registration application is present here. We are going to insert user data in to the database.
         String userRegistered = loginDao.loginUser(loginBean);
         
         if(userlogin.equals("SUCCESS"))   //On success, you can display a message to user on Home page
         {
            request.getRequestDispatcher("/Member.jsp").forward(request, response);
         }
         else   //On Failure, display a meaningful message to the User.
         {
            request.setAttribute("errMessage", userLogin);
            request.getRequestDispatcher("/Login.jsp").forward(request, response);
         }
     }
}