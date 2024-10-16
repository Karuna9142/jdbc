package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedStatementDemo {

	public static void main(String[] args) {
		
		try
		{
			Scanner sc = new Scanner(System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "Mishra12345#");
			String q1 = "insert into employe(eid, eage, ename) values (?,?,?)";
			
		    PreparedStatement pst1 = con.prepareStatement(q1);
		    PreparedStatement pst2 = con.prepareStatement(q1);
		    
		    pst1.setInt(1, 101);
		    pst1.setInt(2,25);
		    pst1.setString(3, "Karuna");
		    
		    pst2.setInt(1, 102);
		    pst2.setInt(2,26);
		    pst2.setString(3, "Ritika");
		    
		     //int num = pst.executeUpdate();
		     //System.out.println("Rows inserted count:- "+num);
		     pst1.execute();
		     pst2.execute();
		     System.out.println("Rows inserted");
		     
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
    
	}

}
