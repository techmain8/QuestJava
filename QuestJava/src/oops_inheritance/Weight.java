package oops_inheritance;

public class Weight 
{
	private int pound;
	public Weight() 
	{
		
	}
	public int getPound() {
		return pound;
	}
	public void setPound(int pound) {
		this.pound = pound;
	}
	public void display() 
	{
		System.out.println("Entered Pounds In Lbs Is: "+getPound());
		System.out.println("Converted To KiloGrams Is: "+(getPound()*0.45359237));
	}
}
