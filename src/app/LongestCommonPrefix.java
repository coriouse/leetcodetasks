package app;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * <p>
 * If there is no common prefix, return an empty string "".
 * <p>
 * Example 1:
 * <p>
 * Input: ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 * <p>
 * Input: ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * Note:
 * <p>
 * All given inputs are in lowercase letters a-z.
 *
 *
 *
 *
 *
 * Solution
 * https://leetcode.com/problems/longest-common-prefix/solution/
 */

public class LongestCommonPrefix {


    public static void main(String[] args) {

        String[] words = {"flower","flow","flight"};
        //String[] words = {"a"};
       // String[] words = {"", "b"};
       // String[] words = {"aa","a"};
        //Output: "fl"

        System.out.println(longestCommonPrefix(words));
    }


    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        int countWords = strs.length;
        List<Integer> list = Arrays.asList(strs).stream().map(e -> e.length()).collect(Collectors.toList());
        int maxLength = Collections.max(list);
        String maxLengthWord = Arrays.asList(strs).stream().filter(e -> e.length() == maxLength).findFirst().get();


        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < maxLengthWord.length(); i++) {
            int count = 0;
            for (int j = 0; j < countWords; j++) {
                if (strs[j].length() == 0) {
                    return "";
                }
                if (strs[j].length()-1 < i) {
                    return sb.toString();
                }
                if (maxLengthWord.charAt(i) == strs[j].charAt(i)) {
                    count++;
                }
            }

            if (count == countWords) {
                sb.append(maxLengthWord.charAt(i));
            } else {
                break;
            }

        }

        return sb.toString();

    }

}
