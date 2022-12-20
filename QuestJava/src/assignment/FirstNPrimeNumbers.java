package assignment;

import java.util.Scanner;

public class FirstNPrimeNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i,num;
		
		System.out.println("Enter The Number: ");
		num =input.nextInt();
		input.close();
		
	
		if (num == 0 || num ==1 || num==2) {
			System.out.println(num+" there are no Prime Numbers.");
		}
		else 
		{
			for(i=3;i<=num;i+=2) 
			{
				System.out.println(i);	
			}
			System.out.println(i+" are the prime number.");
		}
	}	

}
