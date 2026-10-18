package javaMostAskedPrograms;

public class DuplicateElementsArray {

	public static void main(String[] args) {
		
		int[] arr = {10, 10, 20, 20, 40, 34, 34, 232, 233, 231, 12};
		
		System.out.println("The duplicate elements are: ");
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.println(arr[i]);
					break;
				}
			}
		}
	}
}
