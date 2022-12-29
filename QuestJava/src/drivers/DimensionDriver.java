package drivers;

import oops_inheritance.Rectangle;
import oops_inheritance.Triangle;

public class DimensionDriver 
{
	public static void main(String[] args) 
	{
		Triangle triangle = new Triangle(4,8,10,9);
		triangle.displayTriangle();
//		Triangle triangle1 = new Triangle();
//		triangle1.setbase(5);
//		triangle1.setheight(10);
//		triangle1.setlength(6);
//		triangle1.setwidth(8);
//		triangle1.displayTriangle();
		
		
		Rectangle rectangle = new Rectangle(4,8,10,9);
		rectangle.displayRectangle();
		rectangle.dispalyDimension();
	
	}

}
