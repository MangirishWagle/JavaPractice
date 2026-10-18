package javaMostAskedPrograms;

public class LargestSmallestArray {

	public static void main(String[] args) {

		int[] arr = {10, 20, 30, 40, 70};
		
		int largest = arr[0];
		int smallest = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
		
			if(arr[i] > largest) {
				largest = arr[i];
			} else if  (arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		
		System.out.println("Largest number in the array is: " + largest);
		System.out.println("Smallest number in the array is: " + smallest);

	}

}
