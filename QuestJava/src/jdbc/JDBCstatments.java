package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//JAVA DATABASE CONNECTIVITY API(APPLICATION PROGRAMMING INTERFACE)
public class JDBCstatments 
{
	
	public static void main(String[] args) 
	{
		final String USERNAME = "root";
		final String PASSWORD = "root";
		final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
		final String CONNECTION_URL ="jdbc:mysql://localhost:3306/school_db";
		
		
		try {
		
		//to register the driver class
		Class.forName(DRIVER_CLASS);
		
		//create a connection object 
		@SuppressWarnings("unused")
		Connection connection = DriverManager.getConnection(CONNECTION_URL, USERNAME, PASSWORD);
			
		System.out.println("CONNECTION SUCCESFULL!!!>>");
		}
		catch(ClassNotFoundException c)
		{
			System.out.println(c);
			c.printStackTrace();
		}
		catch(SQLException s)
		{
			System.out.println(s);
			s.printStackTrace();
		}
		
		
		
		
		
	}

}
