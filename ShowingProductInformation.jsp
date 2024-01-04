<%@ page import="main.Information" %>
<%@ page import="main.InformationServiceLocator" %>
<%@ page import="javax.xml.rpc.ServiceException" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>PetCare E-commerce</title>
</head>
<body>
	<h1>Product Information</h1>
	<%
	    //receipt ID from the form
	    String receiptID = request.getParameter("receiptID");
	
	    try {
	        InformationServiceLocator locator = new InformationServiceLocator();
			Information information = locator.getInformation();
	
	        String productInformation = information.getProductInformation(Integer.parseInt(receiptID));
				
	        productInformation = productInformation.replace("Product Type:", "<br/>Product Type:");
                    
	        
	        out.println("<p>" + productInformation + "</p>");
	
	    } catch (ServiceException e) {
	        e.printStackTrace();
	    }
	%>
</body>
</html>


