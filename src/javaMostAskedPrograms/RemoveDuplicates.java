package javaMostAskedPrograms;

//18 - Remove duplicate characters from a string.
public class RemoveDuplicates {

	public static void main(String[] args) {
		
		//Create a String, convert it into lower-case
		String str = "Malayalam";
		str = str.toLowerCase();
		String result = "";
		
		for(int i = 0; i < str.length(); i++) {
			//pulls all characters from that String
			char ch = str.charAt(i);
			
			/*
			 * Check whether character already exists.
			 * indexOf(ch) checks whether character already exists. If the character does not exist, it returns -1
			*/
			if(result.indexOf(ch) == -1) {
				result += ch;
			}
		}
		
		//
		System.out.println("Before removing duplicates: " + str);
		System.out.println("After removing duplicates: " + result);
	}

}
