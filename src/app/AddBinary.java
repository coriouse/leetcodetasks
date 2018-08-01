package app;

/**
 * Given two binary strings, return their sum (also a binary string).
 * <p>
 * The input strings are both non-empty and contains only characters 1 or 0.
 * <p>
 * Example 1:
 * <p>
 * Input: a = "11", b = "1"
 * Output: "100"
 * Example 2:
 * <p>
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 */
public class AddBinary {


    public static void main(String[] args) {

        String a = "1010", b = "1011";
        System.out.println(addBinary(a, b));
        /*int sum = Integer.parseInt(a, 2) + Integer.parseInt(b, 2);
        System.out.println(Integer.toBinaryString(sum));*/
    }


    public static String addBinary(String a, String b) {

        StringBuilder sb = new StringBuilder();
        int maxLength = Math.max(a.length(), b.length());
        int carry = 0;

        for (int i = 0; i < maxLength; i++) {
            int a1 = 0;
            int b1 = 0;
            if (a.length() > i) {
                a1 = a.charAt(a.length() - i - 1) == '0' ? 0 : 1;
            }

            if (b.length() > i) {
                b1 = b.charAt(b.length() - i - 1) == '0' ? 0 : 1;
            }

            int sum = a1 + b1 + carry;

            sb.append(sum % 2);

            carry = sum / 2;


        }

        if (carry == 1) {
            sb.append("1");
        }

        return sb.reverse().toString();
    }


}
