package javaMostAskedPrograms;

//4 - Count the occurrence of each character in a string.
public class CountOccurenceString {

	public static void main(String[] args) {
		//Create a string and convert it into lower-case for ease of counting, considering Java is case-sensitive
		String str = "Malayalam";
		str = str.toLowerCase();
		
		//Traverse String through a loop
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			//Ensures that each character is counted only once
			if(str.indexOf(ch) == i) {
				//Initialize count of each character
				int count = 0;
				
				//The inner loop counts how many times that character appears.
				for(int j = 0; j < str.length(); j++) {
					if (ch == str.charAt(j)) {
						count++;
					}
				}
				
				//Print the result
				System.out.println("Character " + ch + " occurs " + count + " times.");
				
			}
			
			
		}

	}

}
