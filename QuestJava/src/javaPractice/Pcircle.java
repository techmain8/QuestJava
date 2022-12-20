package javaPractice;
import java.util.Scanner;
public class Pcircle
{
	final static double pi = 3.142;
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("enter the radius of cirlce : ");
		int radius = input.nextInt();
		input.close();
		double Perimeter = 2 * pi * radius ;
		System.out.println("the Perimeter of the cirlce is :" + Perimeter);
	}
}