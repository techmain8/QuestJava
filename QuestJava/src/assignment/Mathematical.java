package assignment;
import java.util.Scanner;

public class Mathematical {

	public static void main(String[] args) {
		double num1, num2 , operation;
		char symbol;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The First Number :");
		num1 = sc.nextDouble();
		System.out.println("Enter The Second Number :");
		num2 = sc.nextDouble();
		System.out.println("Enter the required operation to be performed between them:");
		System.out.println("'+' symbol for addition \n'-' symbol for substraction \n'*' symbol for multiplication \n'/' symbol for quotient \n'%' symbol for remainder\n");
		symbol = sc.next().charAt(0);
		sc.close();
		
		if(symbol == '+') 
		{
			operation = num1 + num2 ;
			System.out.println("the addtion of two numbers is :" + operation);
		}
		else if(symbol == '-') 
		{
			if(num1 > num2) {
			operation = num1 - num2 ;
			System.out.println("the diffrence between them is :" + operation);
			}
			else {
				operation = num2 -num1 ;
				System.out.println("the diffrence between them is :" + operation);
			}
		}
		else if(symbol == '*') 
		{
			operation = num1 * num2 ;
			System.out.println("the product of them is :" + operation);
		}
		else if(symbol == '/') 
		{
			if(num2 == 0)
			{
				System.out.println("Division by zero is not vaild.");
			}
			else 
			{
				operation = num1 / num2 ;
				System.out.println("the qoutient of them is :" + operation);
			}
		}
		else if(symbol == '%') 
		{
			operation = num1 % num2 ;
			System.out.println("the remainder of them is :" + operation);
		}
		else 
		{
			System.out.println("invalid symbol!");
		}
		System.out.println("Thank You...");
		
		//solution with switch case
		/*
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
		 */
	}

}
