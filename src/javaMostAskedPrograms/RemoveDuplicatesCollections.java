package javaMostAskedPrograms;

//Program to remove duplicates from a String using collections
import java.util.*;

public class RemoveDuplicatesCollections {
	public static void main(String[] args) {
		//Create the string and convert it into lowercase
		String str = "Programming";
		str = str.toLowerCase();
		
		/*
		 * Set stores only unique elements.
			LinkedHashSet removes duplicates while preserving the insertion order.
		 * 
		 * */
		//Create a LinkedHashSet
		Set<Character> set = new LinkedHashSet<>();
		
		//Iterate through the string and Add each character to the set
		for(int i = 0; i < str.length(); i++) {
			/*
			 * str.length() gives the total number of characters.
				str.charAt(i) gets each character.
				set.add() adds the character only if it is not already present.
			 * */
			set.add(str.charAt(i));
		}
		
		//Convert set into a String
		String result = "";
		//The enhanced for loop visits each unique character and adds it to the result string.
		for(char ch: set) {
			result = result + ch;
		}
		
		//Prints original string and the result post removing duplicates
		System.out.println("String before removing duplicates: " + str);
		System.out.println("String after removing duplicates: " + result);
	}
}