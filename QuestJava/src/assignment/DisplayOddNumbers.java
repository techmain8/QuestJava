package assignment;
import java.util.Scanner;

public class DisplayOddNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, i;
		System.out.println("Enter The Number you need to display untill:");
		a = sc.nextInt();
		sc.close();

		for(i=1;i<a+a;) 
		{
			if(i%2!=0)
			   System.out.println(i);
			i++;
		}
		for(int j=1;j<=a+a;j=j+2) {
			System.out.println(j);
		}
	}

}
