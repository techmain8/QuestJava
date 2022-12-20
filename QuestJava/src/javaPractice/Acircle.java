package javaPractice;
import java.util.Scanner;
public class Acircle
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("enter the width : ");
		int wid = input.nextInt();
		System.out.println("enter the height :");
		int hei = input.nextInt();
		input.close();
		int A = wid * hei ;
		System.out.println("the Area of the circle is :" + A);
	}
}