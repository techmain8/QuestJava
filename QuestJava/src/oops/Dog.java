package oops;

public class Dog 
{
	// properties -> variables called data members or fields
	private String name ;
	private int age ;
	private String color;
	private String bread;
	
	// member functions or methods
	public void eats() 
	{
		System.out.println("The Dog Eats Four Times A Day.");
	}
	public void sleeps() 
	{
		System.out.println("The Dog Sleeps From Early Morning To Afternoon..");
	}
	
	//setting methods
	public void setname(String n) 
	{
		name = n;
	}
	public void setage(int a) {
		age = a;
	}
	public void setcolor(String c) {
		color = c;
	}
	public void setbread(String b) 
	{
		bread = b;
	}
	
	//getter methods 
	public String getname() 
	{
		return name;
	}
	public int getage() 
	{
		return age;
	}
	public String getcolor() 
	{
		return color;
	}
	public String getbread() 
	{
		return bread;
	}
	
	//display details 
	public void showdetails() 
	{
		System.out.println("Name: "+ name);
		System.out.println("Age: "+ age);
		System.out.println("Color: "+ color);
		System.out.println("Bread: "+ bread);
	}
}
