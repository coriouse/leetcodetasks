package app;


/**
 *
 * Write a function that takes a string as input and returns the string reversed.
 *
 * Example 1:
 *
 * Input: "hello"
 * Output: "olleh"
 * Example 2:
 *
 * Input: "A man, a plan, a canal: Panama"
 * Output: "amanaP :lanac a ,nalp a ,nam A"
 *
 *
 */
public class ReverseString {


    public static void main(String[] args) {
        //String txt = "hello";
        String txt = "A man, a plan, a canal: Panama";


        System.out.println(reverseString(txt));

    }


    public static String reverseString(String s) {
        if(s == null || s.length() == 0)
            return "";

        int start = 0;
        int end = s.length()-1;
        char[] arr = s.toCharArray();
        while(start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }

        return new String(arr);
    }

    private static void swap(char[] txt, int start, int end) {
        char t = txt[start];
        txt[start] = txt[end];
        txt[end] = t;
    }
}
