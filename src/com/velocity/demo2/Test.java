package com.velocity.demo2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		Test s1= new Test();
		s1.SQL();
	

	}
	
	public void SQL()
	{
		try {
			String sql= "insert into user (lastName,firstName,address,city,salary)" +
					"values ('laware','rajesh','Rahata','khadkewake','50000')";
			
			//step-1 load the driver class---Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Step-2  Create the connection bet the client and DB
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user1", "root", "Rajesh@123");
			
			//Step-3  Create the statement object --to send the query to SQL
			Statement statement = con.createStatement();
			
			//step-4 result set -- to send the sql query
			statement.execute(sql);
			System.out.println("Sucessfull");
			
			//step-5 Close the connection
			con.close();
			statement.close();
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
	}

}
