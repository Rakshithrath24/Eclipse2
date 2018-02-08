package com.mindtree.eai;
import java.sql.*;

public class Mainclass 
{

	public static void main(String[] args) 
	{
		try  
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo","root","Welcome123");
			Statement mySt = myConn.createStatement();
			ResultSet rs = mySt.executeQuery("Select * from Employee");
			while(rs.next())
			{
				System.out.println(rs.getString("First_name")+" "+rs.getString("Last_name"));
			}
		}
		catch(Exception exc)
		{
			exc.printStackTrace();
		}

	}

}
