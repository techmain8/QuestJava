package javaPractice;
import java.util.Scanner;
public class Pcircle
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("enter the radius of cirlce : ");
		int rad = input.nextInt();
		input.close();
		double P = 2 * 3.142 * rad ;
		System.out.println("the Perimeter of the cirlce is :" + P);
	}
}