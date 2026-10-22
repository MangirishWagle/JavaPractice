package javaMostAskedPrograms;

//1 - Java program to reverse a String with using StringBuilder class
public class ReversedStringBuilder {

	public static void main(String[] args) {
		
		//Create a String
		String normalString = "Mangirish";
		//Create reverse of a String using StringBuilder class and reverse() method
		String reversedString = new StringBuilder(normalString).reverse().toString();

		//Print the normal and reversed string respectively
		System.out.println("Normal String is: " + normalString);
		System.out.println("Reversed String is: " + reversedString);
	}

}
