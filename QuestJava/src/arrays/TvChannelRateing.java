package arrays;

public class TvChannelRateing 
{
	static int number;
	public static void sort(double[] array) 
	{
		int i;
		for(i =0 ; i<array.length; i++) 
		{
			for(int j=i+1; j<array.length; j++) 
			{
				if(array[i] > array[j]) 
				{
					double temp = array[i];
					array[i] = array[j];
					array[j]= temp;
				}
			}
		}
		for(double num:array)
			System.out.print("\t"+num);
	}
	public static void main(String[] args) 
	{
		double[] a = new  double[] {2.5,3.7,4.8,2.2,5.0,3.1};
		
		sort(a);
		System.out.println("\nThe smallest is "+a[0]);
		System.out.println("The Highest is "+a[5]);
	}

}
