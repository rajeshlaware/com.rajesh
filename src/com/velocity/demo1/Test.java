package com.velocity.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {
		
	public static void main(String[] args) {
		
		try {
			String sql = "insert into user (lastName,firstName,address,city,salary)"
					+ "values('pawar','ram','sangavi','pune',5000)";
			//step-1 load the driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Step-2 Establish the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "Rajesh@123");
			
			//Step-3 create the statement
			
			Statement statement = con.createStatement();
			
			//Step-4 submitt query
			statement.execute(sql);
			System.out.println("Insertion successfully...");
			
			//Step-7 resources close
			con.close();
			statement.close(); 
	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
