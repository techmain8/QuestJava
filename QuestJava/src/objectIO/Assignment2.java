package objectIO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment2 
{


	public static void main(String[] args) throws IOException 
	{
		int linecount=0;
		FileInputStream fw = new FileInputStream("File4.txt");
		
		BufferedReader bw = new BufferedReader(new InputStreamReader(fw));
		String line;
		while((line = bw.readLine())!= null)	
		{
			linecount++;
			String[] sarray = line.split(" ");
			System.out.println("Line:" + linecount + "  Word count=" + sarray.length);
		}
	}
}
