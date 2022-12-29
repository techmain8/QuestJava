package oneOnOne;

import java.util.Scanner;

public class Employee 
{
	int empid;
	String name;
	int age;

	public static void main(String[] args) 
	{
		Employee[] employees = new Employee[5];
		
		for(int i=0; i<5; i++) 
		{
			employees[i]= new Employee();
			employees[i].read();
		}
		for(Employee employee:employees) 
		{
			employee.display();
			System.out.println();
		}
	}

	void display() 
	{
		System.out.println("Name: "+name);
		System.out.println("Empid: "+empid);
		System.out.println("Age: "+age);
	}

	public void read() 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter The Name Of Employee: ");
		name= input.next();
		System.out.println("Enter The Employee id: ");
		empid = input.nextInt();
		System.out.println("Enter The Age: ");
		age = input.nextInt();
	}

}
