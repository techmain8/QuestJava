package assignment;

import java.util.Scanner;

public class OddAndEvenNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = 0, i;
		System.out.println("Enter Ten Number :");
		for(int k =1;k<=10;k++)
		{
			a = sc.nextInt();
		}
		sc.close();
		//for odd numbers 
		for(i=1;i<=a;i++) 
		{
			if(i%2 != 0) 
			{
			   System.out.println("Odd Number: " +i);
			}
		}
		System.out.println();
		//for even numbers 
		for(int j=1;j<=a;j++) 
		{
			if(j%2 == 0)
			{
			System.out.println("Even Number: "+j);
			}
		}
	}
}
