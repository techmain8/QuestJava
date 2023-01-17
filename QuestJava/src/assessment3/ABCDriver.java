package assessment3;

import java.util.Scanner;
//Task 1 : Store details of 10 employees. done 
//Task 2 : Update the details of an employee. done
//Task 3 : Update address of an employee. done
//Task 4 : Compute salary of all employees.
//Task 5 : Display details of all employees. done


public class ABCDriver 
{

	public static void main(String[] args) 
	{
		boolean loop = true;
		boolean loop2 = true;
		Scanner scanner = new Scanner(System.in);
		int option;
		
		System.out.println("ABC Compnay Employee Management\n====================");
		System.out.println("Enter The Number Of Employees!!");
		
		ABCcompany abc = new ABCcompany(scanner.nextInt());
		
		//for fixed entries we can have case:1 data here ..
		while(loop) {
			
			System.out.println("\nSELECT AN OPTION\n=================");
			System.out.println("1) Add a Employee");
			System.out.println("2) List a Employee");
			System.out.println("3) List all Employee");
			System.out.println("4) Update a Employee");
			System.out.println("5) Calculate Salary");
			System.out.println("6) Quit");
			
			
			option = scanner.nextInt();
			
			switch(option) {
				case 1:{
					
					System.out.println("Adding Employee to Position : "+abc.getPosition()+"/"+abc.getLength());
					System.out.println("Enter Name : ");
					String name = scanner.next();
					System.out.println("Enter Id : ");
					int id = scanner.nextInt();
					System.out.println("Enter The Email : ");
					String email = scanner.next();
					System.out.println("Enter The Address : ");
					String address =scanner.next();
					System.out.println("Enter Your Department Type (sales or management): ");
					String type = scanner.next();
					
					Employee employee = new Employee(name,id,email,type,address);
					
					abc.addEmployee(employee);
					
					break;
				}
				case 2:{
					
					System.out.println("Enter the Id Of Employee : ");
					int id = scanner.nextInt();
					
					Employee employee = abc.getEmployee(id);
					
					if(employee == null) {
						
						System.out.println("Oops! No such record found");
						
					}
					else 
					{
						
						System.out.println(employee.getId()+" | "+employee.getName() +" | "+ employee.getEmail()+" | "+employee.getAddress()+" | "+ employee.getType());
					}
					
					break;
				}
				case 3:{
					
					System.out.println("All Employee's\n-------------");
					
					Employee employee[] = abc.getEmployee();
					
					for(Employee employees:employee) 
					{
						if(employees == null) continue;						
						System.out.println( employees.getId()+" | "+employees.getName() +" | "+
											employees.getEmail()+" | "+employees.getAddress()+" | "+
											employees.getType());
					}
					
					break;
				}
				case 4:{
					while (loop2) 
					{
						System.out.println("Chooce What to Update: ");
						System.out.println("1) Name:");
						System.out.println("2) email:");
						System.out.println("3) address:");
						System.out.println("4) type:");
						System.out.println("5) exit:");
						int num = scanner.nextInt();
						switch (num) 
						{
						case 1: {
							System.out.println("Enter The Id : ");
							int id = scanner.nextInt();

							abc.updateEmployee(id, scanner);
							break;
						}
						case 2: {
							System.out.println("Enter The email : ");
							String email = scanner.next();

							abc.updateEmployeeEmail(email, scanner);
							break;
						}
						case 3: {
							System.out.println("Enter The Address: ");
							String address = scanner.next();

							abc.updateEmployee(address, scanner);
							break;
						}
						case 4: {
							System.out.println("Enter The Type : ");
							String type = scanner.next();

							abc.updateEmployeeType(type, scanner);
							break;
						}
						case 5: {
							//System.exit(0);
							loop2 = false;
							break;
						}
						default: {
							System.out.println("Not A Vaild Option....");
						}
						}
					}
					break;
				}
				case 5:{
					
					System.out.println("Salary Calculating:....");
					System.out.println("Enter the sales of employee "+abc.getPosition()+"/"+abc.getLength());
					@SuppressWarnings("unused")
					int sales = scanner.nextInt();
					
					@SuppressWarnings("unused")
					Employee employee[] = abc.getEmployee();
					
					
					
					break;
				}
				case 6:{
					loop = false;
					//System.exit(0);
					break;
				}
				default: {
					System.out.println("Not A Valid Option...");
				}
			}
			
		}
		System.out.println("Thank you....");
	}

}
