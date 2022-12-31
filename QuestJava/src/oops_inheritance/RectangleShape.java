package oops_inheritance;

public class RectangleShape extends Shape 
{
	@Override
	public void showXYValue() 
	{
		System.out.println("Length Of Rectangle Is: "+super.x);
		System.out.println("Breadth Of Rectangle Is: "+super.y);
	}
}
