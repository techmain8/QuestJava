package oops_inheritance;

public class TV 
{
	private String nameOfCompany;
	private int screenSize;
	
	public TV() 
	{
		
	}
	public TV(String nameOfCompany,int screenSize) 
	{
		this.nameOfCompany=nameOfCompany;
		this.screenSize=screenSize;
	}
	public String getNameOfCompany() {
		return nameOfCompany;
	}
	public void setNameOfCompany(String nameOfCompany) {
		this.nameOfCompany = nameOfCompany;
	}
	public int getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}
	public void displayTV() 
	{
		System.out.println("Name Of Compnay Is: "+getNameOfCompany());
		System.out.println("ScreenSize Is: "+getScreenSize());
	}
}
