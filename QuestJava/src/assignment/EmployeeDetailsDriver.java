package assignment;

import java.util.Scanner;

public class EmployeeDetailsDriver 
{
	static String name,designation;
	static int Empid;
	static long phoneNo;
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter The Number Of Details To Enter: ");
		int size = input.nextInt();
		
		EmployeeDetails[] scan = new EmployeeDetails[size];
		
		for(int i=0; i<size; i++) 
		{
			System.out.println("Enter The Name Of Employee "+(i+1)+" : ");
			name=input.next();
			System.out.println("Enter The EmployeeID "+(i+1)+": ");
			Empid=input.nextInt();
			System.out.println("Enter The Designation "+(i+1)+": ");
			designation=input.next();
			System.out.println("Enter The Mobile Number "+(i+1)+": ");
			phoneNo =input.nextLong();
			
			scan[i]= new EmployeeDetails(name,Empid,designation,phoneNo);
		}
		System.out.println("\nThe Entered Details Are: ");
		for(int i=0; i<size; i++) 
		{
			scan[i].display();
		}
	}

}
