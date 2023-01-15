package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import oops.Student;

public class HashMapExample 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String> hmap = new HashMap<Integer,String>();
		
		//without special method
		Integer key1 = 1;
		Integer key2 = 2;
		Integer key3 = 3;
		Integer key4 = 4;
		Integer key5 = 5;
		
		String val1 = "java";
		String val2 = "c";
		String val3 = "C++";
		String val4 = "Python";
		String val5 = "Spring";
		
		System.out.println("key?value pair added ? "+ hmap.put(key1, val1));
		System.out.println("key?value pair added ? "+ hmap.put(key2, val2));	
		System.out.println("key?value pair added ? "+ hmap.put(key3, val3));
		System.out.println("key?value pair added ? "+ hmap.put(key4, val4));
		System.out.println("key?value pair added ? "+ hmap.put(key5, val5));
		
		//with special method
		hmap.put(null, "J2EE");
		
		System.out.println(hmap);
		
		hmap.put(null, null);
		System.out.println(hmap);
		
		hmap.put(key1, "Replaced");
		System.out.println(hmap);
		
		hmap.remove(null);
		System.out.println(hmap);
		
		hmap.put(key1, val1);
		System.out.println(hmap);
		
		hmap.putIfAbsent(4,"HTML");
		System.out.println(hmap);
		
		
		HashMap<String,Student> hmap2 = new HashMap<String,Student>();
		
		String k1 = "s1";
		String k2 = "s2";
		String k3 = "s3";
		String k4 = "s4";
		String k5 = "s5";
		
		Student s1 = new Student("Alex", 8);
		Student s2 = new Student("Ajay", 1);
		Student s3 = new Student("Vijay", 3);
		Student s4 = new Student("Suresh", 5);
		Student s5 = new Student("Srinivas", 4);
		
		System.out.println("key/value is added ? "+ hmap2.put(k1, s1));
		System.out.println("key/value is added ? "+ hmap2.put(k2, s2));
		System.out.println("key/value is added ? "+ hmap2.put(k3, s3));
		System.out.println("key/value is added ? "+ hmap2.put(k4, s4));
		System.out.println("key/value is added ? "+ hmap2.put(k5, s5));
		
		System.out.println(hmap2);
		
		System.out.println();
		//for working on keys only in map 
		Set<String> keyset = hmap2.keySet();
		System.out.println("keyset" + keyset);
		
		//for working on values only in map
		Collection<Student> studlist =  hmap2.values();
		
		System.out.println("\nCollection"+studlist);
		
		int count =0;
		
		for(Student s: studlist)
		{
			if(s.getRollNo()>4)
			{
				count++;
				System.out.println("Name : "+ s.getName());
			}
			else 
			{
				System.out.println("\nBelow Number: "+s.getRollNo());
			}
		}
		System.out.println("Above 4 Students Count Is: "+ count);
		System.out.println("\n"+hmap2);
		
		
//		//we cannot use foreach loop to display elements from map objects
//		for(Collection<String,Student> studlist2 : hmap2)
//		{
//		}
		System.out.println("\nTo Check Key: "+hmap2.containsKey(k1));
		System.out.println("\nTo Check Value: "+hmap2.containsValue(s1));
		
		System.out.println("\nTo Compare Maps: "+ hmap.equals(hmap2));
		
		System.out.println("\nTo Check Size Of Map: "+ hmap2.size());
		
		System.out.println("\nTo Get Single set : "+hmap2.get(k2));
		
		System.out.println();
		count=0;
		for(Map.Entry<String,Student> entry: hmap2.entrySet())
		{
			System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
			if(entry.getValue().getRollNo()<4)
			{
				System.out.println("Below Number 4: "+entry.getKey()+ entry.getValue()+entry.getClass());
			}
		}
		System.out.println("\n"+hmap2);
		
		System.out.println();
		//Using Iterator 
		Iterator<Map.Entry<String,Student>> itr = hmap2.entrySet().iterator();
		
		while(itr.hasNext())
		{
			Map.Entry<String, Student> pair = itr.next();
			System.out.println("Key : "+pair.getKey()+" Values: "+pair.getValue());
		}
	}
}
