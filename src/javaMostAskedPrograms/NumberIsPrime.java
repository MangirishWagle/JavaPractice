package javaMostAskedPrograms;

import java.util.*;

public class NumberIsPrime {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {
			
			System.out.print("Enter any number: ");
			int num = sc.nextInt();
			
			boolean isPrime = true;
			
			if(num <= 1) {
				isPrime = false;
			} else {
				for(int i = 2; i < num; i++) {
					if(num % i == 0) {
						isPrime = true;
						break;
					}
				}
			}
			
			if(isPrime) {
				System.out.println("Number is a Prime Number");
			} else {
				System.out.println("Number is not Prime Number");
			}
			
			
			sc.close();
			
		} catch (Exception e) {
			System.out.println("");
		}

	}

}
