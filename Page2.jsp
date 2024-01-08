
<%@ page import="main.Sunbla" %>
<%@ page import="main.SunblaServiceLocator" %>
<%@ page import="javax.xml.rpc.ServiceException" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Customer Information</h1>
	<%
	    //receipt ID from the form
	    String receiptID = request.getParameter("receiptID");
	
	    try {
	        SunblaServiceLocator locator = new SunblaServiceLocator();
			Sunbla ss = locator.getSunbla();
	
	        String customerInformation = ss.getProductInformation(Integer.parseInt(receiptID));
				
	        customerInformation = customerInformation.replace("Customer Name:", "<br/>Customer Address:");
                    
	        
	        out.println("<p>" + customerInformation + "</p>");
	
	    } catch (ServiceException e) {
	        e.printStackTrace();
	    }
	%>
</body>
</html>