package app.old;

public class CompressString {

    public static void main(String[] args) {

    String t1 = "a"; //1a
    String t2 = "aa"; //2a
    String t3 = "aaadddbffhjjjj"; //3a3d1bff2h14j

    CompressString cs = new CompressString();
        System.out.println(cs.compress(t3));



    }



    public String compress(String in) {

        if(in.length() == 1) {
            return "1"+in;
        }

        int count = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<in.length();i++) {

            if(in.charAt(i) == in.charAt(i+1) && i<in.length()) {
                count++;
            } else {

                sb.append(count).append(in.charAt(i));
                count = 0;
            }

        }

        return sb.toString();

    }
}
