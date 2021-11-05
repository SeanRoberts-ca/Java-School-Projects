<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile</title>
<style type="text/css">
    <%@include file="style/Style.css" %>
</style>

<script> 
function validate()
{ 
	
	//NOt sure why but this java code won't run
	//under the servlet context. Have decided to
	//leave it in place in case i discover a fix 
     var fullname = document.form.fullname.value;
     var email = document.form.email.value;
     var username = document.form.username.value; 
     var password = document.form.password.value;
     var conpassword= document.form.conpassword.value;
     
     if (fullname==null || fullname=="")
     { 
     alert("Full Name can't be blank"); 
     return false; 
     }
     else if (email==null || email=="")
     { 
     alert("Email can't be blank"); 
     return false; 
     }
     else if (username==null || username=="")
     { 
     alert("Username can't be blank"); 
     return false; 
     }
     else if(oldpassword.length<6)
     { 
     alert("Current Password must be at least 6 characters long."); 
     return false; 
     } 
     else if(password.length<6)
     { 
     alert("Password must be at least 6 characters long."); 
     return false; 
     } 
     else if (password!=conpassword)
     { 
     alert("Confirm Password should match with the Password"); 
     return false; 
     } 
 } 
</script> 
</head>
<body>

<h2>Update Your Account</h2>
    <form name="form" action="ProfileServlet" method="post" onsubmit="return validate()">
    	<input type="hidden" name="userName" value="<%=( request.getAttribute("userName")) %>">
        <table align="center">
        <tr>
        <td align="right" colspan="2" style="color:red;"><%=(request.getAttribute("errMessage") == null) ? "" : request.getAttribute("errMessage")%></td>
         </tr>
         <tr>
         <td>Full Name</td>
         <td><input type="text" name="fullname" value="<%=( request.getAttribute("fullName")) %>" /></td>
         </tr>
         <tr>
         <td>Email</td>
         <td><input type="text" name="email" value="<%=( request.getAttribute("email")) %>" /></td>
         </tr>
         <tr>
         <td>Username</td>
         <td align="left"><%=( request.getAttribute("userName")) %> <small style="font-size:10px;">(cannot be changed.)</small></td>
         </tr>
         <tr>
         <td>Current Password</td>
         <td><input type="password" name="oldpassword" value="" /></td>
         </tr>
         <tr>
         <td>New Password</td>
         <td><input type="password" name="password" value="" /></td>
         </tr>
         <tr>
         <td>Confirm New Password</td>
         <td><input type="password" name="conpassword" value="" /></td>
         </tr>
         <tr>
         <td></td>
         <td align="right"><input type="submit" value="Update Profile"></input></td>
         </tr>
         <tr>
         <td align='right' colspan="2">Not the Correct Account? <a href="Login.jsp">Login Here</a>&nbsp;</td>
         </tr>
         <tr>
         <td align='right' colspan="2">Done Updating Account? <a href="Login.jsp">Logout Here</a></td>
         </tr>
        </table>
    </form>
</body>
</html>