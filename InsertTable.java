package com.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTable
		{
			public static void main(String[] args) throws ClassNotFoundException, SQLException 
			{
						//load the drivers
						Class.forName("com.mysql.cj.jdbc.Driver");
						//creating connection
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root", "Mishra12345#");
						
						//writing query
						//String query1="create database Book";
						
						//create table book
						//String query2="create table Book(id int auto_increment primary key,Book_name varchar(20)Not Null, Author_name varchar(20) NOT NULL)";
						
						//Insert details
						String query3 = "INSERT INTO Book(Book_name,Author_name)VALUES('Ramcharitmanas','Tulsidas'),('The Indian Struggle','Subhas chandra Bose'),('Buddha Charita','Aavaghosa'),('Panchtantra','Vishnu Sharma');";
						
						//String query4 = "Update Book set Book_name = 'Java' where id = 3";
						//delete details
						//String query5 = "DELETE from Book WHERE id=1";
							
						
						//creating statement
						Statement statement=con.createStatement();
						
						//Execute
						//statement.executeUpdate(query1);
							
						//System.out.println("Database is created..");
					
						
//						statement.executeUpdate(query2);
						//System.out.println("Table is created successfully");
						
       					statement.executeUpdate(query3);
     					System.out.println("Data inserted successfully");
						
						
					//	statement.executeUpdate(query4);
					//   System.out.println("Data updated success fully...");
						
					    //statement.executeUpdate(query5);
					    //System.out.println("Deletion is successful");
						
					}

				
	}


