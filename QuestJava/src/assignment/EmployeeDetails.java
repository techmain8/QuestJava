package assignment;

public class EmployeeDetails 
{
	private String name;
	private int Empid;
	private String designation;
	private long phoneNo;
	
	
	public EmployeeDetails(String name,int Empid,String designation,long phoneNo)
	{
		this.name=name;
		this.Empid=Empid;
		this.designation=designation;
		this.phoneNo=phoneNo;
	}
	
	public void setname(String name) 
	{
		this.name=name;
	}
	public void setEmpid(int Empid) 
	{
		this.Empid=Empid;
	}
	public void setdesignation(String designation) 
	{
		this.designation=designation;
	}
	public void setphoneNo(long phoneNo) 
	{
		this.phoneNo=phoneNo;
	}
	public String getname() 
	{
		return name;
	}
	public int getEmpid() 
	{
		return Empid;
	}
	public String getdesignation() 
	{
		return designation;
	}
	public long getphoneNo() 
	{
		return phoneNo;
	}
	
	public void display() 
	{
		System.out.println("Name: \t\t"+name);
		System.out.println("Empid: \t\t"+Empid);
		System.out.println("designation: \t"+designation);
		System.out.println("phoneNo: \t"+phoneNo);
	}
}
