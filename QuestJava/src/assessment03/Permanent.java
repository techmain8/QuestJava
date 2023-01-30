package assessment03;
//child class of Employee
public class Permanent extends Employee implements EmployeeSalary 
{
	
	
	public Permanent(String name, int id, String email, String type, String address,int sales) {
		super(name, id, email, type, address);
		this.sales= sales;
	}
	
	
	//Function Overriding
	@Override
	public void calculateSalary() 
	{
		if(getType().equals("sales"))
		{
			setSalary(salary+1000);
		}
		else if(getType().equals("management"))
		{
			setSalary(salary);
		}
		else 
		{
			setSalary(0);
		}
		
	}


}
