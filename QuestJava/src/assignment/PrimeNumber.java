package assignment;

import java.util.Scanner;

public class PrimeNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int  i,mid,num, flag = 0;
		System.out.println("Enter The Number To Check Its A Prime Number Or Not:");
		num = sc.nextInt();
		sc.close();
		
		mid = num / 2 ;  
		
		if(num==0||num==1)
		{  
		   System.out.println(num+" is not prime number..");      
		}
		else
		{  
			for(i=2;i<=mid;i++)
			{      
				if(num%i==0)
				{      
					System.out.println(num+" is not prime number..");      
					flag=1;      
					break;      
				 }      
			}      
			if(flag==0) 
			{
				System.out.println(num+" is prime number.."); 
			}  
		}
		System.out.println("Thank You...");
	}

}
