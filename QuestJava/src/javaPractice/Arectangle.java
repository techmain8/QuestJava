package javaPractice;
import java.util.Scanner;
public class Arectangle
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("enter the length : ");
		int length = input.nextInt();
		System.out.println("enter the width :");
		int width = input.nextInt();
		input.close();
		int Area = length * width ;
		System.out.println("the Area of the rectangle is :" + Area);
	}
}