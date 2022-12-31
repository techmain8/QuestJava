package drivers;

import java.util.Scanner;
import assignment.ComplexNumber;
public class ComplexNumberDriver 
{
	static float num1,num2,num3,num4,num5,num6;
	public static void read()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The First Real Number & Imaginary Number: ");
		num1 =scan.nextFloat();
		num2 =scan.nextFloat();
		System.out.println("Enter The Second Real Number & Imaginary Number: ");
		num3 = scan.nextFloat();
		num4 =scan.nextFloat();
		System.out.println("Enter the Third Real Number & Imaginary Number: ");
		num5 =scan.nextFloat();
		num6 =scan.nextFloat();
		
	}
	public static void main(String[] args) 
	{
		read();
		ComplexNumber input1 = new ComplexNumber(num1,num2);
		ComplexNumber input2 = new ComplexNumber(num3,num4);
		ComplexNumber input3 = new ComplexNumber(num5,num6);
		
		
		ComplexNumber output = input1.addComplexNumber(input2,input3);
		System.out.println("The Sum of ComplexNumber Is: "+output.getReal()+" + "+output.getImaginary());
	}
}
