package javaPractice;
import java.util.Scanner;
public class Arectangle
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("enter the length : ");
		int len = input.nextInt();
		System.out.println("enter the width :");
		int wid = input.nextInt();
		input.close();
		int P = len * wid ;
		System.out.println("the Area of the rectangle is :" + P);
	}
}