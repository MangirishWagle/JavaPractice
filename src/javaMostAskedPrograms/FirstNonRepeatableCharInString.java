package javaMostAskedPrograms;
import java.util.*;

//10 - Find the first non-repeated character in a string.
public class FirstNonRepeatableCharInString {

	public static void main(String[] args) {
		
		//Create the STring
		String str = "Mangirish";
		
		/*
		 * Create a LinkedHashMap
		 * Character stores each character, such as s, w, and i.
			Integer stores the number of times each character occurs.
			LinkedHashMap maintains the insertion order, which is important because we need the first non-repeated character.
		 * 
		 * */
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		
		//Count each character
		/*
		 * str.toCharArray() converts the String into a character array.
			for (char ch : ...) visits each character one by one.
			map.getOrDefault(ch, 0) returns the existing count. If the character is not present, it returns 0.
			+ 1 increases the count by one.
			map.put(ch, ...) stores the updated count.
		 * */
		for(char ch: str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		
		//Find first character that appears once
		/*
		 * - map.entrySet() gives us each character and its count.
			- entry.getValue() returns the count.
			- entry.getValue() == 1 checks whether the character appears only once.
			- entry.getKey() returns the character.
			- return stops the program's main method after finding the answer.
			The map is checked in insertion order:
			1. s → count is 3, so skip it.
			2. w → count is 1, so print w and stop.
		 * */
		for(Map.Entry<Character, Integer> entry: map.entrySet()) {
			if(entry.getValue() == 1) {
				System.out.println("First Non-repeatable character is: " + entry.getKey());
				return;
			}
		}
		
		System.out.println("No non-repeatable character found");

	}

}
