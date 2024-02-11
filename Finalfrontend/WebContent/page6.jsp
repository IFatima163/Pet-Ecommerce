<%@ page import="main.Information2" %>
<%@ page import="main.Information2ServiceLocator" %>
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
	<h1>Seller Information</h1>
	<%
	    
	    String sellerID = request.getParameter("sellerID");
	
	    try {
	        Information2ServiceLocator locator = new Information2ServiceLocator();
			Information2 information = locator.getInformation2();
	
	        String sellerInformation = information.sellerInformation(Integer.parseInt(sellerID));
				
	        sellerInformation = sellerInformation.replace("Product Type:", "<br/>Product Type:");
                    
	        
	        out.println("<p>" + sellerInformation + "</p>");
	
	    } catch (ServiceException e) {
	        e.printStackTrace();
	    }
	%>
</body>
</html>