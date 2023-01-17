package exception;

import java.util.Scanner;

public class VotingApplication 
{
	
	public static void main(String[] args) {
		int age;
		Scanner scan = new Scanner(System.in);
		System.out.println("To Check Weather Voter Is Elgible Or Not To Vote.");
		System.out.println("Enter The Age: ");
		try {
			age=scan.nextInt();
		if(age >= 18 && age <= 100)
			System.out.println("Congratulations! You're Eligible To Vote..");
		}
		catch(Exception e) 
		{
			System.out.println("Please Enter A Vaild Age Or Age Above 18 years and below 100 years:"+ e);
		}
		System.out.println("Thank you..");
	}
}
