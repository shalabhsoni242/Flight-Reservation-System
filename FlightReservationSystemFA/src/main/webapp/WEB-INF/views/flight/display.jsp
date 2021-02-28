<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%--import JSTL supplied core tag lib --%>
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
  width: 100%;
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
	
</style>
</head>
<body>
<h5>${requestScope.message}</h5>
	<table id="customers">
		<caption>Flight Details</caption>
		<thead>
			<tr>
				<th>Airline</th>
				<th>Departure City</th>
				<th>Arrival City</th>
				<th>Departure time</th>
				<th>Option</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="v" items="${requestScope.flight_details}">
				<tr>
					<td>${v.flightName}</td>
					<td>${v.depCity}</td>
					<td>${v.arrivalCity}</td> 
					<td>${v.depTime}</td>
					<td><a href="<spring:url value='/passenger/details?fid=${v.id}' />">select</a></td>					
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="<spring:url value='/flight/search'/>">Back</a>
</body>
</html>