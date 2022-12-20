package assignment;
import java.util.Scanner;

public class Dinsurance 
{
	public static void main(String[] args) 
	{
		char gender;
		boolean maritialStatus;
		int age;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Is Driver married (true or false): \n  ");
		maritialStatus = input.nextBoolean();
		
		System.out.println("What is the Age of Driver:\n");
		age = input.nextInt();

		System.out.println("What is the Gender of Driver(m or f): \n ");
		gender = input.next().charAt(0);
		input.close();
		System.out.println("reading completed!");
		
		//solution working
		if(maritialStatus == true) {
			System.out.println("Driver is insured!");
		} else {
			if(gender == 'm') {
				if(age > 30) {
					System.out.println("Driver is insured..");
				} else {
					System.out.println("Driver is not insured!");
				}
			} else if (gender == 'f') {
				if(age > 25) {
					System.out.println("Driver is insured..");
				} else {
					System.out.println("Driver is not insured!");
				}
			} else {
				System.out.println("Please input correct gender");
			}
		}
		
		//solution failed
		/*
		  if("true".equals(maritialStatus))
		{
			System.out.println("The Driver is Insured..");
		}
		else if(("false".equals(maritialStatus)) && ("f".equals(gender)) && (age >= 25)){
			System.out.println("The Driver is Insured..");
		}
		else if(("true".equals(maritialStatus)) && ("m".equals(gender)) && (age >= 30)) {
			System.out.println("The Driver is Insured..");
		}
		else {
			System.out.println("The Driver is Not Insured..");
		}
		*/
	}
}
