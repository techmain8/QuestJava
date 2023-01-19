package objectIO;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Employee implements Serializable
{
	private int empid;
	private String empname;
	private String empaddres;
	
	
	public Employee(int empid, String empname, String empaddres) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empaddres = empaddres;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpaddres() {
		return empaddres;
	}
	public void setEmpaddres(String empaddres) {
		this.empaddres = empaddres;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empaddres=" + empaddres + "]";
	}
	
	
}
