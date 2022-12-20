package loops;

public class AllForLoop 
{
	public static void main(String[] args) 
	{
		for(int i = 1; i <= 10; i++)
		{
			System.out.println("i=" + i);
		}
		
		System.out.println();
		
		int j = 1;
		for(;j <= 10; j++)
		{
			System.out.println("j=" + j);
		}
		
		System.out.println();
		
		for(int k = 1; ;k++)
		{
			if(k > 10)
			{
				break;
			}
			System.out.println("k=" + k);
		}
		
		System.out.println();
		
		for(int l = 1; l <= 10; )
		{
			System.out.println("l=" + l);
			l++;
		}
		
		System.out.println();
		
		int x = 1;
		for(;;)
		{
			if(x > 10)
			{
				break;
			}
			System.out.println("Alex "+x);
			x++;
		}
	}
}