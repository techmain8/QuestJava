package assessment01;

import java.util.Scanner;

public class TaxCalculator
{
	public static void main(String[] args) 
	{
		float sum = 0;
		int theater = 5;
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i =0; i<theater; i++) 
		{
			//requesting from user 
			System.out.println("Enter The Balcony Tickets Sold In Theatre: "+(i+1)+" :");
			int balcony = scanner.nextInt();
			//requesting from user 
			System.out.println("Enter The FirstClass Tickets Sold In Theatre: "+(i+1)+" :");
			int firstClass = scanner.nextInt();
			//requesting from user 
			System.out.println("Enter The SecondClass Tickets Sold In Theatre: "+(i+1)+" :");
			int secondClass = scanner.nextInt();
			//calculation 
			float taxAmountPerTheatre = (balcony*750*0.25f) + (firstClass*500*0.25f) + (secondClass*250*0.15f);
			System.out.println("Total Tax Payable For Each Theatre Is = "+taxAmountPerTheatre);
			
			sum += taxAmountPerTheatre;
			
		}
		System.out.println("Total Tax Payable For Multiplex Is = "+ sum);

	}
}