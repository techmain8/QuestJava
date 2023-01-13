package exception;

public class RethrowException 
{

	public static void worker() throws Exception 
	{
		System.out.println("Exception caught in worker after Called in main");
		throw new Exception("thrown from faculty method");
	}
	public static void faculty() throws Throwable 
	{
		try 
		{
			System.out.println("Inside faculty method");
			System.out.println("calling worker method");
			worker();
		}
		catch(Exception a) 
		{
			System.out.println("ReThrowing Exception back to main method");
			throw a;
		}
	}
	public static void main(String[] args) throws Throwable 
	{
		try 
		{
			System.out.println("error arised");
			faculty();
		} 
		catch(Exception e) 
		{
			System.out.println("Caught in main");
			System.out.println("Exception handeled");
		}
		System.out.println("Thank You");
	}
}
