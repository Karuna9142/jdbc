package com.insert;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class InsertQueryEx {
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
     Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root", "Mishra12345#");
		
		String query = "Insert into Student(id, name, age) values (01, 'Karuna', 22)";
		
		Statement statement = con.createStatement();
		statement.executeUpdate(query);
		System.out.println("table is created");


	}

}
