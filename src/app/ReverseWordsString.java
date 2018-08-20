package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an input string, reverse the string word by word.
 *
 * Example:
 *
 * Input: "the sky is blue",
 * Output: "blue is sky the".
 * Note:
 *
 * A word is defined as a sequence of non-space characters.
 * Input string may contain leading or trailing spaces. However, your reversed string should not contain leading or trailing spaces.
 * You need to reduce multiple spaces between two words to a single space in the reversed string.
 * Follow up: For C programmers, try to solve it in-place in O(1) space.
 */
public class ReverseWordsString {

    public static void main(String[] args) {

    //    String s ="the                sky  is    blue";
  //      String s ="   a   b ";
        String s =" 1";

        System.out.println(reverseWords(s));

    }


    public static String reverseWords(String s) {

        List<String> wordList = new ArrayList<>();
        s = s.trim();
        int k = 0;
        StringBuffer sb = new StringBuffer();
        while(k<s.length()) {
            if(s.charAt(k) == ' ' && s.charAt(k-1) != ' ' && k > 0 || k == s.length()-1) {
                if(k == s.length()-1)
                    sb.append(s.charAt(k));

                wordList.add(sb.toString());
                sb.setLength(0);
            } else if(s.charAt(k) != ' ') {
                sb.append(s.charAt(k));
            }
            k++;
        }

        String[] words = new String[wordList.size()];
        int n = 0;
        for(String st : wordList) {
            words[n] = st;
            n++;
        }

        int len = words.length;
        if(len  == 1)
            return words[0].trim();

        int i = 0;
        int j = len -1;
        while(i<j) {
            String t = words[i];
            words[i] = words[j].trim();
            words[j] = t.trim();
            i++;
            j--;
        }


    return String.join(" ", words);
    }
}
