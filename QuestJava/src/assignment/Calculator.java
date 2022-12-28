package assignment;

import java.util.Scanner;

public class Calculator 
{
	static double operation = 0;
	static int number1,number2;
	static char symbol;
	
	public static void read() 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter The First Number: ");
		number1 = input.nextInt();
		System.out.println("Enter The Second Number: ");
		number2 = input.nextInt();
		System.out.println("'+' symbol for addition \n'-' symbol for substraction \n'*' symbol for multiplication \n'/' symbol for quotient \n'%' symbol for remainder\n");
		System.out.println("Enter The Symbol: ");
		symbol = input.next().charAt(0);
		Calculator.performAction(symbol,number1,number2);
	}
	public static void performAction(char symbol,int num1, int num2) 
	{
		 switch(symbol)
		 {
		 	case '+' : {
		 				operation= Number.Sum(num1, num2);
		 				break;
		 				}
		 	case '-' :{
		 				operation = Number.Difference(num1,num2) ;
		 				break;
		 				}
		 	case '*' : {
		 				operation = Number.Product(num1,num2) ;
		 				break;
		 				}
		 	case '/' :  {
		 				operation = Number.Quotient(num1, num2);
		 				break;			
		 				}
		 	case '%' : {
	 					operation = Number.Remainder(num1,num2);
	 					break;
		 				}
		 	default : {
		 				operation = 0;
		 				System.out.println("invalid symbol!");
		 				}
		 }
			System.out.println("The Result Is: " + operation);
		 
	}
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		while(true) 
		{
			read();
			System.out.println("Do you want continue?(Y/N)");
			char Exit = scan.next().charAt(0);
			if(Exit == 'N' || Exit == 'n') 
			{
				break;
			}
		}
		System.out.println("Bye...");
		
	}

}
