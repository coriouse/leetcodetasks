package app.cci;

public class CompressionString {


    public static void main(String[] args) {
        String s = "aabcccccaaa";
        //output a2blc5a3.

        compressStreing(s);

    }


    public static void compressStreing(String s) {

        int count = 0;

        String res = "";
        for(int i = 0;i<s.length();i++) {
            count++;

            if(i>=s.length()-1 || s.charAt(i) != s.charAt(i+1)) {
                res += s.charAt(i)+""+count;
                count = 0;
            }


        }

        System.out.println(res);

    }

}
