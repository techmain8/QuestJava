package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//JAVA DATABASE CONNECTIVITY API(APPLICATION PROGRAMMING INTERFACE)
public class JDBCstatments 
{
	
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		String name ="Suresh";
		int age=23;
		float score=89.3f;
		int rollno =6;
		
		//Initialization for connecting to database 
		final String USERNAME = "root";
		final String PASSWORD = "root";
		final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
		final String CONNECTION_URL ="jdbc:mysql://localhost:3306/school_db";
		
		
		//SQL commands as String
		final String SQL = "INSERT INTO students_tb(fullname,age,score) VALUES('stanner',34,92.5)";
		
		final String SQL2 ="INSERT INTO students_tb(fullname,age,score) VALUES('"+name+"',"+age+","+score+")";
		
		final String SQL3 = "UPDATE students_tb SET fullname = '"+name+"',age=24 ,score=75.2   WHERE rollno = 8";
		
		final String SQL4 = "DELETE FROM students_tb WHERE rollno = "+rollno;
		
		final String SQL5 = "DELETE FROM students_tb WHERE fullname LIKE '%s%' ";
																	// %s% -means anything before and after s 
																	// %s - anything before s 
																	// s% - anything after s  
																	// * - means everything 
		final String SQL6 ="SELECT * FROM students_tb";
		
		try 
		{
		
			//to register the driver class
			Class.forName(DRIVER_CLASS);
		
			//create a connection object 
			Connection connection = DriverManager.getConnection(CONNECTION_URL, USERNAME, PASSWORD);
			
			System.out.println("CONNECTION SUCCESFULL!!!>>");
		
		
			/********EXECUTE SQL QUERIES HERE********/
		
			//create a statement object 
			Statement statement = connection.createStatement();
		
			//execute the query using object 
			//statement.executeUpdate(SQL);
//			int noOfRowsAffected = statement.executeUpdate(SQL4);
											//executeUpdate is only of insert ,update and delete statements 
			
			ResultSet queryCheck = statement.executeQuery(SQL6);
											//executeQuery is for storeing the resultant values of the query table
											// which will be stored in ResulSet class ....
		
			//TO VERIFY THE EXECUTIION 
//			if(noOfRowsAffected>0)
//			{
//				System.out.println("Rows Affeceted: "+noOfRowsAffected);
//			}
//			else 
//			{
//			System.out.println("No Rows Affected...");
//			}
			
			while(queryCheck.next())
			{
				System.out.print(queryCheck.getInt("rollNO")+" \t");
				System.out.print(queryCheck.getString("fullname")+" \t");
				System.out.print(queryCheck.getInt("age")+" \t");
				System.out.print(queryCheck.getInt("score")+" \t");
				System.out.println("\n");
			}
			
			//CLOSE THE CONNECTION ALWAYS
			queryCheck.close();
			statement.close();
			connection.close();
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
