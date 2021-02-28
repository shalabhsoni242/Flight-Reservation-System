<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	<h2>Passenger Details</h2>
	<h2  style="color: blue;">${sessionScope.message}</h2>
	<h4>You have chosen :</h4>
	<h4 align="center">Flight Details: ${requestScope.selected_details}</h4>
	<h3>Enter Passenger Details</h3>
	<form  method="post">
	
	<div class="container">
	<label for="name"><b>Name</b></label>
    <input type="text" placeholder="Enter Passenger Name" name="name" required>
	
    <label for="email"><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="email" required>
    
    <label for="pno"><b>Phone Number</b></label>
    <input type="text" placeholder="Enter Phone Number" name="pno" maxlength="10" required>
        
    <button type="submit">Enter Details</button>

  </div>
	
		
	</form>
</body>
</html>