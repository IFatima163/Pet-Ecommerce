package main;

import java.sql.*;
public class Laiba {

	public String getSellerInformation(int ID)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/petcare","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT products.Name FROM seller,products WHERE products.ID = seller.ProductID AND seller.Name = '" + ID + "';");

			rs.next();
			String sellerInformation = "Seller Name: " + rs.getString(1);
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
