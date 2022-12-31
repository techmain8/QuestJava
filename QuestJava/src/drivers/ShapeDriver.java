package drivers;
import oops_inheritance.Shape;
import oops_inheritance.RectangleShape;

public class ShapeDriver 
{

	public static void main(String[] args) 
	{
		Shape shape = new Shape();
		shape.getXYValue(8, 6);
		shape.showXYValue();
		System.out.println();
		
		RectangleShape rectangleshape = new RectangleShape();
		rectangleshape.getXYValue(14, 12);
		rectangleshape.showXYValue();
	}

}
