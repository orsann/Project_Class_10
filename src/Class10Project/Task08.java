package Class10Project;

public class Task08 {

	public static void main(String[] args) {
		// Maximum and minimum number in the array?
		
		int num[] = { 10,20,30,40,50,60 };
		
		int min=num[0];
		int max=num[0];
		
		for (int i=0; i<num.length; i++) {
			if (num[i]<min) {
				min=num[i];
				
			}
			if (num[i]>max) 
				max=num[i];
		}
		
		System.out.println("Min number is "+min+","+" Max number is "+max);
	}
}
