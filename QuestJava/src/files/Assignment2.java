 package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Assignment2 
{
	
	public static void main(String[] args) 
	{
		File file = new File("File2.txt");
		File tobecopied = new File("File4.txt");
		
		try{
			tobecopied.createNewFile();
			FileInputStream infile = new FileInputStream(file);
			FileOutputStream outfile =  new FileOutputStream(tobecopied);
	
			int toread;
			while(( toread=infile.read())!=-1)	
			{
				char readcharacter = (char) toread;
				outfile.write(readcharacter);
			}
		}
		catch(Exception x)
		{
			System.out.println("Exception Found: "+x);
		}
		
		
	}

}
