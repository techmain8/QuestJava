package javaPractice;
import java.util.Scanner;
public class Cube
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner (System.in);
		System.out.println("enter the number to find cube : ");
		int num = scanner.nextInt();
		scanner.close();
		int cube = num * num * num;
		System.out.println("the Cube of the number is :" + cube);
	}
} 