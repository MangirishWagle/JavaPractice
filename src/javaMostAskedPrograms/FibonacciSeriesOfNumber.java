package javaMostAskedPrograms;
import java.util.*;

//14 - Print the Fibonacci series of numbers in an array.
public class FibonacciSeriesOfNumber {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {
			int a = 0; 
			int b = 1;
			System.out.print("Enter highest number of Fibonacci series: ");
			//Highest number of the Fibonacci series
			int n = sc.nextInt();
			
			
			System.out.print(a + " " + b + " ");
			//Initialize for loop from third number and iterate through the series till highest number of Fibonacci series
			//The loop starts at 3 because the first two numbers are already printed. It continues until the 10th number.
			for(int i = 3; i <= n; i++) {
				//Adds the previous two numbers to calculate the next number.
				int c = a + b;
				System.out.print(c + " ");
				//Moves the second number into the first variable.
				a = b;
				//Moves the newly calculated number into the second variable.
				b = c;
				//These last two lines prepare the variables for the next iteration.
			}
			
			sc.close();
		} catch(Exception e) {
			System.out.println("Please enter valid number.");
		}

	}

}
