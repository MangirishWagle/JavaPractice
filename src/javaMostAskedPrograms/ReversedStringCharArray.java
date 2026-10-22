package javaMostAskedPrograms;

//Program to reverse a String using Character Array
public class ReversedStringCharArray {

	public static void main(String[] args) {
		//Create a String and print its value
		String normalString = "Mangirish";
		System.out.println("Normal String is: " + normalString);
		
		//Convert String into a Character Array
		char[] charArrayOfNormalString = normalString.toCharArray();
		
		//Intialize the reverse of a String
		String reversedString = "";
		
		//Iterate through the Character Array and traverse it backwards
		for(int i = charArrayOfNormalString.length - 1; i >= 0; i--) {
			//Append each character to the result
			reversedString += charArrayOfNormalString[i];
		}
		System.out.println("Reversed String is: " + reversedString);

	}

}
