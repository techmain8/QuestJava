package assignment;

import java.util.Scanner;

public class TotalAmount 
{

	public static void main(String[] args) 
	{
//		a=p(1 + r/q)nq 
		int a,p,r,q,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Compound Intrest: ");
		q= sc.nextInt();
		System.out.println("Enter The Time In Years: ");
		n = sc.nextInt();
		System.out.println("Enter The RateOFIntrest: ");
		r = sc.nextInt();
		System.out.println("Enter The Principle Amount: ");
		p=sc.nextInt();
		sc.close();
		
		a= (p*((1+r)/q)*n*q);
		System.out.println("The Amount Is: " + a);
				
	}

}
