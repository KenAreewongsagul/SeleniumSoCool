package day25_Review;

import java.util.Arrays;

public class Nat_Review_Mentor {

	public static void main(String[] args) {
		

		
		
		//Fixed length
		//Fixed data type
		
					// 0  1  2
		int[] nums = {12,22,33};
		
		System.out.println(Arrays.toString(nums));
		
		String[] arr = new String[3];
		System.out.println(Arrays.toString(arr));
		
		
		
		
		int[] num1 = {1,2,3,4,5,6};
		
		int[] num2 = {7,8,9,10,11};
		
		int[] result = new int[num1.length+ num2.length];
		
		
		System.out.println(Arrays.toString(result));
		
		for(int i =0; i< num1.length; i++) {
			result[i] = num1[i];
			
		}
		System.out.println(Arrays.toString(result));
		
		
		for(int i = 0, j = num1.length; i< num2.length;i++, j++) {
			result[j] = num2[i];
		}
		
		System.out.println(Arrays.toString(result));
		
		
		
		
		
		
	}

}
