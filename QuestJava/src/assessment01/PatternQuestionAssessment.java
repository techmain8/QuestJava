package assessment01;

import java.util.Scanner;

public class PatternQuestionAssessment
{
	public static void main(String[] args) 
	{
		int i,j,number = 0;
		
		Scanner input = new Scanner(System.in);
		
		//requesting from user 
		System.out.println("Enter The Number: ");
		number = input.nextInt();
		
		for(i=0; i<=number+2; i+=2)
		{
			for(j=0; j<=i; j++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
