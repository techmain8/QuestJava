package twoDArrays;

public class TwoDArrays {

	public static void main(String[] args) {
		int[][] array = new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
	
//		System.out.println(array[2][3]);
		
		for(int i=0; i<array.length; i++) 
		{
			for(int j=0; j< array[i].length; j++) 
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}

}
