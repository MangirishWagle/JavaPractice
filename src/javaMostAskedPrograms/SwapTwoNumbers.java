package javaMostAskedPrograms;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		System.out.println("Value of a before swapping is: " + a + " and b is: " + b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("Value of a after swapping is: " + a + " and b is: " + b);
		

	}

}
