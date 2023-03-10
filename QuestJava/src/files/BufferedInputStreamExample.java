package files;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class BufferedInputStreamExample 
{

	public static void main(String[] args) 
	{
		//data as a string to read  
		String str = "This is an example of BufferedInputStream Class";
		
		byte[] buffer = str.getBytes();
		//reading from buffer by  byte array 
		//then converting that from byte to byte code 
		try(ByteArrayInputStream bin = new ByteArrayInputStream(buffer);
			BufferedInputStream bis = new BufferedInputStream(bin))
		{
			
//			int ch ;
//			while((ch = bis.read())!=-1)
//			{
//				System.out.print((char)ch);
//			}
			byte[] readbuf = new byte[15];
			
			bis.read(readbuf,3,10);
			for(byte b :readbuf)
			{
				System.out.print((char)b);
			}
			bis.close();
			bin.close();
			
		}
		catch(IOException x)
		{
			
		}
	}

}
