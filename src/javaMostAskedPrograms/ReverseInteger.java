package javaMostAskedPrograms;

public class ReverseInteger {

	public static void main(String[] args) {

		int num = 433222;
		System.out.println("Normal number is: " + num);
		int reversedNum = 0;
		
		while(num != 0) {
			int digit = num % 10;
			reversedNum = reversedNum * 10 + digit;
			num = num / 10;
		}

		System.out.println("Reversed number is: " + reversedNum);
	}

}
