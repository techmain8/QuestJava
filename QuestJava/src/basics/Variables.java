package basics;

import java.util.Scanner;

public class Variables {
	
	static int rollNum = 0;
	static String name = null ;
	static float markObtained =  0;
	
	void variables1() {
	float totalMarks = 600;
	 this.calculatePercentage(markObtained, totalMarks, name,rollNum);
	}

	void calculatePercentage(float markObtained, float totalMarks, String name, int rollNum) {
		float percentage = 0; 
		
		percentage = (markObtained/totalMarks)*100;
		System.out.println("RollNumber "+rollNum+" Name "+ name + " has scored :"+ percentage);
	}
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		Variables v = new Variables();
		System.out.println("Enter the rollnumber :");
		rollNum = sc.nextInt();
		System.out.println("Enter The Name: ");
		name = sc.next();
		System.out.println("Enter The marks Obtained :");
		markObtained =sc.nextFloat();
		sc.close();
		v.variables1();
	}
}
