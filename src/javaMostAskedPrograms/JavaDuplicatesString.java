package javaMostAskedPrograms;

public class JavaDuplicatesString {

	public static void main(String[] args) {
		
		String str = "Programming";
		
		//index i for all characters
		for(int i = 0; i < str.length(); i++) {
			
			//Process all characters
			char charOfString = str.charAt(i);
			
			//Skip characters already processed
			if(str.indexOf(charOfString) != i) {
				continue;
			}
			
			//Initialize count of duplicate characters
			int count = 0;
			
			//index j for duplicate characters
			for(int j = 0; j < str.length(); j++) {
				if(str.charAt(j) == charOfString) {
					count++;
				}
			}
			
			if(count > 1) {
				System.out.println(charOfString + " appears " + count + " times");
			}
			
		}

	}

	

}
