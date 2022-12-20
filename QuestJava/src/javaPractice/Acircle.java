package javaPractice;
import java.util.Scanner;
public class Acircle
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("enter the width : ");
		int width = input.nextInt();
		System.out.println("enter the height :");
		int heigth = input.nextInt();
		input.close();
		int Area = width * heigth ;
		System.out.println("the Area of the circle is :" + Area);
	}
}