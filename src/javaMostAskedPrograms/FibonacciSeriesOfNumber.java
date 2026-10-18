package javaMostAskedPrograms;
import java.util.*;

public class FibonacciSeriesOfNumber {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {
			int a = 0; 
			int b = 1;
			System.out.print("Enter highest series for Fibonacci: ");
			int n = sc.nextInt();
			
			
			System.out.print(a + " " + b + " ");
			for(int i = 3; i <= n; i++) {
				int c = a + b;
				System.out.print(c + " ");
				a = b;
				b = c;
			}
			
			sc.close();
		} catch(Exception e) {
			System.out.println("Please enter valid number.");
		}

	}

}
