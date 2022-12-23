package assessment01;

import java.util.Scanner;

public class Palindrome {
		public static void main(String args[])
		{
			int number1 , reverse = 0 , number2 = 0 , temp = 0;
			
			Scanner sc = new Scanner (System.in);
			
			//requesting from user 
			System.out.println ("Enter The Number:");
			number1 = sc.nextInt();
			
			//assigning for checking 
			number2 = number1;
			
			//checking 
			while (number2 != 0)
			{
				temp = number2 % 10;
				reverse = (reverse * 10) + temp;
				number2 = number2 / 10;
			}
			if (number1 == reverse)
				System.out.println ("The Given Number "+number1+" Is A Palindrome Number");
			else 
				System.out.println ("The Given Number "+number1+" Is Not A Palindrome Number");
		}
	}

