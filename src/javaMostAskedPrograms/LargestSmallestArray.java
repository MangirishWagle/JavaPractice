package javaMostAskedPrograms;

//Get Largest and Smallest number in the array
public class LargestSmallestArray {

	public static void main(String[] args) {

		//Create the array
		int[] arr = {10, 20, 30, 40, 70};
		
		//Initialize largest and smallest element in the array
		int largest = arr[0];
		int smallest = arr[0];
		
		//Traverse through each element of the array
		for(int i = 1; i < arr.length; i++) {
		
			//if condition for getting largest number. Else for getting smallest number
			if(arr[i] > largest) {
				largest = arr[i];
			} else if  (arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		
		//Print largest and smallest element in an array
		
		System.out.println("Largest number in the array is: " + largest);
		System.out.println("Smallest number in the array is: " + smallest);

	}

}
