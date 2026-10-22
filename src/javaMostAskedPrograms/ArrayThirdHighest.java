package javaMostAskedPrograms;

//23 - Find the third-highest number in an array.
public class ArrayThirdHighest {

	public static void main(String[] args) {

		//Create the array
		int[] arr = {10, 5, 20, 8, 15};
		
		//Initialize first-highest, second-highest and third-highest
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;
		
		//Traverse numbers through the array
		for(int num: arr) {
			
			//If the current number is greater than the highest number, move the existing values down one position and store the new highest number.
			if(num > first) {
				third = second;
				second = first;
				first = num;
			}
			
			//If the number is smaller than the highest but greater than the second-highest, update the second and third positions.
			
			if(num > second && num != first) {
				third = second;
				second = num;
			}
			
			/*
			 * If the number is smaller than the first and second numbers but greater than the third, update the third-highest number.
			 * The num != first and num != second checks ensure that duplicate values aren't counted more than once.
			 * 
			 * */
			if (num > third && num != first && num != second) {
				third = num;
			}
			
		}

		//Condition to fulfill, if third highest number doesn't exist
		if(third == Integer.MIN_VALUE) {
			System.out.println("Third highest number doesn't exist");
		} else {
			System.out.println("Third highest number: " + third);
		}
	}

}
