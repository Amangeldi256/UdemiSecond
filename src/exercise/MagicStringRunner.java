package exercise;

public class MagicStringRunner {
    public static void main(String[] args) {
        MagicString magicString = new MagicString();
        String word1 = "listen";
        String word2 = "silent";

        String word3 = "hello";
        String word4 = "olelh";

        boolean result1 = magicString.areAnagrams(word3, word4);
        System.out.println(result1);

        boolean result = magicString.areAnagrams(word1, word2);
        System.out.println("Are '" + word1 + "' and '" + word2 + "' anagrams? " + result);


        MyString myString = new MyString("Afbc154");
        System.out.println("muString " + myString.isHexadecimal());

        
    }
}
