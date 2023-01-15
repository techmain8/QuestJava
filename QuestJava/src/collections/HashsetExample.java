package collections;

import java.util.HashSet;
import java.util.Iterator;


public class HashsetExample 
{
	public static void main(String[] args) 
	{
		HashSet<Contact> hs = new HashSet<Contact>();
		Contact c1 = new Contact("C1", "1234567890");
		Contact c2 = new Contact("C2", "4567890321");
		Contact c3 = new Contact("C3", "456789012");
		System.out.println("Size of hastset before adding objects : " + hs.size());
		System.out.println("Object added? " + hs.add(c1));
		System.out.println("Object added? " + hs.add(c2));
		System.out.println("Object added? " + hs.add(c3));
		System.out.println("Size of hastset after adding objects : " + hs.size());
		hs.add(new Contact("c5", "9876543210"));
		System.out.println("Object removed ? " + hs.remove(c3));
		System.out.println("Object added ? " + hs.add(c1));
		System.out.println("Objects in hashset 1 : " + hs);

		HashSet hs2 = new HashSet();
		System.out.println("Size of hastset before adding objects : " + hs2.size());
		hs2.add(10);
		hs2.add(true);
		hs2.add("Java");
		hs2.add(c2);
		System.out.println("Size of hastset after adding objects : " + hs2.size());
		System.out.println("Objects in hashset 2 : \n" + hs2);
		System.out.println();
		for(Contact c : hs)
		{
			if(c.getName().equals("C2"))
				c.setNumber("111111111");
			System.out.print("Name : " + c.getName() + "\tNumber : " + c.getNumber());
			System.out.println();
			
		}
		System.out.println();

		// Iterator
		
		Iterator itr = hs.iterator();
		
		while(itr.hasNext())
		{
			Contact contact = (Contact) itr.next();  // retrieving
			if(contact.getName().equals("C2"))  // manipulatinng
				contact.setNumber("9000000009");
			//System.out.println(itr.next());
			
			System.out.println(contact);
		}
		
		System.out.println();

		Iterator itr2 = hs2.iterator();
		while(itr2.hasNext())
		{
			Object test = itr2.next();
			if(hs2.contains(true)) 
			{
				hs2.remove(test);
				hs2.add(false);
			}
			System.out.println(hs2);
			break;
		}
		
	}
	
}
