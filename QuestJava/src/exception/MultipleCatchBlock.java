package exception;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchBlock 
{
	public static void main(String[] args) throws IOException 
	{
		int age;
		long phone[] = new long[10];
		Scanner scan = new Scanner(System.in);
		System.out.println("To Check Mulitple Exception'S.");
		System.out.println("Enter The Age,phone: ");
		try {
	        age=scan.nextInt();
	        for(int i=0; i<10; i++)
	        	phone[i]= scan.nextLong();
	        @SuppressWarnings("unused")
			int i= age/0;
	    } 
		catch(ArithmeticException ae) {
			System.out.println("Inside ArithmeticException Bloack: "+ae);
		}
	    catch(InputMismatchException ime) {
	        System.out.println("Inside InputMismatchException block"+ime);
	    }
		catch(ArrayIndexOutOfBoundsException aiobe) 
		{
			System.out.println("Inside ArrayIndexOutOfBoundsException Block: "+ aiobe);
		}
	    catch(Exception e) {
			System.out.println("Inside Exception block :"+e);
		}
	    finally {
	       System.out.println("The Finally Block: Thank You...");
	    }
		System.out.println("Bye...");
	}
}