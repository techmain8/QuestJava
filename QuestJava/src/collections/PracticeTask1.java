package collections;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class PracticeTask1 
{
	public static void main(String[] args) 
	{
		
		int number;
		int rollNo;
		String name;
		float marks[]= new float[5];
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How Many Numbers You Want To Enter: ");
		number = scan.nextInt();
		
		ArrayList<Student> task1 = new ArrayList<Student>();
		//read and store into hashset
		for (int i=0; i<number; i++)
		{
			scan.nextLine();
			System.out.println("Enter The Name: ");
			name = scan.nextLine();
		
			System.out.println("Enter RollNo: ");
			rollNo=scan.nextInt();
			System.out.println("Enter The 5 Marks");
			for(int j=0; j<5 ;j++)
			{
			    System.out.print("Enter mark out of 75 for subject " + (j+1) + ": ");
				marks[j]=scan.nextFloat();
			}
			task1.add(new Student(rollNo,name,marks));
		}
		System.out.println("For Students who scored more than 85% are: ");
		for(Student student:task1)
		{
			if(student.getPercentage()>85)
			{
				System.out.println("Name: "+student.getName()+" Has "+student.getPercentage()+"%");
			}
		}
		
		TreeMap<Integer,Student> sorted = new TreeMap<>();
		for(Student s :task1)
		{
			sorted.put(s.getRollNo(), s);
		}
	    System.out.println("\nStudents arranged roll number wise:");
	    for (Map.Entry<Integer,Student> entry : sorted.entrySet()) 
	    {
	        System.out.println(entry.getKey() + " - " + entry.getValue().getName());
	    }

		System.out.println(task1);
	}
}
