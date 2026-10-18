package javaMostAskedPrograms;
import java.util.*;

public class SortArrayDescendingAscending {

	public static void main(String[] args) {
		
		//Without using Collections

		int[] arr = {10, 34, 67, 21, 12, 89, 12};
		
		System.out.println("Without using Collections");
		System.out.print("Unsorted array: ");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		for(int i = 0; i < (arr.length - 1); i++) {
			for(int j = 0; j < ((arr.length - 1) - i); j++) {
				if(arr[j + 1] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		
		
		System.out.println();
		System.out.print("Sorted array in Descending Order: ");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +  " ");
		}
		
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - 1; j++) {
				if(arr[j + 1] < arr[j]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		System.out.println();
		System.out.print("Sorted array in Ascending order: ");
		
		for(int i=0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
		
		
		
		System.out.println();
		System.out.println();
		
		//Using Collections
		Integer[] arrayCollection = {10, 34, 67, 21, 12, 89, 12};
		
		//Descending Order
		Arrays.sort(arrayCollection, Collections.reverseOrder());
		System.out.print("Sorted array in Descending Order using Collections: ");
		System.out.print(Arrays.toString(arrayCollection));
		
		System.out.println();
		
		//Ascending Order
		Arrays.sort(arrayCollection);
		System.out.print("Sorted array in Ascending Order using Collections: ");
		System.out.print(Arrays.toString(arrayCollection));
		
		
		
	}

}
