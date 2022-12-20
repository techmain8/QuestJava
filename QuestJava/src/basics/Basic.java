package basics;

public class Basic 
{
	public static void main(String[] args) 
	{
		//Declaring variables
		int num1,num2,sum;
		char ch ;
		boolean bool;
		float fnum = 2.25f;
		
		int num3 = 15;

		
		//initilazition 
		num1 = 10 ;
		num2 = 15 ;
		sum = num1 + num2 ;
		ch = 'A';
		bool = true ;
		System.out.println("Enter");

	
		
		
		//displaying 
		System.out.println("num1 = \t" + num1);
		System.out.println("num2 = \t" + num2);
		System.out.println("sum = \t" + sum);
		System.out.println("float = \t" + fnum);
		System.out.println("char = \t" + ch);
		System.out.println("boolen = \t" + bool);
		
		//comparisons 
		System.out.println(num1 > num2);
		System.out.println(num2 > num1);
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);
		System.out.println(num2 == num3);
		System.out.println(num2 != num3);
		
		
		//logical operators 
		int n1, n2, n3;
		
		n1 = 4 ;
		n2 = 6 ;
		n3 = 3 ;
		
		//
		System.out.println("is n2 greater \t" +((n2 > n1) && (n2 > n3)));
		System.out.println("is n1 not the smallest \t" + ((n1 > n2) || (n1 > n3)));
	}
}
