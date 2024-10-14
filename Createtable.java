package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Createtable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root", "Mishra12345#");
		
		String query = "create table Example(eid int auto_increment primary key,ename varchar(20) not null)";
		
		Statement statement = con.createStatement();
		statement.executeUpdate(query);
		System.out.println("table is created");

	}

}
