package javaMostAskedPrograms;

public class CountVowelsConsonantsString {

	public static void main(String[] args) {

		String str = "Mangirish";
		str = str.toLowerCase();
		
		int vowelsInString = 0;
		int consonantsInString = 0;
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch >= 'a' && ch <= 'z') {
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowelsInString++;
				} else {
					consonantsInString++;
				}
			}
		}
		
		System.out.println("Vowels in String are: " + vowelsInString);
		System.out.println("Consonants in String are: " + consonantsInString);

	}

}
