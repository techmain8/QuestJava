package oops;

public class CocoaChocolate extends Chocolate implements ChocolatePrice 
{

	public CocoaChocolate(int qty,String size) {
		super(qty,size);
	}
	
	@Override
	public void calculatePrice() {

		switch(getSize()) 
		{
			case "small":setPrice(60.0f);
						break;
			case "big": setPrice(180.0f);
						break;
			case "jumbo":setPrice(400.0f);
						break;
			default : setPrice(0.0f);
		}
	}
	@Override
	public void calcTotalPrice() 
	{
		setTotalprice(getPrice()* getQty());
	}
	@Override
	public void display() 
	{
		System.out.println("================================");
		System.out.println("Chocolate Size Is: " + getSize());
		System.out.println("Chocolate Quantity Is: " + getQty());
		System.out.println("Chocolate Price Is: "+getPrice());
		System.out.println("The Total Price For "+getQty()+" Chocolates Is: "+getTotalprice());
		System.out.println("The After Discount The Total Price Is: "+(getTotalprice()-getDiscount()));
	}
	
	
}
