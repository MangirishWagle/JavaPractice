package javaMostAskedPrograms;
import java.util.Scanner;
public class StringPalindromeStringBuilder {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter a string: ");
			String normalString = sc.nextLine();
			
			//String normalString = "malayalam";
			//String reversedString = "";
			
			String reversedString = new StringBuilder(normalString).reverse().toString();
			
			System.out.println("Normal String is: " + normalString);
			System.out.println("Reversed String is: " + reversedString);
			
			if(normalString.equals(reversedString)) {
				System.out.println("String is a palindrome");
			} else {
				System.out.println("String is not a palindrome");		
			}
		}
		
		catch (Exception e) {
			System.out.println("No input entered.");
		}
	
	}

}
