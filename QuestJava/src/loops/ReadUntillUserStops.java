package loops;
import java.util.Scanner;

public class ReadUntillUserStops 
{
	public static void main(String[] args) 
	{
		//example of scenario infinite loop 
		int num = 1;
		Scanner scan = new Scanner(System.in);
		while(num != 0) 
		{
			System.out.println("Enter The Number Or Else '0' To Exit:");
			num = scan.nextInt();
		}
		scan.close();
	}

}
