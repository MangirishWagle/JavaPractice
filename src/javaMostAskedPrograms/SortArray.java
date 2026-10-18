package javaMostAskedPrograms;

public class SortArray {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 56, 34, 67, 12};
		
		System.out.println("Unsorted array: ");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
		//Sorting operation
		for(int i = 0; i < arr.length - 1; i++) {
			
			for(int j = 0; j < arr.length - 1 - i; j++) {
				
				int temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
			
		}
		
		System.out.println();
		System.out.println("Sorted Array: ");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
