package javaMostAskedPrograms;

//3 - Find duplicate characters in a string.
public class JavaDuplicatesString {

	public static void main(String[] args) {
		
		//Initialize String and assign a value
		String str = "Programming";
		str = str.toLowerCase();
		
		//index i for all characters. Traverse it through a loop
		for(int i = 0; i < str.length(); i++) {
			
			//Process all characters
			char ch = str.charAt(i);
			
			//Skip characters already processed
			if(str.indexOf(ch) != i) {
				continue;
			}
			
			//Initialize count of duplicate characters
			int count = 0;
			
			//index j for duplicate characters
			for(int j = 0; j < str.length(); j++) {
				//If character is a duplicate, increase the count
				if(str.charAt(j) == ch) {
					count++;
				}
			}
			
			
			if(count > 1) {
				System.out.println(ch + " appears " + count + " times");
			}
			
		}

	}

	

}
