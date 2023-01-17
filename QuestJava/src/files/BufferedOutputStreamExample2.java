package files;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample2 
{

	public static void main(String[] args) throws IOException 
	{
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\ALEXABHI88\\Desktop\\Quest Global\\cmdprograms\\File2.txt"));
		
		String str = "this is an example of writing a file using bufferedoutputStream file";
		
		byte[] content = str.getBytes();
		bos.write(content);
		
		bos.close();
		
		BufferedOutputStream bos2 = new BufferedOutputStream(new FileOutputStream("C:\\Users\\ALEXABHI88\\Desktop\\Quest Global\\cmdprograms\\File2.txt"));
		String str2 = "Content Written to the file Successfully";
		byte[] content2 = str2.getBytes();
		for(int i=0; i< content2.length; i++)
		{
			bos2.write(content2[i]);
		}
		bos2.close();
		
	}

}
