package javaMostAskedPrograms;

//25 - Find duplicate words in a sentence.
public class DuplicateWordsInSentence {

	public static void main(String[] args) {
		//Create the sentence
		String sentence = "Java     is easy to learn and Java    is easy to implement";
		
		//Remove unnecessary spaces
		sentence = sentence.trim();
		
		//Check if sentence is empty
		if(sentence.isEmpty()) {
			System.out.println("There are no words in this sentence.");
		} else {
			//Split sentence into words
			String[] words = sentence.split("\\s+");
			
			//Print duplicate words in the sentence
			System.out.print("Duplicate words in the sentence are: ");
			//Iterate through each word
			for(int i = 0; i < words.length; i++) {
				//Iterate through duplicate words
				for(int j = i + 1; j < words.length; j++) {
					if(words[i].equalsIgnoreCase(words[j])) {
						//Print duplicate words
						System.out.print(words[i] + " ");
						break;
					}
				}
			}
		}
		
		

	}

}
