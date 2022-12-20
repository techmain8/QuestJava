package javaPractice;
import java.util.Scanner;
public class Square
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner (System.in);
		System.out.println("enter the number to find Square : ");
		int a = scanner.nextInt();
		scanner.close();
		int b = a * a ;
		System.out.println("the Square of the number is :" + b);
	}
} 