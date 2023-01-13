package drivers;
import dataAccessObject.StudentDataAccessObject;
import oops.Student;

import java.util.Scanner;
//if u get a cursor error for scanner nextInt() or next() just add a scanner.nextLine();before last scannerObject..
//.next() will take only upto a space " " .. nextLine() will take whole Line as Input from the last input space...
//Inorder to create an checked exception we have to inherit from Exception Class since
//the subclasses and itself is of exception type checked
public class StudentManagementUsingArraysWithCheckedExceptionDriver 
{
	
	public static void main(String[] args) {
		Boolean loop = true;
		Scanner scanner = new Scanner(System.in);
		int option;
		
		System.out.println("Student Management\n=================");
		System.out.println("Enter the number of records");
		
		StudentDataAccessObject dao = new StudentDataAccessObject(scanner.nextInt());
		
		while(loop) {
			
			System.out.println("\nSELECT AN OPTION\n=================");
			System.out.println("1) Add a student");
			System.out.println("2) List a student");
			System.out.println("3) List all students");
			System.out.println("4) Update a student");
			System.out.println("5) Delete a student");
			System.out.println("6) Quit");
			
			option = scanner.nextInt();
			
			switch(option) {
				case 1:{
					
					System.out.println("Adding Student to Position : "+dao.getPosition()+"/"+dao.getLength());
					System.out.println("Enter Name : ");
					String name = scanner.next();
					System.out.println("Enter RollNo : ");
					int rollNo = scanner.nextInt();
					
					Student student = new Student(name,rollNo);
					
					dao.addStudent(student);
					
					break;
				}
				case 2:{
					
					System.out.println("Enter the roll no of Student : ");
					int rollNo = scanner.nextInt();
					
					Student student = dao.getStudent(rollNo);
					
					if(student == null) {
						
						System.out.println("Oops! No such record found");
						
					}else {
						
						System.out.println(student.getRollNo()+" | "+student.getName());
						
					}
					
					break;
				}
				case 3:{
					
					System.out.println("All Students\n-------------");
					
					Student students[] = dao.getStudents();
					
					for(Student student:students) {
						
						//method 1 (preferred)
						if(student == null) continue;						
						System.out.println(student.getRollNo()+" | "+student.getName());
							
						//method 2
//						try {
//							
//							System.out.println(student.getRollNo()+" | "+student.getName());
//
//						}catch(NullPointerException e) {
//							
//							continue;
//							
//						}
						
					}
					
					break;
				}
				case 4:{
					System.out.println("Enter The Roll Number: ");
					int rollNo = scanner.nextInt();
					
					dao.updateStudent(rollNo,scanner);
					
					break;
				}
				case 5:{
					System.out.println("Enter the roll no of Student : ");
					int rollNo = scanner.nextInt();
					
					dao.deleteStudent(rollNo);					
					break;
				}
				case 6:{
						loop = false;
					break;
				}
				default: {
					System.out.println("Not A Valid Option...");
				}
			}
			
		}
		System.out.println("Thank you....");

	}

}
