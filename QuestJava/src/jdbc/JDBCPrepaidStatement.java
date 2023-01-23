package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCPrepaidStatement {

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		String name ="Abhishek";
		int age=25;
		float score=88.8f;
		int rollno =9;
		
		//Initialization for connecting to database 
		final String USERNAME = "root";
		final String PASSWORD = "root";
		final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
		final String CONNECTION_URL ="jdbc:mysql://localhost:3306/school_db";
		
		
		//SQL commands as String
		final String SQL = "INSERT INTO students_tb(fullname,age,score,rollNo) VALUES(?,?,?,?)";
		
		final String SQL2 = "UPDATE students_tb SET fullname = ?,age=? ,score=?   WHERE rollno = ?";
		
		final String SQL3 = "DELETE FROM students_tb WHERE rollno = ?";
		
		final String SQL4 = "SELECT * FROM students_tb";
		
		try 
		{
		
			//to register the driver class
			Class.forName(DRIVER_CLASS);
		
			//create a connection object 
			Connection connection = DriverManager.getConnection(CONNECTION_URL, USERNAME, PASSWORD);
			
			System.out.println("CONNECTION SUCCESFULL!!!>>");
		
		
			/********EXECUTE SQL QUERIES HERE********/
			
			//create a statement object 
			PreparedStatement prepaidstatement = connection.prepareStatement(SQL4);
			//select numbers according to the number of question marks in query statement 
//			prepaidstatement.setString(1,name);
//			prepaidstatement.setInt(2,age);
//			prepaidstatement.setFloat(3, score);
//			prepaidstatement.setInt(1, rollno);
			
			ResultSet queryCheck = prepaidstatement.executeQuery();
			
//			int noOfRowsAffected = prepaidstatement.executeUpdate();
//			
//			//TO VERIFY THE EXECUTIION 
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
			
			prepaidstatement.close();
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
