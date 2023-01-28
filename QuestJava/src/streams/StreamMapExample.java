package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import collections.Student;


public class StreamMapExample 
{

	public static void main(String[] args) 
	{
		Integer graceMarks = 2;
		Integer maxMark =10;
		List<Integer> number = new ArrayList<>();
		
		number.add(1);
		number.add(2);
		number.add(3);
		number.add(4);
		number.add(5);
		number.add(6);
		number.add(7);
		number.add(8);
		number.add(9);
		number.add(10);
		
		System.out.println(number);
		// to add the grace marks for all the number 
		// without using stream to add grace mark
		for(int i=0; i<number.size(); i++)
		{
			Integer mark = number.get(i);
			number.set(i, mark+graceMarks);
		}
		
		System.out.println(number);
		
		for(Integer A:number)
		{
			System.out.print(A+" ");
		}
		
		System.out.println();
		// with stream  to add grace mark
		
		number.stream().map(mark->mark+graceMarks).forEach(mark->System.out.print(mark+" "));
					//.map is used to modify in stream 
		
		System.out.println("\n"+number);
		// Stream only acts as a runtime modification it does't effect main list 
		
		//To get a new list
		
		//method 1
		List<Integer> modifiedmark = number.stream().map(mark-> mark + graceMarks).toList();
		System.out.println("\n");
		modifiedmark.stream().forEach(System.out::println);
		
		//method 2
		List<Integer> modifiedMark = number.stream().map(mark-> mark + graceMarks).collect(Collectors.toList());
		System.out.println("\n"+modifiedMark);
		
		//Map Intermediate Operations with objects 
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(1,"Abhisehk",88.8));
		students.add(new Student(2,"ajay",65.7));
		students.add(new Student(3,"vijay",75));
		
		System.out.println("\n");
		students.stream().map(student-> student.getName()).forEach(name ->System.out.print(name+" "));
		
		//with filter function 
		number.stream().filter(mark->mark>=maxMark);

		
	}

}
