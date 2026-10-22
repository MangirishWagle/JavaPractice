package javaMostAskedPrograms;

import java.util.*;

//Java Program to find if the number is Prime
public class NumberIsPrime {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {
			
			//Create Prime Number
			System.out.print("Enter any number: ");
			int num = sc.nextInt();
			
			//Initialize/Assume that a number is Prime
			boolean isPrime = true;
			
			//Since one, 0 and -ve numbers are not a Prime, return false, else return true for rest of numbers, starting from 2
			if(num <= 1) {
				isPrime = false;
			} else {
				for(int i = 2; i < num; i++) {
					//with a condition that remainder must be 0
					if(num % i == 0) {
						isPrime = true;
						break;
					}
				}
			}
			
			//If number is Prime, then print that number is a prime, else not a Prime number
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
