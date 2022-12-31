package drivers;

import oops_inheritance.Task1;

public class Task1Driver 
{

	public static void main(String[] args) 
	{
		Task1 task = new Task1();
		task.welcome();
		System.out.println();
		task.welcome("Welcome To Java");
		System.out.println();
		task.welcome("Welcome To Java",3);
	}

}
