package javaMostAskedPrograms;

//20 - Find the frequency of each element in an array.
public class ArrayFrequency {

	public static void main(String[] args) {
		
		//Initialize array and assign a value
		int[] arr = {10, 10, 30, 20, 10, 30, 60, 50, 50, 60};
		
		
		//Traverse each element in that array
		for(int i = 0; i < arr.length; i++) {
			
			//Initialize count to 1. We start with 1 because the current element itself occurs once.
			int count = 1;
			
			//Skip already counted elements
			if(arr[i] == -1) {
				continue;
			}
			
			//Traverse through remaining elements
			for(int j = i + 1; j < arr.length; j++) {
				
				//If both elements are equal, increase the count by 1. Mark duplicate as -1 so that it won't be counted again.
				if(arr[i] == arr[j]) {
					count++;
					arr[j] = -1;
				}
			}
			
			//Print the result
			System.out.println(arr[i] + " occurs " + count + " times.");
		}

	}

}
