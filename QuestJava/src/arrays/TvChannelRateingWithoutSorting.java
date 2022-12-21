package arrays;

public class TvChannelRateingWithoutSorting 
{

	public static void main(String[] args) 
	{

		double array[] = new double[]{2.5,3.7,4.8,2.2,5.0,3.1};

		double lowest = array[0];
		double highest =array[0];

		for (int i = 1; i < array.length; i++) 
		{
			if (array[i] > highest) 
			{
				highest = array[i];
			}
			else if (array[i] < lowest) 
			{
				lowest = array[i];
			}
		}
		System.out.println("lowest Rating is " + lowest);
		System.out.println("Highest Rating is " + highest);
	}
}
