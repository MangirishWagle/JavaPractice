package javaMostAskedPrograms;

//8 - Find missing numbers in an array.
public class FindMissingNumberArray {

	public static void main(String[] args) {

		//Create an array
		int[] arr = {1, 2, 4, 5};
		
		//Check all numbers
		for(int i = 1; i <= 5; i++) {
			//Assume that number is not found
			boolean found = false;
			
			//Check for missing number
			for(int j = 0; j < arr.length; j++) {
				//Compare all numbers with the missing one. Find missing number and assign it the value of true
				if(arr[j] == i) {
					found = true;
					break;
				}
			}
			
			//If found = true, then print the missing number.
			if(!found) {
				System.out.println("Missing number is: " + i);
			}
		}
		

	}

}
