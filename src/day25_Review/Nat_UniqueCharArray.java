package day25_Review;

public class Nat_UniqueCharArray {

	public static void main(String[] args) {
		
		
		
		int[] num1 = {20,20,30,40,40,50,50,50,60,};
		
		//Output : {20,30,40,50,60}
		
		
		int newLength = 1;
		
		int result[] = new int[newLength];
		
		
		String temp = "";
		
		for(int i = 0; i < num1.length; i++) {
			
			if(!temp.contains(String.valueOf(num1[i]))) {
				
				temp = String.valueOf(num1[i]);
				
				newLength++;
			}
			
		}
		
		for (int j = 0; j< temp.length(); j++) {
			
			result[j] = temp.charAt(j);
			
		}
		
		

	}

}
