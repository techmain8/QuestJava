package assessment03;

//pojo class 
public class Employee 
{
	private String name;
	private int id;
	private String email;
	private String type;
	private String address;
	protected double salary;
	protected int sales;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		
		
		return id;
	}

	public String getName() {

		return name;
	}
	

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(String name, int id, String email, String type,String address) {
		this.name = name;
		this.id = id;
		this.email=email;
		this.type=type;
		this.address=address;
	}
	//function Overriding 
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", email=" + email + ", type=" + type + ", address=" + address
				+ "]";
	}


}
