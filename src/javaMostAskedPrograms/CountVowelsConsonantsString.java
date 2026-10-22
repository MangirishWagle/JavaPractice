package javaMostAskedPrograms;

//11 - Count vowels and consonants in a string.
public class CountVowelsConsonantsString {

	public static void main(String[] args) {

		//Create string and convert it into lowercase
		String str = "Mangirish";
		str = str.toLowerCase();
		
		//Initialize count of vowels and consonants
		int vowelsInString = 0;
		int consonantsInString = 0;
		
		//Traverse through every character in the String
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			//Considering A to Z
			if(ch >= 'a' && ch <= 'z') {
				//Considering vowels only, else consonants
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowelsInString++;
				} else {
					consonantsInString++;
				}
			}
		}
		
		//Print the result
		System.out.println("Vowels in String are: " + vowelsInString);
		System.out.println("Consonants in String are: " + consonantsInString);

	}

}
