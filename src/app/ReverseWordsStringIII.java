package app;

/**
 * Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
 * <p>
 * Example 1:
 * Input: "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"
 * Note: In the string, each word is separated by single space and there will not be any extra space in the string.
 */
public class ReverseWordsStringIII {

    public static void main(String[] args) {

        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }


    public static String reverseWords(String s) {
        if(s == null || s.length() == 0)
            return "";

        s = reverseString(s);
        String[] words = s.split("[ ]");
        int i = 0;
        int j = words.length - 1;
        while(i<j) {
            String t = words[i];
            words[i] = words[j];
            words[j] = t;
            i++;
            j--;
        }

        return String.join(" ", words);
    }




    private static String reverseString(String s) {
        int i = 0;
        int j = s.length() - 1;
        char[] ar = s.toCharArray();
        while (i < j) {
            char t = ar[i];
            ar[i] = ar[j];
            ar[j] = t;
            i++;
            j--;
        }
        return new String(ar);
    }
}
