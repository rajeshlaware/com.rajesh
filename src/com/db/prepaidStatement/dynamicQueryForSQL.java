package com.db.prepaidStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class dynamicQueryForSQL {

	public static void main(String[] args) {
		dynamicQueryForSQL s1= new dynamicQueryForSQL();
		s1.SQL();

	}
	
	public void SQL()
	{
		try {
			
			//step-1 load the driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step-2 setup the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "Rajesh@123");
			
			//step-3 create/prepare the statement
			PreparedStatement p = con.prepareStatement("insert into employee (username,password) values(?,?)");
			p.setString(1, "admin");
			p.setString(2, "guest");
			
			//step-4 result set --send the query to sql
			//p.execute();
			int i = p.executeUpdate();
			System.out.println("Sucessful"+ i);
			
			//Step-5 Close the resources
			con.close();
			p.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
