package basics;

import java.util.Scanner;

public class CheckRectangle {
	public static void main(String[] args) {
		Scanner scan = new  Scanner(System.in);
		
		int Length ,Breadth ;
		
		System.out.println("Enter the Length of  Rectangle :");
		Length = scan.nextInt();
		
		System.out.println("Enter the Breadth of the Rectangle :");
		Breadth = scan.nextInt();
		scan.close();
		
		if(Length == Breadth) {
			System.out.println("The Entered values are of Square");
		}
		else {
			System.out.println("The Entered values are of Rectangle");
		}
		System.out.println("Thank you");
	}
}
