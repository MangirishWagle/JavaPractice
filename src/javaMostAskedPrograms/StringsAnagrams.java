package javaMostAskedPrograms;

import java.util.Arrays;

public class StringsAnagrams {

	public static void main(String[] args) {

		String str1 = "listen";
		String str2 = "silent";
		
		char a[] = str1.toCharArray();
		char b[] = str2.toCharArray();
		
		//Sort both character Arrays
		Arrays.sort(a);
		Arrays.sort(b);
		
		if(Arrays.equals(a, b)) {
			System.out.println("String is an anagram");
		} else {
			System.out.println("String is not an anagram");
		}
	}

}
