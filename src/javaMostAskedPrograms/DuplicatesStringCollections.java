package javaMostAskedPrograms;

//3 - Find duplicate characters in a string using Map method
import java.util.HashMap;
import java.util.Map;

public class DuplicatesStringCollections {

	public static void main(String[] args) {
		
		String str = "Malayalam";
		
		//Convert string to lowercase
		str = str.toLowerCase();
		
		//Store each character in a HashMap and its frequency
		Map<Character, Integer> map = new HashMap<>();
		
		/*
		 * 
		 * str.toCharArray() converts the string into characters.
			HashMap stores each character and its count.
			getOrDefault(ch, 0) + 1 increases the count for each occurrence.
			map.get(ch) > 1 prints only duplicate characters and their counts.
		 * 
		 * */
		
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
