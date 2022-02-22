package Class10Project;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {

		// Write a java program to check whether a given number is prime or not?

		/*
		 * 
		 * Natural Number greater than 1 Which has only 2 factors 1 and itself
		 * 
		 * 19 1 and 19 Prime Number 28 1,2,4,7,14,28 Not a Prime Number
		 * 
		 * Examples: 2, 3, 5, 7, 11, 13, 17..
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a prime number");
		int num = input.nextInt();
		
		int count = 0;

		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				count++;           //check for how many factors 
			break;
		}

		if (count == 0) {
			System.out.println(num + " is Prime number");
		} else {
			System.out.println(num + " is not prime number");
		}

	}

}
