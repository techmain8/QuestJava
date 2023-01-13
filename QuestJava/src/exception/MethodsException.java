package exception;

import java.util.Scanner;

public class MethodsException 
{
	static char c;

		static void Double(double d1, double d2) 
		{
			try 
			{
				if (d1 == d2) 
				{
					throw new RuntimeException("Double Exception occured");
				}

			} 
			catch (RuntimeException re) 
			{
				System.out.println("Exception occured due to second floating value is same as first :" + d2);
			}
		}
		static void Charcter(char ch,Scanner sc) 
		{
			try 
			{
			if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) {
				System.out.println("Character is enterde " + ch);

			}
			else
			{
				throw new Exception("Invalid character value");

			}
			} 
			catch (Exception re) 
			{
				System.out.println("Enter a value to Check Weather it is char or not ");
				c=sc.next().charAt(0);
				Charcter(c,sc);
				System.out.println("Exception handeled");
			}
		}
	

		public static void Integer(int num1, int num2) 
		{
			Scanner sc = new Scanner(System.in);
			try 
			{
				if (num1 != num2) 
				{
					throw new Exception("Integer Exception occured");
				} 
				else
					System.out.println("Both are equal");

			} 
			catch (Exception re) 
			{
				System.out.println("Plz enter both same number");
				num1 = sc.nextInt();
				num2 = sc.nextInt();
				Integer(num1, num2);
			}
		}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double db2;
		int n1,n2;
    
		System.out.println("Enter a first floating value");
		double db1 = sc.nextDouble();
		System.out.println("Enter a second floating value");
		db2=sc.nextDouble();
		Double(db1,db2);
		
		System.out.println("Enter a value to Check Weather it is char or not ");
		c=sc.next().charAt(0);
		Charcter(c,sc);
		
		System.out.println("Enter a first int value");
		n1=sc.nextInt();
		System.out.println("Enter a second int value");
		n2=sc.nextInt();
		Integer(n1,n2);
	}
}
