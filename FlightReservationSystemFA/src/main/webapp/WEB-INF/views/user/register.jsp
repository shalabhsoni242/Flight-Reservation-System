<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%--import spring suppiled JSP tag lib for URL rewriting --%>
	<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {font-family: Arial, Helvetica, sans-serif;}
form {border: 3px solid #f1f1f1;}

input[type=text], input[type=password] {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}

button {
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
}

button:hover {
  opacity: 0.8;
}



.imgcontainer {
  text-align: center;
  margin: 24px 0 12px 0;
}

img.avatar {
  width: 40%;
  border-radius: 50%;
}

.container {
  padding: 16px;
}

span.psw {
  float: right;
  padding-top: 16px;
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
  span.psw {
     display: block;
     float: none;
  }

}
</style>
</head>
<body>
	<h2>Registration Form</h2>
	<h5 align="center" style="color: red;">${requestScope.msg}</h5>
	<form method="post">
  		<div class="imgcontainer">
    		<img src="img_avatar2.png" alt="Avatar" class="avatar">
  		</div>

  <div class="container">
  	<label for="name"><b>Name</b></label>
    <input type="text" placeholder="Enter Name" name="name" required>
    <label for="email"><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="email" required>
    <label for="password"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" required>
    <label for="cpassword"><b>Confirm Password</b></label>
    <input type="password" placeholder="Re Enter Password" name="cpassword" required>
        
    <button type="submit">Register</button>
    <!-- <button type="submit">Back</button> -->
    <a href="<spring:url value='/user/login'/>">Back</a>

  </div>

 
</form>
</body>
</html>