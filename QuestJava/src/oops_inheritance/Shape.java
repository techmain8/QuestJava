package oops_inheritance;

public class Shape 
{
	int x,y;
	public void getXYValue(int x, int y) 
	{
		this.x=x;
		this.y=y;
	}
	public void showXYValue() 
	{
		System.out.println("Value Of X: "+this.x);
		System.out.println("Value of Y: "+this.y);
	}
}
