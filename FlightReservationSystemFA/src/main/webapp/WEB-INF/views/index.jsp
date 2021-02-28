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
/* Style the header */
.header {
  background-color: #f1f1f1;
  padding: 20px;
  text-align: center;
}
.topnav {
  overflow: hidden;
  background-color: #333;
}

/* Style the topnav links */
.topnav a {
  float: left;
  display: block;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

/* Change color on hover */
.topnav a:hover {
  background-color: #ddd;
  color: black;
}
div.gallery {
  margin: 20px;
  border: 1px solid #ccc;
  float: left;
  width: 650px;
}

div.gallery:hover {
  border: 1px solid #777;
}

div.gallery img {
  width: 100%;
  height: auto;
}

div.desc {
  padding: 15px;
  text-align: center;
}
</style>
</head>
<body>
<div class="header">
  <h1>Flight Reservation System</h1>
  <h3>Stop Searching. Start Traveling.</h3>
</div>
<div class="topnav">
  <a href="<spring:url value='/user/login'/>">User Login</a>
  <a href="<spring:url value='/user/register'/>">User Registration</a>
 </div>
<div class="gallery">
  
    <img src="https://th.bing.com/th/id/R509f0cad638dc09d72bb1ed63c71490a?rik=umI2rBOA23d1Ag&riu=http%3a%2f%2fwonderfulengineering.com%2fwp-content%2fuploads%2f2014%2f05%2fairplane-wallpaper-1.jpg&ehk=L2daLCtEHRtyyWTdrRpgn9tudRO2bVoXXoo%2b0wbHpxs%3d&risl=1&pid=ImgRaw" alt="Cinque Terre" width="800" height="800">
 
  <div class="desc">Amazing journeys. Every day.</div>
</div>

<div class="gallery">
  
    <img src="https://th.bing.com/th/id/R7ecfcd8bffa29443e811debdb5e08c68?rik=4JP3kqnYxKv52Q&riu=http%3a%2f%2fwww.healthyhearing.com%2fuploads%2fimages%2fAirplanesEarPain.jpg&ehk=XSMfpS7e6DJwz793Axb2hXfsYfaNW4H8yt%2bsH5HNnq4%3d&risl=&pid=ImgRaw" alt="Forest" width="800" height="800">
  
  <div class="desc">Above all, we care!</div>
</div>

<div class="gallery">
  
    <img src="https://media.istockphoto.com/photos/the-view-from-an-airplane-window-overlooking-the-ocean-picture-id464645132?k=6&m=464645132&s=170667a&w=0&h=k4gt9Sl1zevjivnnVPTCPDoTmlcsTpiefZuL3qbV2HI=" alt="Northern Lights" width="800" height="800">
  
  <div class="desc">A Symbol of Freedom.</div>
</div>

<div class="gallery">
  
    <img src="https://media.istockphoto.com/photos/parked-airplane-picture-id143919964?k=6&m=143919964&s=170667a&w=0&h=ZnTABLHae66QeoAIxWG3bbNCS0J7Y15vDKzhTflmxAA=" alt="Mountains" width="800" height="800">
  
  <div class="desc">A great way to fly.</div>
</div>
</body>
</html>