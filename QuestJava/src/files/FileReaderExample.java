package files;

import java.io.FileReader;

public class FileReaderExample 
{

	public static void main(String[] args) 
	{
		try(FileReader fr=  new FileReader("C:\\Users\\ALEXABHI88\\Desktop\\Quest Global\\cmdprograms\\File2.txt"))
		{
			char[] content = new char[108];
			
			fr.read(content);
			//trying using for loop for reading all the content
//			for(int i=0;i<content.length;i++)
//			{
//				fr.read(content);
//			}
			System.out.println(content);
			
		}
		catch(Exception x)
		{
			System.out.println(x);
		}
		
		
		
	}

}
