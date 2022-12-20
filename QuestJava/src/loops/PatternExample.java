package loops;

import java.util.Scanner;

public class PatternExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j,k,p,n= 0;
		System.out.println("Enter The Number :");
		n =sc.nextInt();
		sc.close();
		System.out.println("\nRightAngle Triangle:");
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++) 
			{
				System.out.print(j+ " ");
			}
			System.out.println();
		}
		i = 0;j = 0;
		System.out.println();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("\nPyramid Pattern :");
		i = 0;j = 0;
		for(i=1;i<=n;i++) 
		{
			for(p=1;p<=(n-i);p++) 
			{
				System.out.print("  ");
			}
			for (k=1;k<=(i-1);k++) 
			{
				System.out.print("* ");
			}
			for(j=i;j>=1;j--) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("\nReverseRightAngle Triangle:");
		for(i=1;i<=n;i++)
		{
			for(p=1;p<=(n-i);p++) 
			{
				System.out.print("  ");
			}
			for(j=1;j<=(i);j++) 
			{
				System.out.print( "* ");
			}
			System.out.println();
		}
	}
}
