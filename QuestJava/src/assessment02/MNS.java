package assessment02;

import java.util.Scanner;

//Mrs. Singh is a teacher in City Montessori National School. She has to declare result of her class. She
//has conducted tests and calculated the average marks of 5 subjects (max. marks for each subject is
//100) for all 30 students. Mrs. Singh wantsto declare the result. For this, she needs to perform following
//tasks :
public class MNS {

	static int totalstudents=6;
	static double number,noOfstudent=0;
	
	public static void sort(double[] array) 
	{
		int i;
		for(i =0 ; i<array.length; i++) 
		{
			for(int j=i+1; j<array.length; j++) 
			{
				if(array[i] > array[j]) 
				{
					double temp = array[i];
					array[i] = array[j];
					array[j]= temp;
				}
			}
		}
		System.out.println();
		for(double num:array)
			System.out.print("\t"+num);
	}
	static void mean(double array[]) 
	{
		double sum =0;
		for(int i = 0; i<totalstudents; i++) 
		{
			 sum = sum + array[i];
		}
		double mean = sum/totalstudents;
		System.out.println("Mean Of Students Average Is :"+mean);
	}
	static void gracemarks(double array[]) 
	{
		for(int i=0; i<array.length; i++) 
		{
			if(array[i] < 40 ) 
			{
				double req = 40 - array[i];
				array[i]+=req;
			}
		}
		System.out.println("After Grace Marks");
		for(double num:array)
			System.out.print("\t"+num);
	}
	
	static void record(Scanner input) 
	{
		int row,column; 
		System.out.println("Enter The Size Of Row: ");
		row = input.nextInt();
		System.out.println("Enter The Size Of Column: ");
		column =input.nextInt();
		
		
		double records[][] = new double[row][column];
		
		for(int i=0; i<row; i++) 
		{
			System.out.println("Enter Average into Row "+(i+1)+" : ");
			for(int j=0; j< column; j++) 
			{
				System.out.println("Enter value:");
				records[i][j]= input.nextDouble();
			}
		}
		System.out.println("SL.NO ----Average-----------Percentage...");
		for(int i=0; i< records.length; i++) 
		{
			for(int j=0; j<records[i].length; j=j+column) 
			{
				
				System.out.println((i+1)+"---------"+records[i][j]+" --------------"+records[i][j+1]+"%");
			}
		}
			
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double student[] = new double[totalstudents];
		//Task 1 for entering average of each student
		for(int i=0; i<totalstudents; i++) 
		{
			System.out.println("Enter the Average for Student "+(i+1)+" : ");
			student[i] = input.nextDouble();
		}
		
		
		//task2 display high and low 
		sort(student);
	    System.out.println("\n1st rank scored " + student[totalstudents-1]);
	    System.out.println("30th rank scored " + student[0]);
		 
	    //task 3 mean 
	    mean(student);
	    
	    //task 4 grace marks how is required 
	    gracemarks(student);
	    
	    //task 5 She needs to declare the marks of first 3 rank holders.
	    System.out.println("\nTo Check Top Rank Holders:");
	    sort(student);
	    for(int i=0; i<totalstudents; i++) 
		{
	    	if(student[i]== student[totalstudents-1]) 
	    	{
	    		System.out.println("The First Rank Holder Is : "+student[i]);
	    	}
	    	if(student[i]== student[totalstudents-2]) 
	    	{
	    		System.out.println("The Second Rank Holder Is : "+student[i]);
	    	}
	    	if(student[i]== student[totalstudents-3]) 
	    	{
	    		System.out.println("\nThe Third Rank Holder Is : "+student[i]);
	    	}
		}
	    
	    //task 6 search the number in array 
	    System.out.println("Enter The Element To Search: ");
		number = input.nextDouble();
		
		for(int i=0; i<totalstudents; i++) 
		{
			double temp = student[i];
			if(temp == number) 
			{
				System.out.println("The Student: "+ (i+1));
				noOfstudent+=i;
			}
		}
		System.out.println("The Total Number Of Students Who Scored Same Average Are: "+noOfstudent);
		
		//task 7 maintain records of students percentage 
		record(input);
	}
}
