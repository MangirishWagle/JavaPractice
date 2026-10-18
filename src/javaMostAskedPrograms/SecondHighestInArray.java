package javaMostAskedPrograms;

public class SecondHighestInArray {

	public static void main(String[] args) {

		int[] arr = {21, 45, 11, 23, 23};
		int firstHighest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] > firstHighest) {
				secondHighest = firstHighest;
				firstHighest = arr[i];
			} else if (arr[i] > secondHighest && arr[i] != firstHighest) {
				secondHighest = arr[i];
			}
			
		}
		
		System.out.println("Second highest number is: " + secondHighest);

	}

}
