package generics;

import java.util.ArrayList;
import java.util.Scanner;

public class Example2<t>
{

	t data = (t) new Object[5];
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		ArrayList<String> obj = new ArrayList<>();
		 
		for(int i=0; i<10; i++)
		{
			System.out.println("Enter The Name: ");
			String name = scan.nextLine();
			
			obj.add(name);
			
		}
		System.out.println(obj);
		
		System.out.println();
		
		
		
	}

}
