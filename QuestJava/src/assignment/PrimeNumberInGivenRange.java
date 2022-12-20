package assignment;

import java.util.Scanner;

public class PrimeNumberInGivenRange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i,h,start,num;
		
		System.out.println("Enter The Start Number: ");
		start =input.nextInt();
		System.out.println("Enter The End Number: ");
		num =input.nextInt();
		input.close();
		
	
		if (num == 0 || num ==1 || num==2) {
			System.out.println(num+" there are no Prime Numbers.");
		}
		else 
		{
			h= start%2;
			if(h==0) 
			{
				start=start+1;
				for(i=start;i<=num;i+=2) 
				{
					System.out.println(i);	
				}
				System.out.println(" are the prime number.");
			}
			else 
			{
				for(i=start;i<=num;i+=2) 
				{
					System.out.println(i);	
				}
				System.out.println(" are the prime number.");
			}
		}
	}

}
