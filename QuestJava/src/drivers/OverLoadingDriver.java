package drivers;
import oops_inheritance.OverLoadingTask;
public class OverLoadingDriver 
{

	public static void main(String[] args) 
	{
		OverLoadingTask overloading =new OverLoadingTask();
		overloading.welcome();
		System.out.println();
		overloading.welcome("Welcome");
		System.out.println();
		overloading.welcome("Welcome",3);
	}

}
