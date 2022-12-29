package javaPractice;
import java.util.Scanner;
public class BankDeposits 
{
	static double amount,noOfYears,interest=0,data=1,div,power,CompoundInterest,n=12;
	static char choice;
	
	public static void compound(double div,double amount,double noOfYears,double interest) 
	{
		div=(1+(interest/n));
		power = n*noOfYears;
		for(;power!=0;--power)
		{
		 data=data*div;
		}
		CompoundInterest = amount*data;
		System.out.println("The Compound Interest is: "+CompoundInterest);
		System.out.println("The Interest amount is: "+(CompoundInterest-amount));
	}
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		while(true) 
		{
			System.out.println("Enter the Amount To Be Deposited: ");
			amount = scan.nextFloat();
			System.out.println("Enter The Number Of Years: ");
			noOfYears = scan.nextInt();
	
			if(amount<2000 && noOfYears>=2)
			{
				interest+=0.05f;
				compound(div,amount,noOfYears,interest);
			}
			else if(amount<2000 || amount>6000 && noOfYears >= 2) 
			{
					interest+=0.07f;
					compound(div,amount,noOfYears,interest);
			}
			else if(amount<6000 && noOfYears<1) 
			{
				interest+=0.08f;
				compound(div,amount,noOfYears,interest);
			}
			else if(noOfYears>5) 
			{
				interest+=.10f;
				compound(div,amount,noOfYears,interest);
			}
			else 
			{
				interest+=0.03f;
				compound(div,amount,noOfYears,interest);
			}

			System.out.println("Enter Your Choice (1/2):");
			System.out.println("1.Calcaulate Intrest..\n2.Quit..");
			choice = scan.next().charAt(0);
			if(choice =='2') 
			{
				break;
			}
			else if(choice== '1')
			{
				
			}
			else 
			{
				System.out.println("Entered choice is not vaild....");
			}
			
		}
	}
}
