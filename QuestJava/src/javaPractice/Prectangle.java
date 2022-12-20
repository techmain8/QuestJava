package javaPractice;
import java.util.Scanner;
public class Prectangle
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("enter the length : ");
		int length = input.nextInt();
		System.out.println("enter the width :");
		int width = input.nextInt();
		input.close();
		double perimeter = 2 * (length + width);
		System.out.println("the perimeter of the rectangle is :" + perimeter);
	}
}