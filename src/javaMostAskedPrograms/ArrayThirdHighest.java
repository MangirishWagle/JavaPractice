package javaMostAskedPrograms;

public class ArrayThirdHighest {

	public static void main(String[] args) {

		int[] arr = {10, 5, 20, 8, 15};
		
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;
		
		for(int num: arr) {
			if(num > first) {
				third = second;
				second = first;
				first = num;
			}
			
			if(num > second && num != first) {
				third = second;
				second = num;
			}
			
			if (num > third && num != first && num != second) {
				third = num;
			}
			
		}

		if(third == Integer.MIN_VALUE) {
			System.out.println("Third highest number doesn't exist");
		} else {
			System.out.println("Third highest number: " + third);
		}
	}

}
