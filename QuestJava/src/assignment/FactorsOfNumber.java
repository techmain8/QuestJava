package assignment;
import java.util.Scanner;

public class FactorsOfNumber 
{

	public static void main(String[] args) 
	{
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number :");
		num =sc.nextInt();
		sc.close();
		
		System.out.println("The Factors Of The Number are :");
		for(int i = 1; i <= num; i++)
	     {
	         if(num % i == 0)
	         {
	             System.out.println(i+" "); 
	         }
	     }

	}

}
