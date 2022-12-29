package oops_inheritance;

public class OperatingSystem 
{
	private String company;
	private int price;
	
	public OperatingSystem(String company,int price) 
	{
		this.company =company;
		this.price=price;
	}
	public void display() 
	{
		System.out.println("company: "+ company);
		System.out.println("Price: "+price);
	}

}
