package collections;

import java.util.Arrays;

public class Student 
{
		int rollNo;
		String name;
		float[] marks = new float[5];
		double totalMarks;
		double percentage;
		
		public Student(int rollNo,String name,float[] marks) 
		{
		    this.rollNo = rollNo;
		    this.name = name;
		    this.marks = marks;
		    this.totalMarks = calculateTotalMarks();
		    this.percentage = calculatePercentage();
		}

		public double calculateTotalMarks() 
		{
		    double total = 0;
		    for (int i = 0; i < marks.length; i++) 
		    {
		        total +=marks[i];
		    }
		    return total;
		}

		public double calculatePercentage() 
		{
		    return (totalMarks / 375.0) * 100;
		}

		public int getRollNo() 
		{
		    return rollNo;
		}

		public String getName() 
		{
		    return name;
		}

		public float[] getMarks() 
		{
		    return marks;
		}

		public double getTotalMarks() 
		{
		    return totalMarks;
		}

		public double getPercentage() 
		{
		    return percentage;
		}

		@Override
		public String toString() {
			return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + Arrays.toString(marks)
					+ ", totalMarks=" + totalMarks + ", percentage=" + percentage + "]";
		}
		
	}
