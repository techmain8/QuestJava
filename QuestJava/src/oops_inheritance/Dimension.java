package oops_inheritance;

public class Dimension 
{
	private float length;
	private float base;
	private float width;
	private float height;
	public Dimension(float length,float width,float base,float height) 
	{
		this.length=length;
		this.width=width;
		this.base=base;
		this.height=height;
	}
	
	public float getlength() {
		return length;
	}

	public void setlength(float length) {
		this.length = length;
	}
	
	public float getbase() {
		return base;
	}

	public void setbase(float base) {
		this.base = base;
	}

	public float getwidth() {
		return width;
	}

	public void setwidth(float width) {
		this.width = width;
	}

	public float getheight() {
		return height;
	}

	public void setheight(float height) {
		this.height = height;
	}
	

	public void dispalyDimension() 
	{
		System.out.println("Length: "+length);
		System.out.println("Width: "+width);
		System.out.println("Base: "+base);
		System.out.println("Height: "+height);
	}
}
