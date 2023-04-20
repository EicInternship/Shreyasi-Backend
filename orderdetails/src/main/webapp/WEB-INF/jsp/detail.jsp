<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="savedata" method = "post">
	Order Created date and time: <input type ="text" name = "createdAt"><br><br>
	Name: <input type ="text" name = "name"><br><br>
	Email: <input type ="email" name = "email"><br><br>
	Contact No:<input type ="number" name = "contact"><br><br>
	Delivery Address:<input type ="text" name = "DeliveryAdd"><br><br>
	Billing Address:<input type ="text" name = "BillingAdd"><br><br>
	 
	Sub-total: <input type ="number" name = "subtotal"><br><br>
	Shipping: <input type ="text" name = "shipping"><br><br>
	Tax(18%)<input type ="number" name = "tax"><br><br>
	Total: <input type ="number" name = "total"><br><br>
	Seller GST: <input type ="text" name = "sellerGst"><br><br>
	Purchase GST: <input type ="text" name = "purchaseGst"><br><br>
	<input type="submit"  value ="submit">
	
	</form>
</body>
</html>