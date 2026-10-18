package javaMostAskedPrograms;

public class ReversedStringBuilder {

	public static void main(String[] args) {
		
		String normalString = "Mangirish";
		String reversedString = new StringBuilder(normalString).reverse().toString();

		System.out.println("Normal String is: " + normalString);
		System.out.println("Reversed String is: " + reversedString);
	}

}
