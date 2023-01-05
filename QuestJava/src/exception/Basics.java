package exception;
import oops_inheritance.Shape;
public class Basics 
{
	public static void main(String[] args) throws ClassNotFoundException 
	{
		//Arithmetic exception where divisor can't be zero 
		int a= 10;
		int b = 0;
		float div = a/b;
		System.out.println("Division Is : "+div);
		
		//class not found exception
		Class classfromforName = Class.forName("Shape");
		System.out.println(classfromforName);
	}
	

}
