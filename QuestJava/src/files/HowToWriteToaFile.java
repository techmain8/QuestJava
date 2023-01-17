package files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;



public class HowToWriteToaFile 
{
	public static void main(String[] args) throws IOException 
	{
		@SuppressWarnings("unused")
		String s = "This Is Done By AlexAbhi:";
		// for writing into file 
		File file = new File("C:\\Users\\ALEXABHI88\\Desktop\\Quest Global\\cmdprograms\\Text.txt");
		if(file.exists())
		{
			System.out.println("Yes it's Present.");
			if(file.canWrite())
			{
				System.out.println("File : Writable");
			}
			else
			{
				System.out.println("File : Unwritable");
			}
		}
		else
		{
			System.out.println("No Such File Exists:");
			file.createNewFile();
			System.out.println("File Created At: "+file.getAbsolutePath());
		}
		
		FileOutputStream out = new FileOutputStream(file);
//		FileOutputStream out1 = new FileOutputStream("C:\\Users\\ALEXABHI88\\Desktop\\Quest_Global\\cmdprograms\\Text.txt");
//		FileOutputStream out2 = new FileOutputStream(file.getAbsolutePath());
		
		
		for(char i= 'A'; i<250; i++)
		{
			out.write(i);
			System.out.println(i+" Written.");
		}
		
		
	}
	
}
