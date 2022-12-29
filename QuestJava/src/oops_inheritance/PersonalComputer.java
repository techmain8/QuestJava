package oops_inheritance;


public class PersonalComputer extends Laptop
{
	String features;
	boolean hasFloppy;
	
	public PersonalComputer(String company,int price,String displaySize,String features,boolean hasFloppy)
	{
		super(company,price,displaySize);
		this.features=features;
		this.hasFloppy=hasFloppy;
	}
	public void display2() 
	{
		System.out.println("features: "+features);
		System.out.println("hasFloppy: "+hasFloppy);
	}
}
