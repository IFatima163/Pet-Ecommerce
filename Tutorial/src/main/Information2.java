package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Information2 {
	public String SellerInformation(int sellerID)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/petcare","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT products.Name FROM seller,products WHERE products.ID = seller.ProductID AND seller.ID = '" + sellerID + "';");

			rs.next();
			String sellerInformation = " Product Name: " + rs.getString(1);
			con.close();
			
			return sellerInformation;
		} 
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return "";
	}
}
