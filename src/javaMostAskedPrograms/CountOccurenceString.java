package javaMostAskedPrograms;

public class CountOccurenceString {

	public static void main(String[] args) {
		String str = "Malayalam";
		
		str = str.toLowerCase();
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(str.indexOf(ch) == i) {
				int count = 0;
				for(int j = 0; j < str.length(); j++) {
					if (ch == str.charAt(j)) {
						count++;
					}
				}
				
				System.out.println("Character " + ch + " occurs " + count + " times.");
				
			}
			
			
		}

	}

}
