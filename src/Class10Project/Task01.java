package Class10Project;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		

		/*
		 * Create an array on int values using a scanner and calculate the sum of all
		 * stored elements in that array.
		 */
		
		Scanner input = new Scanner(System.in);
		
		
		
		int[] num=new int[4];
		
		for(int i=0; i<num.length; i++) {
			System.out.println("Plese enter number");
			num[i] = input.nextInt();
		}
	
		int sum=0;
		for (int numbers : num){
			sum+=numbers;
		}
		
		System.out.println("The sum of all numbers in array is "+sum);
		
		
		
		
		
		
	}


}


