package javaPractice;
import java.util.Scanner;
public class test {
	public static void main(String[] args) 
	{
		System.out.println("enter the integer: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println("enter the character: ");
		char ch = scanner.next().charAt(0);
		System.out.println("enter a decimal number: ");
		double d = scanner.nextDouble();
		scanner.close();
		System.out.println("the interger is :" + n);
		System.out.println("the character is :" + ch);
		System.out.println("the decimal is :"+ d);
	}
}
