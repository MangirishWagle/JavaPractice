package javaMostAskedPrograms;

public class ReversedStringCharArray {

	public static void main(String[] args) {
		String normalString = "Mangirish";
		System.out.println("Normal String is: " + normalString);
		char[] charArrayOfNormalString = normalString.toCharArray();
		String reversedString = "";
		
		for(int i = charArrayOfNormalString.length - 1; i >= 0; i--) {
			reversedString += charArrayOfNormalString[i];
		}
		System.out.println("Reversed String is: " + reversedString);

	}

}
