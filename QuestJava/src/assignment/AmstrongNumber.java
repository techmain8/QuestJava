package assignment;
import java.util.*;

public class AmstrongNumber 
{

	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		int digit_count=0,sum=0,rem=0;
		int temp=num;
		while(temp>0)
		{
			temp=temp/10;
			digit_count++;
		}
		temp=num;
		while(num>0)
		{
			rem=num%10;
			sum+=Math.pow(rem, digit_count);
			num=num/10;
		}
		if(sum==temp)
		{
			System.out.print("Amstrong Number");
		}
		else
		{
			System.out.print("Not Amstrong Number");
		}
	}
}
