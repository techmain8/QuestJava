package dataAccessObject;

import java.util.Scanner;

import oops.Student;

//These kind classes are used for CRUD operation w.r.t a model class
//C - Create | R - Retrieve | U - Update | D - Delete
//Sometimes its also called Repository class
//Student DAO class handles data altering/transfer process related to the model class Student
//it deals with array of student objects
public class StudentDataAccessObject {
	
	private Student students[];
	private int length;
	private int index; //acts like a cursor
	
	public StudentDataAccessObject(int length) {
		
		this.length = length;
		this.students = new Student[length];
		this.index = 0;
		
	}

	//getters
	
	public int getPosition() {
		return this.index + 1;
	}

	public int getLength() {
		return length;
	}
	
	public Student[] getStudents() 
	{
		return this.students;
	}
	
	//computing methods
	
	//object is added to array and index is updated
  public void addStudent(Student student) 
  {
		
		this.students[this.index] = student;
		++this.index;
		
	}
  
  public Student getStudent(int rollNo) 
  {
  	
  	for(Student student : this.students) 
  	{
  		
  		if(student == null) 
  			continue;
  		
  		if(student.getRollNo() == rollNo) 
  			return student;
  		
  		
  	}
  	
  	return null;
  	
  }

  public void updateStudent(int rollNo,Scanner scanner) 
  {
	  Student student = this.getStudent(rollNo);
		if(student == null) 
		{
			System.out.println("Oops No Such Record Found!!!..");
		}
		else 
		{
			System.out.println(student.getRollNo()+" | "+student.getName());
			System.out.println("Adding Student to Position : "+this.getPosition()+"/"+this.getLength());
			System.out.println("Enter Name : ");
			String name = scanner.next();
			student.setName(name);
		}
  }
  
  @SuppressWarnings("null")
  public void deleteStudent(int rollNo)
  {
	  Student student = this.getStudent(rollNo);
		if(student == null) 
		{
			System.out.println("Oops No Such Record Found!!!..");
		}
		else 
		{
			System.out.println(student.getRollNo()+" | "+student.getName());
			
			Student temp[] = new Student[length];
			for(int i=0; i<length; i++) 
			{
				temp[i]= students[i];
			}
			Student students[] = null;
			students = new Student[students.length];
			for (int j=0; j<length; j++)
			{
				if(getStudent(rollNo).equals(temp[j]))
				{
					continue;
				}
				students[j]= temp[j];
			}
			
		}
  }

}
