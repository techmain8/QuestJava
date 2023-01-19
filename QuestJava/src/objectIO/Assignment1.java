package objectIO;

import java.io.FileWriter;
import java.util.Scanner;

public class Assignment1 
{

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
	
		String name ;
		
		System.out.println("Enter The Name :");
		name= scan.nextLine();
		
		try(FileWriter fw = new FileWriter("File1.txt")) 
		{
			
			fw.write(name);
		
			fw.close();
			
		}
		catch(Exception x)
		{
			System.out.println(x);
		}
		System.out.println("Data Entered Succefully.");
	}

}

