package exercise;

import java.util.Arrays;

public class MagicString {
    public boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        if(str1 == null || str2 == null) {
            return false;
        }

        String lowercaseStr1 = str1.toLowerCase();
        String lowercaseStr2 = str2.toLowerCase();

         char[] strChar1 = lowercaseStr1.toCharArray();
         char[] strChar2 = lowercaseStr2.toCharArray();

         Arrays.sort(strChar1);
         Arrays.sort(strChar2);

         return Arrays.equals(strChar1, strChar2);


       // var leftStat = getLetterStat(str1);
       // var rightStat = getLetterStat(str2);
       // return leftStat.equals(rightStat);
    }

   /*private static Map<Character, Integer> getLetterStat(String word) {
        Map<Character, Integer> stat = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            stat.put(c, stat.getOrDefault(c, 0) + 1);
        }
        return stat;
    } */ 
}
