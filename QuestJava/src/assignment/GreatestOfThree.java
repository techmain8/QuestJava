package assignment;

import java.util.Scanner;

public class GreatestOfThree {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int num1 , num2 , num3;
			System.out.println("Enter The First Number :");
			num1 = input.nextInt();
			System.out.println("Enter The Second Number :");
			num2 = input.nextInt();
			System.out.println("Enter The Thrid Number :");
			num3 = input.nextInt();
			input.close();
			
			//solution 1 
			if(num1 > num2) {
				if (num1 > num3 ) {
					System.out.println("The Greater number is :" + num1);
				}
				else {
					System.out.println("checking Second Number");
				}
			}
			else {
					if(num2 > num3) {
						System.out.println("The Greater number is :" + num2);
					}
					else {
						System.out.println("The Greater number is :" + num3);
					}
			}
			//solution two 
			/*
			if((num1 > num2) && (num1 > num3 )){
				System.out.println("The Greater number is :" + num1);
			}
			else if(num2 > num3){
				System.out.println("The Greater number is :" + num2);
			}
			else{
				System.out.println("The Greater number is :" + num3);
			}
			*/
	}
}
			
		