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
	<h2>Make Your Payment</h2>
	<h3>${requestScope.reservation_details}</h3>
	<form  method="post">
		<div class="container">
			<label for="ccn"><b>Card Number</b></label>
    		<input type="text" name="cardNo" id="ccn" type="tel" inputmode="numeric" pattern="[0-9\s]{13,19}" autocomplete="cc-number" maxlength="19" placeholder="xxxx xxxx xxxx xxxx" required>
	
    		<label for="name"><b>Name</b></label>
    		<input type="text" placeholder="Enter Name On Your Card" name="name" required>
    
    		<label for="expDate"><b>Expiry date</b></label>
    		<input type="date" placeholder="Expiry date" name="expDate" required><br><br>
    		
    		<label for="cvv"><b>CVV</b></label>
    		<input type="password" placeholder="Expiry CVV" name="cvv" maxlength="3" required>
        
    		<button type="submit">Enter Details</button>

  		</div>	
		
	</form>
</body>
</html>