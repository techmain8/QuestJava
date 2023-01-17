package files;


import java.io.File;
import java.io.FileInputStream;

public class Assignment1 {

	public static void main(String[] args) 
	{
		File file = new File("File2.txt");
		
		try{
			FileInputStream infile = new FileInputStream(file);
			int count=0;
			int toread;
			while(( toread=infile.read())!=-1)	
			{
				char readcharacter = (char) toread;

				System.out.print(readcharacter);
				count++;
			}
			System.out.println(" \n"+count);
		}
		catch(Exception x)
		{
			System.out.println("Exception Found: "+x);
		}
		
		
	}

}
