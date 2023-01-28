package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SQLInjectionsStatement 
{

	public static void main(String[] args) 
	{
		final String USERNAME = "root";
		final String PASSWORD = "root";
		final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
		final String CONNECTION_URL = "jdbc:mysql://localhost:3306/school_db";
		
		String name ="' OR '1'=1'";
		
		final String SQL ="SELECT * FROM students_tb WHERE fullname =?";
		
		try {
			Class.forName(DRIVER_CLASS);
			Connection connection = DriverManager.getConnection(CONNECTION_URL,USERNAME,PASSWORD);
			
			
			PreparedStatement preparedstatement = connection.prepareStatement(SQL);
		
			
			
			int noOfRowsAffected = preparedstatement.executeUpdate();
			
			ResultSet rs = preparedstatement.executeQuery();
			preparedstatement.setString(1, name);
			
			
			// TO VERIFY THE EXECUTIION 
			if(noOfRowsAffected>0)
			{
				System.out.println("Rows Affeceted: "+noOfRowsAffected);
			}
			else 
			{
			System.out.println("No Rows Affected...");
			}
			
			//to display data from SQL using ResultSet
			while(rs.next())
			{
				System.out.print(rs.getInt("rollNO")+" \t");
				System.out.print(rs.getString("fullname")+" \t");
				System.out.print(rs.getInt("age")+" \t");
				System.out.print(rs.getInt("score")+" \t");
				System.out.println("\n");
			}
			
			preparedstatement.close();
			connection.close();
		}
		catch (SQLException e) {
		
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
		
	}

}
