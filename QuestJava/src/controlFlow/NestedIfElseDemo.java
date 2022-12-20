package controlFlow;
import java.util.Scanner;

public class NestedIfElseDemo {

public static void main(String[] args) {
		
		int num1, num2, num3;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter 3 numbers : ");
		
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		scan.close();
		
		// outer if
		if(num1 > num2)
		{
			// inner if
			if(num1 > num3)
			{
				System.out.println("Num1 is greatest.");
			}
			else
				System.out.println("Num1 is not greatest.");
		}
		else
			System.out.println("Num1 is not greatest.");
	}
}
