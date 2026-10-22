package javaMostAskedPrograms;

//24 - Reverse an integer without converting it to a string.
public class ReverseInteger {

	public static void main(String[] args) {

		//Creates the number
		int num = 433222;
		//Prints value of the number
		System.out.println("Normal number is: " + num);
		
		//Initialize reversed Number to 0
		int reversedNum = 0;
		
		//While number is non negative or 0
		while(num != 0) {
			//Gets the last digit
			int digit = num % 10;
			//Adds the digit to the reversed number
			reversedNum = reversedNum * 10 + digit;
			//Removes the last digit (integer division)
			num = num / 10;
		}

		//Prints the reversed Number
		System.out.println("Reversed number is: " + reversedNum);
	}

}
