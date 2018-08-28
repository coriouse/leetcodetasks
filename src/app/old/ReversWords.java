package app.old;

import java.util.Arrays;

public class ReversWords {

    public String reverseWords(String str) {

        String[] arr = str.split(" ");

        System.out.println(Arrays.toString(arr));

        for(int i = 0;i< arr.length/2;i++) {
            String t = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = t;
        }

        StringBuilder sb = new StringBuilder();
        for(String s : arr) {
            sb.append(s).append(" ");
        }

        System.out.println(sb.toString().trim());

        return sb.toString().trim();
    }


    public static void main(String[] args) {
        String message = "find you will pain only go you recordings security the into if";

        ReversWords reversWords = new ReversWords();
        reversWords.reverseWords(message);


        assert "if into the security recordings you go only pain will you find".equals(reversWords.reverseWords(message));
    }

}
