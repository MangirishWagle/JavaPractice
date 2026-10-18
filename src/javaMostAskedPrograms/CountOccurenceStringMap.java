//Java program to count occurrence of each character in a string
package javaMostAskedPrograms;

import java.util.*;



public class CountOccurenceStringMap {
	public  static void main (String[] args) {
		String str = "Malayalam";
		
		str= str.toLowerCase();
		
		HashMap<Character, Integer> map = new  HashMap<>();
		
		for(char ch: str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch,0) + 1);
		}
		
		//1st method --> Directly get map
		//System.out.println(map);
		
		//Alternate method
		for(char ch: map.keySet()) {
			System.out.println("Character " + ch + " appears " + map.get(ch) + " times");
		}
	}
}
