package files;

import java.io.FileWriter;

public class FileWriterExample 
{

	public static void main(String[] args) 
	{
		String str = "This is an example of filewritter class, this class is used to write small chunks of data";
		
		String str2 = "Hello this string is to show that u can extra values in string onceagain ..";
		try(FileWriter fw = new FileWriter("C:\\Users\\ALEXABHI88\\Desktop\\Quest Global\\cmdprograms\\File3.txt"))	
		{
//			fw.write(str,0,str.length());
			
			
			for (int i=0; i<str.length(); i++)
			{
				fw.write(str.charAt(i));
			}
			
			fw.write(str2, 89, str2.length());
		}
		catch(Exception x)
		{
			System.out.println("Exception :"+x);
		}
	}

}
