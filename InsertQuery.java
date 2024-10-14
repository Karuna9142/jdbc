package com.insert;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class ConnectDB 
{
	public static Connection dbConnect()
	{
		Connection connection = null;
		try
		{
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String username = "root";
		String password = "Mishra12345#";
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root", "root", "Mishra12345#");
		} catch (SQLException e) {
		e.printStackTrace();
		}
		return connection;
	 }
}
  class InsertQuery {
	public static void main(String[] args) {
		
		try (Connection con = ConnectDB.dbConnect(); Statement stmt =
				con.createStatement();)
				{
				// create query
				String sql = "INSERT INTO STUDENT(ID,NAME,AGE) VALUES (01, 'Karuna',21);";
				// execute the query
				int row = stmt.executeUpdate(sql);
				System.out.println(row + " row inserted successfully!!");
				} catch (Exception e) {
				System.out.println(e);
				}
	}

}
