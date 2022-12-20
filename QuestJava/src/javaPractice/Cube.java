package javaPractice;
import java.util.Scanner;
public class Cube
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner (System.in);
		System.out.println("enter the number to find cube : ");
		int a = scanner.nextInt();
		scanner.close();
		int b = a * a * a;
		System.out.println("the Cube of the number is :" + b);
	}
} 