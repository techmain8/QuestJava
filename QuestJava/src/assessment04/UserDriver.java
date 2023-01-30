package assessment04;

//- Counts total number of words present in the file. DONE
//- Reads a word from user and count its occurrences in the file. DONE
//- Reads a suffix from user and count how many words in the file ends with the suffix. DONE
//- Count number of unique words present in the file(“And” and “and” are counted as same). DONE
//- Write the details of its user to a file. DONE
//- Reads and display the user list from the file.  DONE
//- Stores the users with their id. DONE

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class UserDriver 
{
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		Scanner scan = new Scanner(System.in);
		
		File file = new File("UserDetails.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
		
		System.out.println("How Many You Want To Enter: ");
		int number = scan.nextInt();
		
		for(int i=0; i<number; i++)
		{
			System.out.println("Enter User Id :");
			int userid = scan.nextInt();
			scan.nextLine();
			System.out.println("Enter Password : ");
			String password = scan.nextLine();
			System.out.println("Enter First Name : ");
			String firstname = scan.nextLine();
			System.out.println("Enter Last Name : ");
			String lastname = scan.nextLine();
			System.out.println("Enter Age : ");
			int age = scan.nextInt();
			
			User user = new User(userid,password,firstname,lastname,age);
			oos.writeObject(user);
		}
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("UserDetails.txt"));
		
		HashMap<Integer,User> hashmap = new HashMap<>();
		
		User user =  (User) ois.readObject();
		hashmap.put(user.getUserid(), user);
		for (Entry<Integer, User> entry : hashmap.entrySet()) 
		{
		    System.out.println("\nUser ID: " + entry.getKey());
		    System.out.println("User Deatils : " + entry.getValue());
		}
		
		ois.close();
		oos.close();
		
		scan.nextLine();
		
		FileOutputStream out = new FileOutputStream("WordThesaurusSystem.txt");
		
		String str = "Hello to the person who is reading this we are writing into assessment4 File";
		for (int i=0; i<str.length(); i++)
		{
			out.write(str.charAt(i));
		}
		
		FileInputStream fis = new FileInputStream("WordThesaurusSystem.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
	
		String line;
		System.out.println("\n");
		String[] sarray = null;
		while((line = br.readLine())!= null)	
		{
			sarray = line.split(" ");
			System.out.println("Word count=" + sarray.length);
		}
		
		System.out.println("\nEnter The Word To be Searched : ");
		String search = scan.nextLine();
		
		int count=0;

		for(String check: sarray)
		{
			if(check.equals(search))
			{
				count++;
			}
		}
		System.out.println("The Word is Reapeted "+count+" Times..");
		System.out.println("\n");
		
		br.close();
		fis.close();
		out.close();
		
		FileInputStream fis2 = new FileInputStream("WordThesaurusSystem.txt");
		BufferedReader br2 = new BufferedReader(new InputStreamReader(fis2));
		
		String data = br2.readLine();
		String[] sarray2 = data.split(" ");
		System.out.println("\nEnter word To Check With How Many Words End's With Same: ");
		String wordSearch = scan.nextLine();
		int wordcount=0;
		for( String check2:sarray2)
		{
			if(check2.endsWith(wordSearch))
			{
				wordcount++;
			}
		}
		System.out.println("\nThe Words Ending With '"+wordSearch+"' Are "+wordcount);
		
		Set<String> uniqueword = new HashSet<>();
	
		for(String check3: sarray2)
		{
			uniqueword.add(check3);
		}
	
		System.out.println("\nThe Number Unique Words In File Are "+uniqueword.size());
		
		br2.close();
		fis2.close();
	}	

}
