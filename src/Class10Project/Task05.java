package Class10Project;

public class Task05 {

	public static void main(String[] args) {
		//Write a program to swap 2 numbers without a temporary variable?
		
		int x=10;
		int y=5;
		
		    x = x + y; // first  becomes 15
		    y = x - y; // second becomes 10
		    x = x - y; // first  becomes 5
		
		System.out.println("first = "+x);
		System.out.println("second = "+y);
	}

}
