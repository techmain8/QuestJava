package drivers;


import java.util.Scanner;

import oops.CocoaChocolate;
import oops.MilkChocolate;

public class ChocolateDriver {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to Chocolate Factory\n");
		System.out.println("===================================");
		
		System.out.print("Enter the size of milk chololate(small,big or jumbo): ");
		String milkSize = scan.next();
//		milkSize = milkSize.toLowerCase();
		
		
		System.out.print("Enter the quantity of milk chocolates: ");
		int milkQuantity = scan.nextInt();
		
		MilkChocolate milkchocolate = new MilkChocolate(milkQuantity,milkSize.toLowerCase());
		
		milkchocolate.calculatePrice();
		milkchocolate.calcTotalPrice();
		milkchocolate.calculateDiscountPrice();
		milkchocolate.display();
		
		System.out.println("===================================");
		
		System.out.print("Enter the size of cocoa chololate(small,big or jumbo): ");
		String cocoaSize = scan.next();
//		cocoaSize = cocoaSize.toLowerCase();
		
		
		System.out.print("Enter the quantity of milk chocolates: ");
		int cocoaQuantity = scan.nextInt();
		scan.close();
		CocoaChocolate cocoachocolate = new CocoaChocolate(cocoaQuantity,cocoaSize.toLowerCase());
		
		cocoachocolate.calculatePrice();
		cocoachocolate.calcTotalPrice();
		cocoachocolate.calculateDiscountPrice();
		cocoachocolate.display();
		
	}

}
