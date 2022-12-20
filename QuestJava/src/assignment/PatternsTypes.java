package assignment;

import java.util.Scanner;

public class PatternsTypes {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b,c,d,i,j,k,l,p,n= 0;
		System.out.println("Enter The Number :");
		n =sc.nextInt();
		sc.close();
		
		
		System.out.println("\nRightAngle Triangle pattern1:");
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++) 
			{
				System.out.print(j+ " ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Star Pattern 2;");
		i = 0;j = 0;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Reverse Numbers pattern 3");
		i = 0;j = 0;
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=(n-i+1);j++) 
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		
	
		System.out.println("Pattern 1 to 10 pattern 4:");
		c=1;
		for(a=1; a<n; a++) 
		{
			for(d=n-a; d>1; d--) {
				System.out.print(" ");
			}
			for(b=0; b<a; b++) 
			{
				System.out.print(c++ +" ");
			}
			System.out.println();
			if(b==n)
			{
				break;
			}
		}
		System.out.println();
		
		
		System.out.println("Star Pattern 5;");
		i = 0;j = 0;k=0;
		for(i=1; i<=n; i++) 
		{
			for(j=i; j<=n; j++) 
			{
				System.out.print("  ");
			}
			for(j=1; j<i; j++) 
			{
				if(j%2!=0) 
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			for(j=i; j>=1; j--) 
			{	
				if(j%2!=0) 
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	


		
	
		System.out.println("\nPyramid Pattern 6:");
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
		System.out.println();
		
		
		
		System.out.println("\nPattern 7");
		i = 0; j = 0; k = 0;
		for(i=1; i<=n; i++) 
		{
			for(j=1; j<=i; j++) 
			{
				System.out.print(" ");
			}
			for(k=n+1-i; k>=1; k--) 
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
		System.out.println();
		
		
		System.out.println("Star Diamond Pattern 8;");
		i = 0;j = 0;k=0;
		for(i=1; i<=n; i++) 
		{
			for(j=i; j<=n; j++) 
			{
				System.out.print("  ");
			}
			for(j=1; j<i; j++) 
			{
				if(j%2!=0) 
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			for(j=i; j>=1; j--) 
			{	
				if(j%2!=0) 
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		for(i=1; i<=n; i++) 
		{
			for(j=n-i; j<=n; j++) 
			{
				System.out.print("  ");
			}
			for(j=1; j<n-i; j++) 
			{
				if(j%2!=0) 
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			for(j=n-i; j>=1; j--) 
			{	
				if(j%2!=0) 
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		
		System.out.println("Pattern 9");
		i = 0; j = 0; k = 0;
		for(i = 1; i <= n; i++) 
		{
			for(j = 1; j < i; j++) 
			{
				System.out.print("  ");
			}
			
			for( k = n+1-i; k >= 1; k--) 
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
		System.out.println();
		
		
		
		System.out.println("\nPattern 10");
		i = 0; j = 0; k = 0;
		char A = 65;
		for(i=1;i<=n;i++) 
		{
			for(l=1;l<=(n-i);l++) 
			{
				System.out.print("  ");
			}
			for (k=1;k<=(i-1);k++) 
			{
				System.out.print(" ");
			}
			for(j=i;j>=1;j--) 
			{
				System.out.print(A +" ");
				A++;
			}
			System.out.println();
		}
		
		System.out.println("\n Pattern 11 (Alphabet)");
		i =0 ;j =0; 
		for (i=1; i<=n; i++)
		{
			for(j=1;j<=n;j++) 
			{
				if(i==1 ||j==1||i==n||j==n) 
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		for (i=2; i<=n; i++)
		{
			for(j=1;j<=n;j++) 
			{
				if(i==1 || j==1||j==n) 
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}