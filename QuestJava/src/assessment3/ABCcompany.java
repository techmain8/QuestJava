package assessment3;
import java.util.Arrays;
//DataaccessObject 
import java.util.Scanner;


public class ABCcompany 
{
	private Employee employee[];
	private int length;
	private int index; //acts like a cursor
	
	public ABCcompany(int length) {
		
		this.length = length;
		this.employee = new Employee[length];
		this.index = 0;
	}
	
	public int getPosition() {
		return this.index + 1;
	}

	public int getLength() {
		return length;
	}
	
	public Employee[] getEmployee() 
	{
		return this.employee;
	}


	public void addEmployee(Employee employee) 
	{
		this.employee[this.index] = employee;
		++this.index;
		
	}
	
	//Function overload 
	public Employee getEmployee(int id) 
	{
		for(Employee employe : this.employee) 
	  	{
	  		if(employe == null) 
	  			continue;
	  		
	  		if(employe.getId() == id) 
	  			return employe;
	  	}	
		return null;
	}
	//Function overload 
	public Employee getEmployee(String address)
	{
		for(Employee employe: this.employee)
		{
			if(employe == null) continue;
			
			if(employe.getAddress()== address)
				return employe;
		}
		return null;	
	}
	public Employee getEmployeeEmail(String email)
	{
		for(Employee employe: this.employee)
		{
			if(employe == null) continue;
			
			if(employe.getEmail()== email)
				return employe;
		}
		return null;	
	}
	public Employee getEmployeeType(String type)
	{
		for(Employee employe: this.employee)
		{
			if(employe == null) continue;
			
			if(employe.getType()== type)
				return employe;
		}
		return null;	
	}
	public void updateEmployee(int id,Scanner scanner) 
	{
		  Employee employee = this.getEmployee(id);
			if(employee == null) 
			{
				System.out.println("Oops No Such Record Found!!!..");
			}
			else 
			{
				System.out.println(employee.getId()+" | "+employee.getName());
				System.out.println("Adding Employee to Position : "+this.getPosition()+"/"+this.getLength());
				System.out.println("Enter Name : ");
				String name = scanner.next();
				employee.setName(name);
			}
	}

	public void updateEmployee(String address, Scanner scanner) 
	{
		Employee employee = this.getEmployee(address);
		if(employee == null)
		{
			System.out.println("Oops No Such Record Found!!!..");
		}
		else
		{
			System.out.println(employee.getId()+" | "+employee.getName());
			System.out.println("Adding Employee to Position : "+this.getPosition()+"/"+this.getLength());
			System.out.println("Enter Address : ");
			String addres = scanner.next();
			employee.setAddress(addres);
		}
	}
	public void updateEmployeeEmail(String email, Scanner scanner) 
	{
		Employee employee = this.getEmployeeEmail(email);
		if(employee == null)
		{
			System.out.println("Oops No Such Record Found!!!..");
		}
		else
		{
			System.out.println(employee.getId()+" | "+employee.getName());
			System.out.println("Adding Employee to Position : "+this.getPosition()+"/"+this.getLength());
			System.out.println("Enter Email : ");
			String emails = scanner.next();
			employee.setEmail(emails);
		}
	}public void updateEmployeeType(String type, Scanner scanner) 
	{
		Employee employee = this.getEmployeeType(type);
		if(employee == null)
		{
			System.out.println("Oops No Such Record Found!!!..");
		}
		else
		{
			System.out.println(employee.getId()+" | "+employee.getName());
			System.out.println("Adding Employee to Position : "+this.getPosition()+"/"+this.getLength());
			System.out.println("Enter Type : ");
			String types = scanner.next();
			employee.setType(types);
		}
	}
	
	//Function Overriding
	@Override
	public String toString() {
		return "ABCcompany [employee=" + Arrays.toString(employee) + ", length=" + length + ", index=" + index + "]";
	}
	
}