package oops_inheritance;

public class Triangle extends Dimension
{
	float Area;
	public Triangle(float length, float width, float base, float height) 
	{
		super(length, width, base, height);
	}

	public void AreaOfTriangle()
	{
		Area = getlength()* getwidth();
	}
	public void displayTriangle() 
	{
		AreaOfTriangle();
		System.out.println("Area Of Triangle Is: "+Area);
	}
}
