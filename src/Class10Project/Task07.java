package Class10Project;

public class Task07 {

	public static void main(String[] args) {
		// Write a Java Program to print the first 10 numbers of Fibonacci series.
		
		//0-1-1-2-3-5-8-13-21-34 --> fibonacci numbers
		
		int n1=0, n2=1, sum=0;
		
		System.out.print(n1+" "+n2);
		
		for (int i=0; i<10; i++) {
			sum=n1+n2; 
			System.out.print(" "+sum);
			n1=n2;
			n2=sum;
		}
		
		

	}

}
