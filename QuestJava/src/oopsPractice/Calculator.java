package oopsPractice;

import java.util.Scanner;

public class Calculator 
{
	static int number1,number2;
	static char symbol;
	static double operation =0;
	public void read() 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter The First Number: ");
		number1 = input.nextInt();
		System.out.println("Enter The Second Number: ");
		number2 = input.nextInt();
		System.out.println("'+' symbol for addition \n'-' symbol for substraction \n'*' symbol for multiplication \n'/' symbol for quotient \n'%' symbol for remainder\n");
		symbol = input.next().charAt(0);
		performAction(symbol,number1,number2);
	}
	
	public void performAction(char symbol,int num1, int num2) 
	{
		 switch(symbol)
		 {
		 	case '+' : operation= num1 + num2;
		 				System.out.println("the addition of two numbers is :\t" + operation);
		 				break;
		 	case '-' : if(num1 > num2) 
		 				{
		 					operation = num1 - num2 ;
		 					System.out.println("the difference between them is :" + operation);
		 				}
						else 
						{
							operation = num2 -num1 ;
							System.out.println("the difference between them is :" + operation);
						}
		 				break;
		 	case '*' : operation = num1 * num2 ;
		 				System.out.println("the product of them is :" + operation);
		 				break;
		 	case '/' :  if(num2 == 0)
		 				{
		 					System.out.println("Division by zero is not valid.");
		 				}
		 				else 
		 				{
		 						operation = num1 / num2 ;
		 						System.out.println("the quotient of them is :" + operation);
		 				}
		 				break;
		 	case '%' : operation = num1 % num2 ;
		 					System.out.println("the remainder of them is :" + operation);
		 					break;
		 	default : System.out.println("invalid symbol!");
		 }
		 
	}
	public  void main(String[] args) 
	{
		read();
		
	}

	

}
