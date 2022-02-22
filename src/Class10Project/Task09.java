package Class10Project;

public class Task09 {

	public static void main(String[] args) {
		//Write a java program to find the second largest number in the array?
		
		int[] nums= {5,15,23,64,135,467,245};
		int largest=0;
		int secondLargest=0;
		for(int i=0;i<nums.length; i++) {
			if(nums[i]>largest) {
				secondLargest=largest;
				largest=nums[i];
			}else if(nums[i]>secondLargest && nums[i]<largest) {
				secondLargest=nums[i];
			}
		}
		System.out.println("The second largest number in the array is "+secondLargest);
	
	}

	}
	
