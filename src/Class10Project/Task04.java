package Class10Project;

public class Task04 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array of integers. Develop a program which will calculate the sum
		 * of  even and odd numbers for that array.
		 */

		int[][] numbers = {

				{ 2, 3, 6, 9 }, { 11, 12, 17, 24 }

		};

		int even = 0;
		int odd = 0;

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {

				if (numbers[i][j] % 2 == 0) {
					even +=  numbers[i][j];

				} else if (numbers[i][j]%2!=0) {
					odd += numbers[i][j];
				}
			}
		}
		
		System.out.println("The sum of odd numbers is "+odd);
		System.out.println("The sum of even numbers is "+even);
	}

}
