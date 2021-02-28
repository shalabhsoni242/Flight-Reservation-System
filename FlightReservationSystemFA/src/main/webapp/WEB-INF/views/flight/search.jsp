<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%--import spring supplied JSP tag lib --%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
#customers {
  font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 50%;
  margin : auto;
}

#customers td, #customers th {
  border: 1px solid #ddd;
  padding: 8px;
}

#customers tr:nth-child(even){background-color: #f2f2f2;}

#customers tr:hover {background-color: #ddd;}

#customers th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #4CAF50;
  color: white;
}
.button {
  background-color: #4CAF50; /* Green */
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
  -webkit-transition-duration: 0.4s; /* Safari */
  transition-duration: 0.4s;
  
  }

.button2:hover {
  box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24),0 17px 50px 0 rgba(0,0,0,0.19);
}
</style>
</head>
<body>
	<h2>Search Your Flight</h2>
	<h3  style="color: blue;">${sessionScope.message}</h3>
	
	<form  method="post">
		<table id="customers">
			<tr>
				<td>From</td>
				<td>
					<select name = "depCity">
						<c:forEach var="v" items="${requestScope.all_flightD}">
							<option value = "${v.depCity}">${v.depCity}</option>
						</c:forEach>
						 
					</select>
				</td>
			</tr>
			<tr>
				<td>To</td>
				<td>
					<select name = "arrivalCity">
						<c:forEach var="v" items="${requestScope.all_flightD}">
							<option value = "${v.arrivalCity}">${v.arrivalCity}</option>
						</c:forEach>
						 
					</select>
				</td>
			</tr>
			<tr>
				<td>Departure date</td>
				<td><input type="date" name="depDate" /></td>
			</tr>
			
		</table>
		<input type="submit" value="Search Flight" class="button button2" />
	</form>
</body>
</html>