package basics;

import java.util.Scanner;

public class TheaterTax
{

		  static final int BalconyPrice = 750;
		  static final int FirstClassPrice = 500;
		  static final int SecondClassPrice = 250;
		  static final double TaxRateHigh = 0.25;
		  static final double TaxRateLow = 0.15;

		  public static void main(String[] args) 
		  {
		
		    Scanner scanner = new Scanner(System.in);
	
		    double overallTax = 0;
		    double theatreTax;

		    System.out.print("Enter number of Each Tickets sold for a Category in theatre: ");
		    int Tickets = scanner.nextInt();
		 
		    for (int i = 0; i < 5; i++) 
		    {
		      double ticketRevenue = (Tickets * BalconyPrice) + (Tickets * FirstClassPrice) + (Tickets * SecondClassPrice);
		      
		      if (ticketRevenue >= 500) 
		      {
		        theatreTax = ticketRevenue * TaxRateHigh;
		      }
		      else 
		      {
		        theatreTax = ticketRevenue * TaxRateLow;
		      }
		      System.out.println("Total tax payable for theatre a Is :"+  theatreTax);
		      overallTax += theatreTax;
		    }
		    System.out.println("Overall tax payable:" + overallTax);
		  }
		}
