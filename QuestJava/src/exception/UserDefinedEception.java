package exception;

import java.util.Scanner;

public class UserDefinedEception 
{
	public static void main(String[] args) 
	{
		Float number;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Value Of Pi:");
		number = scan.nextFloat();

			if(number != 3.14f) 
			{
				throw new NotEqualException("The Value Is Not Equals to 3.14");
			}	
			System.out.println("The Value Of Number Is: "+number);	
	}

}
