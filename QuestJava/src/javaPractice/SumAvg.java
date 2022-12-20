package javaPractice;
import java.util.Scanner;
public class SumAvg
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("enter the first number : ");
		int a = input.nextInt();
		System.out.println("enter the second number : ");
		int b = input.nextInt();
		System.out.println("enter the third number : ");
		int c = input.nextInt();
		System.out.println("enter the fourth number : ");
		int d = input.nextInt();
		System.out.println("enter the fifth number : ");
		int e = input.nextInt();
		input.close();
		int sum = a + b + c + d + e ;
		double avg = sum / 5 ;
		System.out.println("the sum of five number is :" + sum);
		System.out.println("the average of five numbers is :" + avg);
	}
}