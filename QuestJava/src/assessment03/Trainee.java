package assessment03;
//child class of Employee
public class Trainee extends Employee implements EmployeeSalary 
{

	public Trainee(String name, int id, String email, String type, String address) {
		super(name, id, email, type, address);
		
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

