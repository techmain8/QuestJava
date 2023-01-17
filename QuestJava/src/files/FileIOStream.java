package files;

import java.io.BufferedInputStream;
import java.io.FileInputStream;


public class FileIOStream 
{
	public static void main(String[] args) 
	{
		try(FileInputStream fis = new FileInputStream("C:\\Users\\ALEXABHI88\\Desktop\\Quest Global\\cmdprograms\\FileIOtest.txt");
				BufferedInputStream bis = new BufferedInputStream(fis))
		{
			int availableByte = fis.available();
			System.out.println(availableByte);
			
			
			System.out.println(fis.markSupported());
			System.out.println();
			int ch ;
			//to read only first element in a file 
//			ch= fis.read();
//			System.out.println(ch);
			//to read all the contents in a file 
			while((ch=fis.read())!=-1)
			{
				System.out.print((char)ch);
			}
			System.out.println();
			byte[] buff = new byte[10];
			while((bis.available())!=-1)
			{
				bis.read(buff, 0, 10);
				for(byte b:buff)
				{
					System.out.println((char)b);
				}
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}

}
