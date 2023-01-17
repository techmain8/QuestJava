package files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample
{

	public static void main(String[] args) 
	{
		try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ALEXABHI88\\Desktop\\Quest Global\\cmdprograms\\File3.txt")))
		{
			while((br.read())!=-1)	
			{
				String line = br.readLine();
				System.out.println(line);
			}
		}
		catch(Exception x)
		{
			System.out.println(x);
		}
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
		{
			System.out.println("Enter Your Name: ");
			String name = br.readLine();
			
			System.out.println("Enter Your Address: ");
			String address = br.readLine();
			
			System.out.println("Name: "+ name);
			System.out.println("Address: "+address);
		}
		catch(IOException x)
		{
			System.out.println(x);
		}
	}

}
