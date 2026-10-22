package javaMostAskedPrograms;

//7 - Find duplicate elements in an array.
public class DuplicateElementsArray {

	public static void main(String[] args) {
		
		//Create array
		int[] arr = {10, 10, 20, 20, 40, 34, 34, 232, 233, 231, 12};
		
		System.out.println("The duplicate elements are: ");
		//Traverse each number in the array
		for(int i = 0; i < arr.length; i++) {
			//Traverse only duplicate elements
			for(int j = i + 1; j < arr.length; j++) {
				//Print duplicates if values of the index of array matches
				if(arr[i] == arr[j]) {
					System.out.println(arr[i]);
					break;
				}
			}
		}
	}
}
