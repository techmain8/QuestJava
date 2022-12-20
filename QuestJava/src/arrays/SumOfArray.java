package arrays;

import java.util.Scanner;

public class SumOfArray 
{
	static int end,sum = 0;
	
	static int operation(int end, int[] num) 
	{
		for(int i=0 ;i<end;i++) 
		{
			sum+=num[i];
		}
		return sum;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the Length of array to store:");
		end =sc.nextInt();
		int[] num = new int[end];
	
		for(int i=0 ;i<end;i++) 
		{
			System.out.println("Enter the Array Number "+ (i+1)+" : ");
			 num[i] = sc.nextInt();
		}
		sc.close();
		
//		for(int i=0 ;i<end;i++) 
//		{
//			sum+=num[i];
//		}
		operation(end,num);
		System.out.println("The Sum of "+ end +" Array Elements is : "+sum);
	}
	

}
