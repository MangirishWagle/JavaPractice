package javaMostAskedPrograms;

//21 - Find common elements between two arrays.
public class CommonElementsInArrays {

	public static void main(String[] args) {
		
		//Create first and second array
		int[] arr1 = {10, 30, 20, 40, 50};
		int[] arr2 = {10, 40, 90, 80, 70};
		
		
		System.out.print("Common elements in both arrays are: ");
		
		//Traverse through first array
		for(int i = 0; i < arr1.length; i++) {
			//Traverse through second array, while traversing first array.
			for(int j = 0; j < arr2.length; j++) {
				//Compare two arrays, if equals then return the common element in those arrays
				if(arr1[i] == arr2[j]) {
					System.out.print(arr1[i] + " ");
					break;
				}
			}
		}

	}

}
