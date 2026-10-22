package javaMostAskedPrograms;
import java.util.*;

//13 - Find the factorial of a number.
public class FactorialOfNumber {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {
			
			//Take input of the number
			System.out.print("Enter any number: ");
			int num = sc.nextInt();
			
			//Initialize value of factorial of a number to 1
			int factorialOfNumber  = 1;
			
			//Iterate through the value of given number
			for(int i = 1; i < num; i++) {
				//Multiply it with adjacent number
				factorialOfNumber *= i;
			}
			
			//Print the factorial value
			System.out.println("Factorial of number is: " + factorialOfNumber);
			sc.close();
		} catch (Exception e) {
			System.out.print("Please enter a valid number");
		}

	}

}
