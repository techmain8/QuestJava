package oopsPractice;
import java.util.Scanner;
public class GreaterNumberDriver 
{
	static int num1,num2,num3;
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
		//to read input from user 
		read();
		//object creation for Pojo class 
		GreaterNumber obj1 = new GreaterNumber(num1);
		GreaterNumber obj2 = new GreaterNumber(num2);
		GreaterNumber obj3 = new GreaterNumber(num3);
		
		//checking the greatest in object using other objects 
		obj1.greater(obj2,obj3);
		
		//displaying objects
		System.out.println("----------------------------------");
		obj1.display();
		obj2.display();
		obj3.display();
		
		//calling new object and assigning to display 
		GreaterNumber obj = obj1.greater(obj2,obj3);
		System.out.println("Greater Number Is: "+obj.getNum());
		
	}
}
