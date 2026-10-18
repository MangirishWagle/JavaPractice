package javaMostAskedPrograms;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
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

		System.out.println("Before removing duplicates: " + str);
		System.out.println("After removing duplicates: " + result);
	}

}
