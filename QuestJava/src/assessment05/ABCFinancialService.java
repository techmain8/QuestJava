package assessment05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ABCFinancialService 
{
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String URL = "jdbc:mysql://localhost:3306/bank";
	static final String USERNAME = "root";
	static final String PASSWORD = "root";

	static Connection conn = null;
	static Statement stmt = null;
	/*
	CREATE DATABASE bank;
	use bank;
	CREATE TABLE accounts (
	  account_number VARCHAR(20) PRIMARY KEY,
	  balance DOUBLE NOT NULL
	);
	*/
	public static void connectToDb() 
	{
		try 
		{
			Class.forName(JDBC_DRIVER);
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
		} 
		catch (Exception e) 
		{
			System.out.println(e);
			e.printStackTrace();
		}
	}

	public static void createAccount(String accountNumber) 
	{
		try 
		{
			stmt = conn.createStatement();
			String sql = "INSERT INTO accounts (account_number, balance) " + "VALUES ('" + accountNumber + "', 0)";
			stmt.executeUpdate(sql);
			System.out.println("Account created successfully");
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	public static void withdraw(String accountNumber, double withdrawAmount) 
	{
		try 
		{
			stmt = conn.createStatement();
			String sql = "UPDATE accounts SET balance = balance - " + withdrawAmount + " WHERE account_number = '"
					+ accountNumber + "'";
			stmt.executeUpdate(sql);
			System.out.println("Withdrawal successful");
		}
		catch (Exception e) 
		{
			System.out.println(e);
			e.printStackTrace();
		}
	}

	public static double viewBalance(String accountNumber) 
	{
		try 
		{
			stmt = conn.createStatement();
			String sql = "SELECT balance FROM accounts WHERE account_number = '" + accountNumber + "'";
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) 
			{
				return rs.getDouble("balance");
			} 
			else 
			{
				System.out.println("Account not found");
				return 0;
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			return 0;
		}
	}

	

	public static void deposit(String accountNumber, double depositAmount) 
	{
		try 
		{
			stmt = conn.createStatement();
			String sql = "UPDATE accounts SET balance = balance + " + depositAmount + " WHERE account_number = '"
					+ accountNumber + "'";
			stmt.executeUpdate(sql);
			System.out.println("Deposit successful");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}