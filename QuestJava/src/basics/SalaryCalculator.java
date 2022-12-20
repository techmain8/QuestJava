package basics;
import java.util.Scanner;

public class SalaryCalculator{

	public static void main(String[] args) {
		double BasicSalary, Hra , Pf, SpecialAlloance, NetPayableSalary ;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter The Basic Salary Amount :\t");
		BasicSalary = input.nextDouble();
		input.close();
		System.out.println("The Basic Salary Amount Entered is :\t" + BasicSalary);
		
		//Hra = BasicSalary % 50;
		Hra = 0.5 * BasicSalary;
		
		//Pf = BasicSalary % 14;
		Pf = 0.14 * BasicSalary;
		
		//SpecialAlloance = BasicSalary % 70;
		SpecialAlloance = 0.7 * BasicSalary;
		
		NetPayableSalary = BasicSalary + Hra - Pf + SpecialAlloance ;
		
		System.out.println("The NetPayableSalary of Mr.Roy is :\t" + NetPayableSalary);
	}

}
