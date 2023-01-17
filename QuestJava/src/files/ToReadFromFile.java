package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ToReadFromFile 
{

	public static void main(String[] args)throws IOException 
	{
		File file = new File("C:\\Users\\ALEXABHI88\\Desktop\\Quest Global\\cmdprograms\\TextInput.txt");

		if(file.exists())
		{
			System.out.println("Yes it's Present.");
			if(file.canWrite())
			{
				System.out.println("File : Readble");
			}
			else
			{
				System.out.println("File : UnReadble");
			}
		}
		else
		{
			System.out.println("No Such File Exists:");
			file.createNewFile();
			System.out.println("File Created At: "+file.getAbsolutePath());
		}		
		
		//for reading a file 
		FileInputStream in = new FileInputStream(file);
//		while(in.read()!=1)
		int readByte;
		while((readByte = in.read())!=-1)	
		{
			char readcharacter = (char) readByte;
			
			System.out.print(readcharacter);
		}
		
		
		in.close();
		
		
	}

}
