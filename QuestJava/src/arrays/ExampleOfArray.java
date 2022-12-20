package arrays;

import java.util.Scanner;

public class ExampleOfArray 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int end ;
		
		System.out.println("Enter the number of array to store:");
		end =sc.nextInt();
		int[] num = new int[end];
		
		for(int i=0 ;i<end;i++) 
		{
			System.out.println("Enter the Array Number: ");
			num[i] = sc.nextInt();
		}
		sc.close();
		//from first to last
		for(int j=0;j<end;j++) {
			System.out.println("The Entered Numbers Are : "+ num[j]);
		}
		//from last to first 
		for(int j=end; j>=0; j++) {
		
			System.out.println("The Entered Numbers Are : "+ num[j]);
		}
	}

}
