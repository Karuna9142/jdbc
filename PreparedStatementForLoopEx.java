package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedStatementForLoopEx {

	public static void main(String[] args) {
		

		try 
		{
			Scanner sc = new Scanner(System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root","Mishra12345#");
			String q1 = "create table Customer(cid int not null, c_age int(2), name varchar(20))";
			PreparedStatement pst = con.prepareStatement(q1);
			
			pst.execute();
			System.out.println("table created successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
