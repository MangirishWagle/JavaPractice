package javaMostAskedPrograms;

import java.util.HashMap;
import java.util.Map;

public class DuplicatesStringCollections {

	public static void main(String[] args) {
		
		String str = "Malayalam";
		
		//Convert string to lowercase
		str = str.toLowerCase();
		
		//Store each character in a HashMap and its frequency
		Map<Character, Integer> map = new HashMap<>();
		
		for (char ch: str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		
		for(char ch: map.keySet()) {
			if(map.get(ch) > 1) {
				System.out.println("Character " + ch + " appears " + map.get(ch) + " times.");
			}
		}
		
	}

}
