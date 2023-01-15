package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;


public class PracticeTask2
{
	public static void main(String[] args) 
	{
		int number,num=0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How Many Numbers You Want To Enter: ");
		number = scan.nextInt();
		
		//Initialization of hashset
		ArrayList<Integer> game = new ArrayList<Integer>();
		//read and store into hashset
		for (int i=0; i<number; i++)
		{
			System.out.print("Enter "+(i+1)+" Number: ");
			num = scan.nextInt();
			game.add(num);
		}
		System.out.println("Un-Filtered Entered Numbers Are: "+game);
		//to filter only unique number!!!
		HashSet<Integer> sorted = new HashSet<Integer>();
		//Arranging in Ascending order 
		sorted.addAll(game);
		System.out.println("Filtered Unique Numbers in Ascending Order"+sorted);
		
		ArrayList<Integer> tosort = new ArrayList<Integer> (game);
		Collections.sort(tosort);

		HashMap<Integer, Integer> frequency = new HashMap<Integer,Integer>();
		for (int value : tosort)
		{
			int a = Collections.frequency(game,value);
			frequency.put(value,a);
		}
		System.out.println("Frequency Of Numbers Are: "+ frequency);
		
		
		//Using iterator method
		Iterator<Map.Entry<Integer,Integer>> itr = frequency.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry<Integer,Integer> pair = itr.next();
			System.out.println("Key : "+pair.getKey()+" Values: "+pair.getValue());
		}
	}
}
