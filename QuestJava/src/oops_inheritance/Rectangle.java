package oops_inheritance;

public class Rectangle extends Dimension 
{
	float Area;
	public Rectangle(float length, float width, float base, float height) 
	{
		super(length, width, base, height);
	}
	
	public void AreaOfRectangle() 
	{
		Area = getbase()*getheight();
	}
	public void displayRectangle() 
	{
		AreaOfRectangle();
		System.out.println("Area Of The Rectangle Is: "+Area);
	}
}
