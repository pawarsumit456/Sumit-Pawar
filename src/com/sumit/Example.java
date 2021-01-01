package com.sumit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Example {
	
	String JDBC_Driver = "com.mysql.jdbc.Driver";
	String DB_Url = "jdbc:mysql://sumit";
	
	String user="root";
	String pass="";
	
	Connection con=null;
	Statement st=null;
	ResultSet rs;
	
	
	public Example() {
		
		try
		{
			//Register the driver 
			Class.forName(JDBC_Driver);
			
			//Connection to DB
			con=DriverManager.getConnection(DB_Url,user,pass);
			
			//Statement
			st=con.createStatement();
			
			//Execute the query
			String sql="select * from sumit";
			
			ResultSet rs=st.executeQuery(sql);
			
			while(rs.next())
			{
				int id=rs.getInt("id");
				String name=rs.getString("name");
				int age=rs.getInt("age");
				
				
				//Displaying the data
				System.out.println("Id is "+id);
				System.out.println("Name is "+name);
				System.out.println("Age is "+age);
			}
			rs.close();
			st.close();
			con.close();
			
			
		}
		catch (Exception e) {
			
		}
		finally {
			
			try
			{
				if(st!=null)
				{
					st.close();
				}
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			
			try
			{
				if(con!=null)
				{
					con.close();
				}
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		System.out.println("Bye Bye..!!");
	}

}
