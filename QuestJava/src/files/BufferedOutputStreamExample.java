package files;

import java.io.BufferedOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample 
{
	public static void main(String[] args) throws IOException 
	{
		try(BufferedOutputStream bos = new BufferedOutputStream(System.out))
		{
			String str = "Example of BufferedOutputStream class";
			byte[] content = str.getBytes();
			
			bos.write(content);
			bos.flush();
		}
		
		
		
	}
}
