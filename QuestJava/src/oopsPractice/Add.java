package oopsPractice;

import java.util.Scanner;

public class Add 
{
	
	private double num;
	
	 public Add(double num) 
	 {
		this.num = num;
	}

	
	public  double getNum() 
	{
		return num;
	}

	public void setNum(double num) 
	{
		this.num = num;
	}

	
	public Add  add(Add obj2,Add obj3) 
	{
		double sum = this.num + obj2.num + obj3.num;
		Add result=new Add(sum);
		return result;
	}
	
	public void display() 
	{
		System.out.println(num);
	}
	static float num1,num2,num3;
	public static void read()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The First Number: ");
		num1 =scan.nextInt();
		System.out.println("Enter The Second Number: ");
		num2 = scan.nextInt();
		System.out.println("Enter the Third Number: ");
		num3 =scan.nextInt();
		
	}
	public static void main(String[] args) 
	{
		read();
		Add obj1 = new Add(num1);
		Add obj2 = new Add(num2);
		Add obj3 = new Add(num3);
		
		System.out.println("Entered Values Are: ");
		obj1.display();
		obj2.display();
		obj3.display();
		
		obj1.add(obj2,obj3);
		
		Add obj = obj1.add(obj2, obj3);
		System.out.println("The Sum Of The Numbers Is: "+obj.getNum());
	}
}
