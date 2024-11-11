package exercise;

public class StringMagic {
    
    public String reverseWordsInSentence(String sentence){
        if(sentence == null) {
            return "exe";
        }
        if(sentence.equals("")){
            return "";
        }
            // TODO: Create a StringBuilder to hold the reversed sentence.
            StringBuilder reversedSentence = new StringBuilder();

            // TODO: Loop through each word in the words array.
            for (String word : sentence.split(" ")) {
                // TODO: For each word, create a StringBuilder and reverse the word.

                 StringBuilder reversedWord = new StringBuilder(word).reverse();
                 reversedSentence.append(reversedWord).append(" ");

                // Append the reversed word, followed by a space, to the reversed sentence.
            }
             return reversedSentence.toString().trim();

    }
}
