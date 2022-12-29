package oops_inheritance;

public class Laptop extends OperatingSystem
{
	private String displaySize;
	
	
	public Laptop(String company,int price,String displaySize) 
	{
		super(company, price);
		this.displaySize=displaySize;	
	}
	public void display1() 
	{
		System.out.println("DisplaySize is: "+displaySize);
	}

}
