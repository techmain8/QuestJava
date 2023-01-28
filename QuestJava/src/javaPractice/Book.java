package javaPractice;




public class Book 
{
	public  Book[] book;
	public String bname;
	public int bnumber;
	
	public Book(int bnumber, String bname)
	{
		this.bnumber=bnumber;
		this.bname=bname;
	}
	
	public int isGreater()
	{
		return this.bnumber;
	}
	public void display()
	{
		System.out.println("Book Name: "+ this.bname);
		System.out.println("Book Number: "+ this.bnumber);
	}
	


}
