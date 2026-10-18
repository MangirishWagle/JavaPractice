package javaMostAskedPrograms;

public class WordsInSentence {
	public static void main(String[] args) {
		String sentence = "Java     is easy to learn";
		sentence = sentence.trim();
		
		if(sentence.isEmpty()) {
			System.out.println("There are no words in this sentence.");
		} else {
			String[] words = sentence.split("\\s+");
			System.out.println("No. of words in the sentence: " + words.length);
		}
		
		
	}
}
