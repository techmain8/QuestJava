package assessment05;

import java.util.Scanner;

public class ABCFinancialServiceDriver 
{
	public static void main(String[] args) 
	{
		boolean loop = true;
		Scanner input = new Scanner(System.in);
		int choice;
		String accountNumber;
		double depositAmount, withdrawAmount, balance;

		ABCFinancialService.connectToDb();

		while(loop) 
		{
			System.out.println("Wellcome To Bank...");
			System.out.println("1. Create a new account");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. View account balance");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			choice = input.nextInt();
			switch (choice) 
			{
			case 1:
				System.out.print("Enter account number: ");
				accountNumber = input.next();
				ABCFinancialService.createAccount(accountNumber);
				break;
			case 2:
				System.out.print("Enter account number: ");
				accountNumber = input.next();
				System.out.print("Enter deposit amount: ");
				depositAmount = input.nextDouble();
				ABCFinancialService.deposit(accountNumber, depositAmount);
				break;
			case 3:
				System.out.print("Enter account number: ");
				accountNumber = input.next();
				System.out.print("Enter withdraw amount: ");
				withdrawAmount = input.nextDouble();
				ABCFinancialService.withdraw(accountNumber, withdrawAmount);
				break;
			case 4:
				System.out.print("Enter Account Number: ");
				accountNumber = input.next();
				balance = ABCFinancialService.viewBalance(accountNumber);
				System.out.println("Account balance: " + balance);
				break;
			case 5:
					loop =false;
					break;
			default:
				System.out.println("Invalid choice");
			}
		}
		System.out.println("Exiting program...");
		input.close();
	}

	
}