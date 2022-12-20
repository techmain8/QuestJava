package assignment;

import java.util.Scanner;

public class ReverseOFNumber 
{
	public static void main(String[] args) 
	{
		int num = 0 ,rem, rev = 0 ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number :");
		num = sc.nextInt();
		sc.close();
		//using while 
		while(num != 0)   
		{  
		 rem = num % 10;  
		rev = rev * 10 + rem;  
		num = num/10;  
		}
		//using for loop
		/*
		for( ;num != 0; num = num/10)   
		{  
		 rem = num % 10;  
		 rev = rev * 10 + rem;  
		}  
		*/
		System.out.println("The Reverse Of Number Is:"+ rev);
	}

}
