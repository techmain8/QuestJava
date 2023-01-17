package files;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class  BufferedWritterExample2
{
	public static void main(String[] args) 
	{

		
		try{
			BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));

			String lang[] = {"java","C++","Python","C#"};
			bw.write("Eample of oops lanugages are: \n");
			
			for(int i=0; i<lang.length; i++)
			{
				bw.newLine();
				bw.write(lang[i]);
				bw.flush();
			}
		}
		catch(IOException x)
		{
			System.out.println("Exception " +x);
		}
		
		
		
	}
	
	
}
