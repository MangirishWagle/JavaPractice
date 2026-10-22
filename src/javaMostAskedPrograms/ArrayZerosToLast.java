package javaMostAskedPrograms;

//22 - Move all zeros to the end of an array.
public class ArrayZerosToLast {

	public static void main(String[] args) {

		//Create the array
		int[] arr = {1, 0, 5, 0, 6, 7, 0, 1, 5, 6, 8};
		
		//Initialize index of the array to 0
		int index = 0;
		
		for(int i = 0; i < arr.length; i++) {
			//If array index is not 0, then position of element in an array equals array index
			if(arr[i] != 0) {
				arr[index] = arr[i];
				index++;
			}
		}
		
		//While array index less than length of an array, increment the index. In other words, shift 0 towards right.
		while(index < arr.length) {
			arr[index] = 0;
			index++;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
