package files;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;

public class BufferedInputStreamExample 
{

	public static void main(String[] args) 
	{
		String str = "This is an example of BufferedInputStream Class";
		
		byte[] buffer = str.getBytes();
		
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
		}
		catch(Exception x)
		{
			
		}
	}

}
