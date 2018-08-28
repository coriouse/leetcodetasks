package app.cci;


public class UnicChars {
    public static void main(String[] args) {


        //char[] arr = {'a', 'r', 'k', 'a', 'f', 'p'};
        char[] arr = {'a', 'r', 'k', 'f', 'p'};

        System.out.println(isUnic(arr));

    }


    public static boolean isUnic(char[] arr) {
        boolean[] status = new boolean[256];

        for (int i = 0; i < arr.length; i++) {

            if (status[arr[i]] == true) {
                return false;
            }
            status[arr[i]] = true;
        }
        return true;
    }
}
