package drivers;

import java.util.Scanner;

import javaPractice.Book;

public class BookDriver 
{
	public static void main(String[] args) 
	{
		Scanner scan = new  Scanner(System.in);	
		
		System.out.println("Enter the Book details :");
		String bname = scan.nextLine();
		 
		System.out.println("Enter the book Number");
		int bnumber = scan.nextInt();
		
		Book book = new Book(bnumber,bname);
		System.out.println(book);
	}
	
}
