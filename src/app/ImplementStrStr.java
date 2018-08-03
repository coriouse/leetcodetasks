package app;

/**
 * Implement strStr().
 * <p>
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * <p>
 * Example 1:
 * <p>
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 * Example 2:
 * <p>
 * Input: haystack = "aaaaa", needle = "bba"
 * Output: -1
 * Clarification:
 * <p>
 * What should we return when needle is an empty string? This is a great question to ask during an interview.
 * <p>
 * For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
 */
public class ImplementStrStr {


    public static void main(String[] args) {
        //String haystack = "hello";
        //String needle = "ll";

       // String haystack =  "a";
       // String needle = "";


    //    String haystack =  "mississippi";
     //   String needle = "issip";


       // String haystack = "";
       // String needle = "";

       // String haystack = "aaaaa";
       // String needle = "bba";

        String haystack = "aaa";
        String needle = "aaaa";

//        String haystack = "bbaa";
 //       String needle = "aab";

        System.out.println(strStr(haystack, needle));

    }


    public static int strStr(String haystack, String needle) {

        if (needle == null ||  haystack == null || needle.length() == 0)
            return 0;

        int lenNeedle = needle.length();
        char firstChar = needle.charAt(0);

        for (int i = 0; i < haystack.length(); i++) {
            int spin = 0;
            if (haystack.charAt(i) == firstChar) {
                if(lenNeedle > haystack.length()-i)
                    return -1;


                for (int j = 0; j < lenNeedle; j++) {
                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        if(haystack.length()-i >= lenNeedle)
                            continue;
                        return -1;
                    }
                    spin++;
                }
                if(spin == lenNeedle)
                    return i;
            }
        }

        return -1;
    }

    /*public int strStr(String haystack, String needle) {
        for (int i = 0; ; i++) {
            for (int j = 0; ; j++) {
                if (j == needle.length()) return i;
                if (i + j == haystack.length()) return -1;
                if (needle.charAt(j) != haystack.charAt(i + j)) break;
            }
        }
    }*/

}
