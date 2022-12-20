package basics;



//Rahul,Tanvi => object of class Student or variable of datatype Student

public class StudentClassExampleForVariableTypes {

	int rollNo;
	String name;
	float marksObtained;
	float totalMarks;
	
	void calculatePercentage() {
		
		float percentage = 0;
		
		percentage = (marksObtained/totalMarks)*100;
		
		System.out.println(name+", your percentage is : "+percentage);		
		
	} 
	public static void main(String[] args) {
		
		
		StudentClassExampleForVariableTypes rahul = new StudentClassExampleForVariableTypes();
		rahul.rollNo = 10;
		rahul.name = "Rahul R";
		rahul.marksObtained = 366;
		rahul.totalMarks = 500;	
		
		
		System.out.println("Roll No : "+rahul.rollNo);
		System.out.println("Name : "+rahul.name);
		System.out.println("Marks Obtained : "+rahul.marksObtained);
		System.out.println("Total Marks : "+rahul.totalMarks);
		
		rahul.calculatePercentage();

		//END of rahul
		
		
		StudentClassExampleForVariableTypes tanvi = new StudentClassExampleForVariableTypes();
		tanvi.rollNo = 12;
		tanvi.name = "Tanvi Khan";
		tanvi.marksObtained = 400;
		tanvi.totalMarks = 500;
		
		System.out.println("\n\nRoll No : "+tanvi.rollNo);
		System.out.println("Name : "+tanvi.name);
		System.out.println("Marks Obtained : "+tanvi.marksObtained);
		System.out.println("Total Marks : "+tanvi.totalMarks);
		
		tanvi.calculatePercentage();
		
		//END of tanvi
	}
}