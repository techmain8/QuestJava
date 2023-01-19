package objectIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Assignement3 
{

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		OutputStream os = new FileOutputStream("Studentobject.txt");
		ObjectOutputStream obj = new ObjectOutputStream(os);
		
		Scanner in = new Scanner(System.in);
		
		for(int i = 1; i <=3; i++) {
			
			System.out.println("Enter id: ");
		    int id = in.nextInt();
		    in.nextLine();
		    
		    System.out.println("Enter name: ");
		    String name = in.nextLine();
		    
		    System.out.println("Enter Address: ");
		    String address = in.nextLine();
		    
		    Employee employee = new Employee(id, name, address);
		    
		    obj.writeObject(employee);
		}
		
		ObjectInputStream objinput = new ObjectInputStream(new FileInputStream("Studentobject.txt"));
		
		TreeMap<Integer,Employee> emptree = new TreeMap<>();
		
		int i=1;
		while (i<=3) 
		{
			Employee emp = (Employee) objinput.readObject();
		    emptree.put(emp.getEmpid(), emp);
		}
		
		for (Entry<Integer, Employee> entry : emptree.entrySet()) 
		{
		    System.out.println("\nEmpID: " + entry.getKey());
		    System.out.println("EmpName: " + entry.getValue().getEmpname());
		    System.out.println("Address: " + entry.getValue().getEmpaddres());
	
		}
	}

}
