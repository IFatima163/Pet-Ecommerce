package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Information {
	public String productinformation(int receiptID)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/petcare","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT products.Name,products.Type FROM receipt,products WHERE receipt.ProductID = products.ID AND receipt.ID = '" + receiptID + "';");

			rs.next();
			String productInformation = " Product Name: " + rs.getString(1) + " Product Type: " + rs.getString(2);
			con.close();
			
			return productInformation;
		} 
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return "";
	}

}
