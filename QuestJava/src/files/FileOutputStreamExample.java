package files;

import java.io.FileOutputStream;

public class FileOutputStreamExample 
{

	public static void main(String[] args) 
	{
//		boolean append;
		
		String str = "This Is An Example Of FileOutputStream Class";
//		String str2 = "We Have Written To File Using Write() Method";
		byte[] content = str.getBytes();
		
		try(FileOutputStream fos = new FileOutputStream("C:\\Users\\ALEXABHI88\\Desktop\\Quest Global\\cmdprograms\\File1.txt"))
		{
			for(int i=0; i<content.length; i++)
			{
				fos.write(content[i]);
			}
		}
		catch(Exception x)
		{
			System.out.println(x);
		}
		
		
	}
}
