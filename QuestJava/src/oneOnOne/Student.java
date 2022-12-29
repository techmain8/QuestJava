package oneOnOne;
import java.util.Scanner;
public class Student 
{
  String name;
  int id;
  int mark;

  public Student() 
  {
	  
  }
  
//  public Student(String name, int id,int mark) 
//  {
//    this.name = name;
//    this.id = id;
//    this.mark =mark;
//  }

  public void read(Scanner input) 
  {
//    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter name: ");
    name = input.nextLine();
    System.out.print("Enter id: ");
    id = input.nextInt();
    System.out.print("Enter mark: ");
    mark = input.nextInt();
   
  }

  public void display() 
  {
    System.out.println("Name: " + name);
    System.out.println("Id: " + id);
    System.out.println("Mark: " + mark);
  }

  public static void main(String[] args) 
  {
	Scanner  input = new Scanner(System.in);
	Student[] students = new Student[5];

	for (int i = 0; i < 5; i++) 
	{
		students[i] = new Student();
		students[i].read(input);
	}

	for (Student student : students) 
	{
		student.display();
		System.out.println();
	}
  }
}