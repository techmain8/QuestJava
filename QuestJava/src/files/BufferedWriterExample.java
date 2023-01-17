package files;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class BufferedWriterExample
{

	public static void main(String[] args) 
	{
		try(BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out)))
		{
			String lang[] = {"java","C++","Python","C#"};
			bw.write("Eample of oops lanugages are: \n");
			
			for(String l :lang)
			{
				bw.write(l);
				bw.newLine();
				bw.flush();
			}
		}
		catch(Exception x)
		{
			System.out.println("Exception " +x);
		}
		
		
	}

}
