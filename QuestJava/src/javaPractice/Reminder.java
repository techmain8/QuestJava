package javaPractice;
import java.util.Scanner;
public class Reminder
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner (System.in);
		System.out.println("enter the first number : ");
		int a = scanner.nextInt();
		System.out.println("enter the second number : ");
		int b = scanner.nextInt();
		scanner.close();
		double c = a % b;
		System.out.println("the remainder of two numbers is : " + c);
	}
}