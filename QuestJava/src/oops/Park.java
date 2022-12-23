package oops;

public class Park 
{

	int entryno;
	float amount;
	
	public void entryAndAmount() 
	{
		Dog dog1 = new Dog();
//		dog1.name= "scotch";
//		dog1.age=3;
//		dog1.color="white";
//		dog1.bread="labrouder";
		
		
		dog1.setname("brandy");
		dog1.setage(7);
		dog1.setcolor("black&burgendy");
		dog1.setbread("rotweiller");
		
		
		
		System.out.println(dog1.getname() + " color " + dog1.getcolor() + " Entered with a ticket!\n");
		System.out.println("With EntryNo "+entryno+" And Amount Of: "+ amount);
		System.out.println("\n");
		System.out.println("Details are as follows : ");
		dog1.showdetails();
	}

}
