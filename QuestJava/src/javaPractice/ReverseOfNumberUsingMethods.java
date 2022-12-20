package javaPractice;

import java.util.Scanner;

public class ReverseOfNumberUsingMethods 
{
	static int num = 0 ,rem, rev = 0 ;
	
	public static int revNum(int num) 
	{
		while(num != 0)   
		{  
			rem = num % 10;  
			rev = rev * 10 + rem;  
			num = num/10;  
		}
		return rev;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number :");
		num = sc.nextInt();
		sc.close();

		revNum(num);
		
		System.out.println("The Reverse Of Number Is:"+ rev);
	}

}
