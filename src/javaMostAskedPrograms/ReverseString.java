package javaMostAskedPrograms;
import java.util.Scanner;

//1 - Java program to reverse a String without using StringBuilder class
public class ReverseString {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)) {
			
			System.out.print("Enter a String: ");
			String normalString = sc.next();
			System.out.println("Normal String is: " + normalString);
			String reversedString = "";
			
			for(int i = normalString.length() - 1; i >=0; i--) {
				reversedString += normalString.charAt(i);
			}
			
			System.out.println("Reversed String is: " + reversedString);
			
			sc.close();
		} catch (Exception e) {
			System.out.println("Please enter an input.");
		}

	}

}
