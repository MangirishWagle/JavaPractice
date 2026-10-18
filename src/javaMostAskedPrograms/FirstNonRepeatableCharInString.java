package javaMostAskedPrograms;
import java.util.*;

public class FirstNonRepeatableCharInString {

	public static void main(String[] args) {
		
		String str = "Mangirish";
		
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		
		//Count each character
		for(char ch: str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		
		//Find first character that appears once
		for(Map.Entry<Character, Integer> entry: map.entrySet()) {
			if(entry.getValue() == 1) {
				System.out.println("First Non-repeatable character is: " + entry.getKey());
				return;
			}
		}
		
		System.out.println("No non-repeatable character found");

	}

}
