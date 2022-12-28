package assignment;


public class Number 
{
	public static int Sum(int a,int b) 
	{
		return a+b;
	}
	
	public static int Difference(int a,int b) 
	{
		if(a > b) 
		{
			return (a-b);
		}
		else 
		{
			return (b-a);
		}
	}
	
	public static float Quotient(float a,float b) 
	{
		if(b == 0)
		{
			System.out.println("Division by zero is not valid.");
			return a;
		}
		return a/b;
	}
	
	public static int Remainder(int a,int b) 
	{
		if(b == 0)
		{
			System.out.println("Division by zero is not valid.");
			return a;
		}
		return a%b;
	}
	
	public static int Product(int a,int b) 
	{
		return a*b;
	}
	

}
