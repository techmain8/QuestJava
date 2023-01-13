package oops;

abstract class Chocolate 
{
	
	private String size;
	private int qty;
	private double price;
	public double discount ;
	public double totalprice;

	
	public Chocolate(int qty,String size) {
		this.size = size;
		this.qty = qty;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public  double getDiscount() {
		return discount;
	}

	public  void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}

	public void calculateDiscountPrice() 
	{
		if(getQty() <= 50) {
			setDiscount(totalprice*.1);
		}
		else if(getQty()>50 && getQty()<=100) {
			setDiscount(totalprice*.15);
		}
		else if(getQty()>100 && getQty()<=150) {
			setDiscount(totalprice*.20);
		}
		else if(getQty()>150) {
			setDiscount(totalprice*.30);
		}
	}
	
	@Override
	public String toString() {
		return "Chocolate [size=" + size + ", qty=" + qty + ", price=" + price + ", discount=" + discount
				+ ", totalprice=" + totalprice + "]";
	}

	public abstract void display();
}
