package basics;

import java.util.Scanner;

public class StringsPractice 
{
	static int length(String str) 
	{
		int length = 0;
		char[] words = str.toCharArray();
		for(char i : words) 
		{
			length++;
		}
		
		return length;
	}
	public static boolean isValidBrackets(char[] str) 
		{
			char[] stack = new char[str.length];
			int top = -1;

			for (char c : str) 
			{
				if (c == '(' || c == '{' || c == '[' || c == ')' || c == '}' || c == ']') 
				{
					if (c == '(' || c == '{' || c == '[') 
					{
						stack[++top] = c;
					} 
					else if (top < 0 || !isPair(stack[top--], c)) 
					{
						return false;
					}
				}
			}

			return top == -1;
		}

		private static boolean isPair(char c1, char c2) 
		{
			return (c1 == '(' && c2 == ')') || (c1 == '{' && c2 == '}') || (c1== '[' && c2 ==']');

		}
	public static void main(String[] args) 
	{

	    	int i,flag=1,len1 = 0,len2 =0,len3 = 0,count=0,len5,len6,len7,len8,len9;
			String s1,s2,s3,s4 ="",s5,s6,s7,s8,s9,s10,s_word;
			char ch;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the 1st string: ");
		 	s1=sc.nextLine();
			System.out.println("Enter the 2nd string: ");
		 	s2=sc.nextLine();
		 

		 	//task 1
		 	len1=length(s1);
		 	System.out.println("\nThe Length Of String1 Is:"+len1);
		 	len2=length(s2);
		 	System.out.println("The Length Of String2 Is:"+len2);

		 	
		 	
			//task 2
		 	//to check a character
			System.out.println("\nEnter The character To Search In String1: ");
		 	ch = sc.next().charAt(0);
		 	char array[] = new char[len1] ;
		 	for(int j=0; j< len1; j++) 
		 	{
	 			array[j]=s1.charAt(j);
		 	}
		 	for(i=0; i<len1; i++) 
		 	{
		 		if(ch == array[i]) 
		 		{
		 			count++;
		 		}
		 	}
		 	System.out.println("The Character is repeted "+count+" Times..");
		 	
		 	sc.nextLine();
		 	//to check a word in String 
		 	System.out.println("\nEnter Into String6: ");
		 	s6 = sc.nextLine();
		 	
		 	System.out.println("Enter the word");
			s_word = sc.nextLine();
			
			len6=length(s6);
		 	System.out.println("Sring Length Is:" +len6);
			
			count=0;
			int wcount=0;
			
			String[] words = s6.split(" ");
			char sword[] = s_word.toCharArray();
			    
			for (String w : words) 
			{
				count=0;
			   for(i=0;i<sword.length;i++)
			   {
				   if(sword[i]==w.charAt(i))
				   {
					   count++;
				   }
			   }
			   if(count==sword.length)
			   {
				   wcount++;
			   }
			}
			System.out.println("There are " + wcount + " words in the string that start with the given word.");

		 	
		 	
		 	
		 	//task 3 palindrome
		 	System.out.println("\nEnter Into String To Check Palindrome: ");
		 	s3 = sc.nextLine();
		 	len3=length(s3);
		 	System.out.println("The Length of String Is: "+len3);
		 	for(i=len3; i>0; i--) 
		 	{
		 		s4 += s3.charAt(i-1);
		 	}
		 	System.out.println();
		 	if(s3.equals(s4))
		 	{
		 		System.out.println("The String is a plaindrome..");
		 	}
		 	else
		 	{
		 		System.out.println("The String is not a plaindrome...");
		 	}
		 	System.out.println("\n");
		 	
		 	
		 	
		 	
		 	//task 4
		 	System.out.println("Enter Into String For Vowels: ");
		 	s5 = sc.nextLine();
		 	len5=length(s5);
		 	count=0;
		 	for(i=0; i<len5; i++) 
		 	{
		 		
		 		if(s5.charAt(i)=='a'||s5.charAt(i)=='e'||s5.charAt(i)=='i'||s5.charAt(i)=='o'||s5.charAt(i)=='u') 
		 		{
		 			count++;
		 		}
		 	}
		 	System.out.println("The Total No Of Vowels In String Are: "+ count);
		 	
		 	
		 	
		 	
		 	
		 	//task 5
			char str1[] = new char[len1] ;
		 	for(int j=0; j<len1; j++) 
		 	{
	 			str1[j]=s1.charAt(j);
		 	}
			char str2[] = new char[len2] ;
		 	for(int j=0; j<len2; j++) 
		 	{
	 			str2[j]=s1.charAt(j);
		 	}
	    	if(len1==len2)
	    	{	
	    		for(i=0;i<len1;i++)
	    		{
	        		if(str1[i]!=str2[i])
	        		{
	            		flag=0;
		           		break;
					}
	        	}
			}
	 	 	else
	    	{
	    		flag=0; 
	   		}	
		    if(flag==1)
	    	{
		    	System.out.println("\nThe two string are EQUAL");
	        	System.out.println(s1+" = "+s2);
	    	}
		    else 
		    {
		    	System.out.println("The Two Strings Are Not Equal");
		    	System.out.println(s1+" != "+s2);
		    }
		    
		    
		    
		    
		    //Task 6 remove similar words 
		    System.out.println("\nEnter Into String To Check And Remove Similar Character: ");
		    s7 = sc.nextLine();
		    System.out.println("Enter The Word: ");
		    s8 = sc.nextLine();
		    len7=length(s7);
		    len8=length(s8);
		    char str7[] = new char[len7] ;
		 	for(int j=0; j<len7; j++) 
		 	{
	 			str7[j]=s7.charAt(j);
		 	}
			char str8[] = new char[len8] ;
		 	for(int j=0; j<len8; j++) 
		 	{
	 			str8[j]=s8.charAt(j);
		 	}
			boolean[] flags = new boolean[128]; // ASCII character set

			// Set the flags for characters in str2
			for (char c : str8) 
			{
				flags[c] = true;
			}

			// Iterate through str1 and check if the character's flag is not set
			 count = 0;
			for (char c : str7) {
				if (!flags[c]) {
					str7[count++] = c;
				}
			}
			System.out.println("The Changed String is: ");
			for (i = 0; i < count; i++) 
			{
				System.out.print(str7[i]);
			}
			
		 	
		 	
		 	
		 	//Task 7
		 	System.out.print("\nEnter A String To Check Vaild Brackets: ");
		 	s10 = sc.nextLine();
		 	char[] charArray = s10.toCharArray();
		 	System.out.println(isValidBrackets(charArray));
		 	

		 		
		    
		    //task 8
	    	System.out.println("\n");
	    	System.out.println("Enter A String To Find Total Words In It: ");
	    	s9 = sc.nextLine();
	    	len9=length(s9);
	    	System.out.println("The Lenght OF String Is: "+len9);
	    	String[] sarray = s9.split(" ");
	    	count=0;
	    			
	    	for(String s:sarray)
	    	{
	    		count++;
	    	}
	    	System.out.println("There are "+count+" words in the given string");
	    			
	    	
	}
		    
}

	