package javaMostAskedPrograms;

public class ReverseWordsInSentenceStringBuilder {

	public static void main(String[] args) {
		String normalSentence = "Java Selenium Automation Testing";
		String[] wordsInSentence = normalSentence.split(" ");
		StringBuilder reversedSentence = new StringBuilder();
		
		for(int i = 0; i < wordsInSentence.length; i++) {
			
			String reversedWord = new StringBuilder(wordsInSentence[i]).reverse().toString();
			
			reversedSentence.append(reversedWord);
			
			if(i < reversedWord.length() - 1) {
				reversedSentence.append(" ");
			}
			
		}
		
		System.out.println("Normal sentence is: " + normalSentence);
		System.out.println("Reversed sentence is: " + reversedSentence);
	}
}
