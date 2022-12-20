package assignment;

import java.util.Scanner;

public class CountOddNumbers 
{
	public static void main(String[] args) 
	{
		int length;
		int odd = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Length Of Array: ");
		length = sc.nextInt();
		int[] num = new int[length];

		//for read and store all numbers
		for(int i=0; i<length;i++) 
		{
			System.out.println("Enter The Number: ");
				num[i]=sc.nextInt();
		}
		sc.close();
		//for checking odd number from array
		for(int i= 0 ; i<length;i++) 
		{
			if(num[i]%2!=0) 
			{
				 odd++;
			}
		}
		if(odd != 0) 
		{
			System.out.println("The Number Of Odd Numbers Are: "+odd);
		}
		else 
		{
			System.out.println("There Are No Odd Numbers In Array...");
		}
	}

}
