package javaMostAskedPrograms;
import java.util.*;

public class FactorialOfNumber {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter any number: ");
			int num = sc.nextInt();
			int factorialOfNumber  = 1;
			
			for(int i = 1; i < num; i++) {
				factorialOfNumber *= i;
			}
			
			System.out.println("Factorial of number is: " + factorialOfNumber);
			sc.close();
		} catch (Exception e) {
			System.out.print("Please enter a valid number");
		}

	}

}
