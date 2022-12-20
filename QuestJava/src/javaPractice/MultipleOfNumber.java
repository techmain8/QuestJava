package javaPractice;

import java.util.Scanner;

public class MultipleOfNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int a, i;
		System.out.println("Enter The Number");
		a = sc.nextInt();
		sc.close();

		for (i = 1; i <= 10; i++) 
		{
			System.out.println(a + " x " + i + " : " + a * i);
		}

	}

}
