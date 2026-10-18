package javaMostAskedPrograms;

public class CommonElementsInArrays {

	public static void main(String[] args) {
		
		int[] arr1 = {10, 30, 20, 40, 50};
		int[] arr2 = {10, 40, 90, 80, 70};
		
		System.out.print("Common elements in both arrays are: ");
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					System.out.print(arr1[i] + " ");
					break;
				}
			}
		}

	}

}
