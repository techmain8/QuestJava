package oopsPractice;

public class GreaterNumber
{
	//Initialization
	private int num;
	
	//constructor for object
	public  GreaterNumber(int num) 
	{
		this.num = num;
	}
	//getter to display
	public int getNum() 
	{
		return num;
	}
	//setter to store 
	public void setNum(int num) 
	{
		this.num = num;
	}
	
	//Parameterized constructor 
	//for checking greatest number through passing object as a parameter 
	public GreaterNumber greater(GreaterNumber obj2,GreaterNumber obj3) 
	{
		if(obj2.getNum() > this.getNum()) 
		{
			if(obj2.getNum() > obj3.getNum()) 
			{
				return obj2;
			}
			else 
			{
				return obj3;
			}
		}
		else if(this.getNum() > obj3.getNum())
		{
			return this;
		}
		else 
		{
			return obj3;
		}
	}
	//for displaying object value to user 
	public void display() 
	{
		System.out.println(num);
	}
}
