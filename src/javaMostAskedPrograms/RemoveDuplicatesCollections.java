package javaMostAskedPrograms;

import java.util.*;

public class RemoveDuplicatesCollections {
	public static void main(String[] args) {
		String str = "Programming";
		str = str.toLowerCase();
		
		Set<Character> set = new LinkedHashSet<>();
		
		for(int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}
		
		String result = "";
		
		for(char ch: set) {
			result = result + ch;
		}
		
		System.out.println("String before removing duplicates: " + str);
		System.out.println("String after removing duplicates: " + result);
	}
}