package oopsPractice;

public class Shop {

	static Dog object = new Dog();
	static Customer obj1 = new Customer();
	
	String shopname = "Mickey Dog House";
	String availability = "YES";
	int no_of_dogs;
	
	public String getShopname()
	{
		return shopname;
	}
	public String getAvailability()
	{
		return availability;
	}
	
	public static void buyADog()
	{
		String name = obj1.name;
		int age = obj1.age;
		String breed = obj1.breed;
		String colour = obj1.colour;
		object.setDogname(name);
		object.setDogage(age);
		object.setDogbreed(breed);
		object.setDogcolour(colour);
	}
	
	public static void main(String[] args)
	{
		buyADog();
		System.out.println("Your Dog's Name is: "+object.getDogname());
		System.out.println("Your Dog's Age is: "+object.getDogage()+" Years");
		System.out.println("Your Dog's Breed is: "+object.getDogbreed());
		System.out.println("Your Dog's Colour is: "+object.getDogcolour());
		
	}
	
}