package com.jdbc;
import java .sql.*;

public class Main {

	public static void main(String[] args) {
		
	
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String username = "root";
		String password = "Mishra12345#";
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch(Exception e)
		{
			e.printStackTrace();
		}
        
		try {
			Connection con = DriverManager.getConnection(url, username, password);
		     System.out.println("connection is done..");
			Statement statement = con.createStatement();
			//query
			String query = "select * from student";
			
			//result
			ResultSet resultset = statement.executeQuery(query);
			while(resultset.next()){
				int id = resultset.getInt("id");
				String name = resultset.getString("name");
				int age = resultset.getInt("age");
				
				System.out.println("student id= "+id);
				System.out.println("student name= "+name);
				System.out.println("student age= "+age);
			}
		} 
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}

}
