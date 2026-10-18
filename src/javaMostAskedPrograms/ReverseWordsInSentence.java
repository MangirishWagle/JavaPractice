package javaMostAskedPrograms;

public class ReverseWordsInSentence {

	public static void main(String[] args) {
		
		String normalSentence = "Learning Java is so Cool!";
		String[] wordsInSentence = normalSentence.split(" ");
		StringBuilder reversedSentence = new StringBuilder();
		
		for(int i = 0; i < wordsInSentence.length; i++) {
			String letterInWord = wordsInSentence[i];
			String reversedWord = "";
			for (int j = letterInWord.length() - 1; j >= 0; j-- ) {
				reversedWord += letterInWord.charAt(j);
			}
			reversedSentence.append(reversedWord);
			if(i < wordsInSentence.length - 1) {
				reversedSentence.append(" ");
			}
		}
		
		System.out.println("Normal Sentence is: " + normalSentence);
		System.out.println("Reversed sentence is: " + reversedSentence);

	}

}
