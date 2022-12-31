package oops_inheritance;

public class Task1 
{
	public void welcome() 
	{
		System.out.println("Welcome To Java");
	}
	
	public void welcome(String welcome) 
	{
		welcome();
		System.out.println(welcome);
	}
	public void welcome(String welcome,Integer num) 
	{
		welcome();
		welcome(welcome);
	}
}
