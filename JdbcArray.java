package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JdbcArray {

	public static void main(String[] args) {
		
			try
			{
		     
			    Scanner s = new Scanner(System.in);
				 Class.forName("com.mysql.cj.jdbc.Driver");   
		         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","Mishra12345#");
		         String q1 = "insert into employe(eid, eage,ename) values (?,?,?)";
		         
		         PreparedStatement pst[] = new PreparedStatement[3];
	              for(int i=0;i<3;i++)
		          {
		        	   pst[i] =  con.prepareStatement(q1);
		        	   System.out.println("Enter employee id, age, name");
		               int eid = s.nextInt();
		               int eage = s.nextInt();
		               String ename = s.next();
		               
		               pst[i].setInt(1, eid);
		               pst[i].setInt(2, eage);
		               pst[i].setString(3, ename);
		               
		               pst[i].execute();
		          }
	        }
			catch(Exception e)
			{
				e.printStackTrace();
			}
		
		}

}
