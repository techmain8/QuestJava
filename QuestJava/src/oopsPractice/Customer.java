package oopsPractice;

public class Customer 
{
	
	Shop obj = new Shop();
	
	public void shopDetails()
	{
		String shopname = obj.getShopname();
		String availability = obj.getAvailability();
		System.out.println("Shop name is: "+shopname);
		System.out.println("Availability is: "+availability);
	}

	String name = "Scooby Doo";
	int age = 2;
	String breed = "Labrador";
	String colour = "Brown";
	
	

	
}