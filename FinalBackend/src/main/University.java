package main;

import java.sql.*;

public class University {
	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/petcare","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT customer.Name,customer.Address FROM customerorder,customer WHERE customerorder.CustomerID = customer.ID AND customerorder.ReceiptID = <USER INPUT HERE>");

			while(rs.next())
			{
			System.out.println("Customer Name: " + rs.getString(1) + " Customer Address: " + rs.getString(2));
			}
			con.close();
			} catch(Exception e)
			{
			System.out.println(e);
			}
	}

}
