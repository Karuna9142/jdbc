package com.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcQuery {
	
	public void useDb()
	{
		try {
			String url ="jdbc:mysql://localhost:3306/School";
			String username = "root";
			String password = "Mishra12345#";
			
			Connection con = DriverManager.getConnection(url, username, password);
			Statement stmt = con.createStatement();
			String query = "use school";
			stmt.execute(query);
			System.out.println("School database");
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void createTable()
	{
		try {
			String url ="jdbc:mysql://localhost:3306/School";
			String username = "root";
			String password = "Mishra12345#";
			
			Connection con = DriverManager.getConnection(url, username, password);
			Statement stmt = con.createStatement();
			String query =   "create table Student(id int auto_increment primary key, name varchar(20), age int not null, Address varchar(20))";
			stmt.execute(query);
			System.out.println("Table created successfully!");
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void insertData()
	{
		try {
			String url ="jdbc:mysql://localhost:3306/School";
			String username = "root";
			String password = "Mishra12345#";
			
			Connection con = DriverManager.getConnection(url, username, password);
			Statement stmt = con.createStatement();
			String query =   "insert into student(name, age, Address)Values('Karuna',22,'Ranchi'),('Ritika',22,'Ranchi'),('Neha',23, 'Hzaribag'),('Tara',24,'Gumla')";
			stmt.execute(query);
			System.out.println("data inserted successfully!");
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void updateData()
	{
		try {
			String url ="jdbc:mysql://localhost:3306/School";
			String username = "root";
			String password = "Mishra12345#";
			
			Connection con = DriverManager.getConnection(url, username, password);
			Statement stmt = con.createStatement();
			String query =   "Update Student set name = 'Priya' where age = 24";
			stmt.execute(query);
			System.out.println("data updated successfully!");
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public void deleteData()
	{
		try {
			String url ="jdbc:mysql://localhost:3306/School";
			String username = "root";
			String password = "Mishra12345#";
			
			Connection con = DriverManager.getConnection(url, username, password);
			Statement stmt = con.createStatement();
			String query =   "Delete  from Student where age = 23";
			stmt.execute(query);
			System.out.println("data Deleted successfully!");
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		JdbcQuery db = new JdbcQuery();
		//db.useDb();
		//db.createTable();
		//db.insertData();
		//db.updateData();
		db.deleteData();
	}

}
