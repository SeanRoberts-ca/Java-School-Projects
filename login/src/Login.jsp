<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>

<style type="text/css">
    <%@include file="style/Style.css" %>
</style>

<script> 
function validate()
{ 


     var username = document.form.username.value; 
     var password = document.form.password.value;

     
     if (username==null || username=="")
     { 
     alert("Username can't be blank"); 
     return false; 
     }
     else if (password==null || password=="")
     { 
  	 alert("Password can't be blank"); 
     return false; 
     } 
 } 
</script> 
</head>
<body>
<h2>Enter Details </h2>
    <form name="form" action="LoginServlet" method="post" onsubmit="return validate()">
        <table align="center">
         <tr>
         <td>Username</td>
         <td><input type="text" name="username" /></td>
         </tr>
         <tr>
         <td>Password</td>
         <td><input type="password" name="password" /></td>
         </tr>
         <tr>
         <td><%=(request.getAttribute("errMessage") == null) ? ""
         : request.getAttribute("errMessage")%></td>
         </tr>
         <tr>
         <td></td>
         <td><input type="submit" value="Register"></input><input
         type="reset" value="Reset"></input></td>
         </tr>
        </table>
    </form>
</body>
</html>