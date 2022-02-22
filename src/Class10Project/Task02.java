package Class10Project;

public class Task02 {

	public static void main(String[] args) {
		
		//Create a 2D array of integer values. Print the sum of all numbers.
		
		int[][] numbers = {
				
				{5,10,15,20},
				{3,6,9,12},
				{2,4,6,8},
		};
		
		int sum=0;
		
		for (int i=0; i<numbers.length; i++) {
			
			for ( int j=0; j<numbers[i].length; j++) {
				
				sum+=numbers[i][j];
			}
		}
		
		System.out.println(sum);
		
		

	}

}
