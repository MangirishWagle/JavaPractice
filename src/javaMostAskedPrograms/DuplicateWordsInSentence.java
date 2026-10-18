package javaMostAskedPrograms;

public class DuplicateWordsInSentence {

	public static void main(String[] args) {
		String sentence = "Java     is easy to learn and Java    is easy to implement";
		sentence = sentence.trim();
		
		if(sentence.isEmpty()) {
			System.out.println("There are no words in this sentence.");
		} else {
			String[] words = sentence.split("\\s+");
			System.out.print("Duplicate words in the sentence are: ");
			for(int i = 0; i < words.length; i++) {
				for(int j = i + 1; j < words.length; j++) {
					if(words[i].equalsIgnoreCase(words[j])) {
						System.out.print(words[i] + " ");
						break;
					}
				}
			}
		}
		
		

	}

}
