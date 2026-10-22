//4 - Count the occurrence of each character in a string using Map
package javaMostAskedPrograms;

import java.util.*;

public class CountOccurenceStringMap {
	public  static void main (String[] args) {
		
		//Create String and convert it to lowercase
		String str = "Malayalam";
		str= str.toLowerCase();
		
		//Initialize the map
		HashMap<Character, Integer> map = new  HashMap<>();
		
		/*Traverse every character in the string.
		toCharArray() converts the String into characters.
		getOrDefault(ch, 0) returns the existing count or 0.
		+ 1 increments the character count.*/
		for(char ch: str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		
		//1st method --> Directly get map
		System.out.println("Method 1 - Directly get the occurence of characters in a Map");
		System.out.println(map);
		
		//Alternate method
		System.out.println("Alternate Method");
		for(char ch: map.keySet()) {
			System.out.println("Character " + ch + " appears " + map.get(ch) + " times");
		}
	}
}
