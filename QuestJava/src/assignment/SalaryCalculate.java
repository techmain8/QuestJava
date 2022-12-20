package assignment;
import java.util.Scanner;

public class SalaryCalculate{

	public static void main(String[] args) 
	{
		int Salary = 0, yearsOfService;
		char gender;
		String qualification;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter The Gender Of Employee (m or f):");
		gender = input.next().charAt(0);
		System.out.println("The Years Of Service Of Employee :\t");
		yearsOfService = input.nextInt();
		System.out.println("Enter The Qualification Of Employee (PG or Graduate):\t");
		qualification = input.next();
		 input.close();
		 
		 //solution working 
		 
		 if(gender == 'm') 
		 {
				if(yearsOfService >= 10) 
				{
					if("PG".equals(qualification)) 
					{
						Salary = 15000;
					} else 
					{
						Salary = 10000;
					}
				} else 
				{
					if("PG".equals(qualification)) 
					{
						Salary = 10000;
					} else 
					{
						Salary = 8000;
					}
				}
			} else if (gender == 'f') 
			{
				if(yearsOfService >= 10) 
				{
					if("PG".equals(qualification)) 
					{
						Salary = 16000;
					} else 
					{
						Salary = 11000;
					}
				} else 
				{
					if("PG".equals(qualification)) 
					{
						Salary = 11000;
					} else 
					{
						Salary = 9000;
					}
				}
			} else 
			{
				System.out.println("Please enter correct gender!");
			}
			System.out.println("The salary for " + gender + " with qualification of " + qualification + " with " + yearsOfService + " is: " + Salary);

		
		//solution failed
		 
		/*
		if("m".equals(gender)) 
		{
			if(yearsOfService >= 10) 
			{
				if("PG".equals(qualification)) 
				{
					System.out.println("The Salary is : 15000\t");
				}
				else if("Graduate".equals(qualification))
				{
					System.out.println("The Salary is : 10000\t");
				}
			}
			else if(yearsOfService < 10) 
			{
				if("PG".equals(qualification)) 
				{
					System.out.println("The Salary is : 10000\t");
				}
				else if("Graduate".equals(qualification))
				{
					System.out.println("The Salary is : 8000\t");
				}
			}
		}
		else if("f".equals(gender)) 
		{
			if(yearsOfService >= 10) 
			{
				if("PG".equals(qualification)) 
				{
					System.out.println("The Salary is : 16000\t");
				}
				else if("Graduate".equals(qualification))
				{
					System.out.println("The Salary is : 11000\t");
				}
			}
			else if(yearsOfService < 10) 
			{
				if("PG".equals(qualification)) 
				{
					System.out.println("The Salary is : 11000\t");
				}
				else if("Graduate".equals(qualification))
				{
					System.out.println("The Salary is : 9000\t");
				}
			}
		}*/
		 
		//solution failed 
		 
		/*
		if("m".equals(gender)&& yearsOfService >= 10 && "PG".equals(qualification)  )
		{
			System.out.println("The Salary is : 15000\t");
		}
		else if("m".equals(gender) && yearsOfService >= 10 && "Graduate".equals(qualification) )
		{
			System.out.println("The Salary is : 10000\t");
		}
		else if("m".equals(gender) && yearsOfService < 10 && "Graduate".equals(qualification) )
		{
			System.out.println("The Salary is : 8000\t");
		}
		else if("m".equals(gender) && yearsOfService < 10 && "PG".equals(qualification) )
		{
			System.out.println("The Salary is : 10000\t");
		}
		else if("f".equals(gender) && yearsOfService < 10 && "Graduate".equals(qualification) )
		{
			System.out.println("The Salary is : 9000\t");
		}
		else if("f".equals(gender) && yearsOfService < 10 && "PG".equals(qualification) )
		{
			System.out.println("The Salary is : 11000\t");
		}
		else if("f".equals(gender) && yearsOfService >= 10 && "Graduate".equals(qualification) )
		{
			System.out.println("The Salary is : 11000\t");
		}
		else if("f".equals(gender) && yearsOfService >= 10 && "PG".equals(qualification) )
		{
			System.out.println("The Salary is : 16000\t");
		}
		else{
			System.out.println("invalid input is typed check and type again..");
		}
		*/
	}

}
