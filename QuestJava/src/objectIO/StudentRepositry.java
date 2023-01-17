package objectIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentRepositry 
{
	public static void main(String[] args) 
	{
		try(ObjectOutputStream objwrite = new ObjectOutputStream(new FileOutputStream("File.txt")))
		{
			Student stud1 = new Student("alex", 25, 8, 70, true);
			objwrite.writeObject(stud1);
			
			Student stud2 = new Student("abhi", 24, 2, 94.2f,false);
			objwrite.writeObject(stud2);
		}
		catch(Exception x)
		{
			System.out.println(x);
		}
		
		try(ObjectInputStream instream = new ObjectInputStream(new FileInputStream("File.txt")))
		{
			Object obj;
			int i;
			System.out.println(instream.available());
			
			obj=instream.readObject();
			System.out.println("Object read!");
			Student student = (Student) obj;
			System.out.println(student);
		}
		catch(IOException x)
		{
			System.out.println(x);
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
		
		
		
		
	}
	
}
