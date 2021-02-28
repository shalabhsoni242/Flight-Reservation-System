<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%--import spring supplied JSP tag lib --%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <style>
  	a:link, a:visited {
  		background-color: #f44336;
  		color: white;
  		padding: 14px 25px;
  		text-align: center;
  		text-decoration: none;
  		display: inline-block;
	}

	a:hover, a:active {
  		background-color: red;
	}
  </style>
</head>
<body>
	<div class="container">
  		<div class="jumbotron">
   			<h1>Thank You...</h1>      
    		<p>Please Do visit again...</p>
  		</div>
  		<h3>${requestScope.status}</h3>
		<h3>${requestScope.reservation_details}</h3>
		<h4><a href="<spring:url value='/user/login' />">Logout</a></h4>    
	</div>

	
</body>
</html>