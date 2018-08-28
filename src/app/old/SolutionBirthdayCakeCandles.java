package app.old;

public class SolutionBirthdayCakeCandles {


    static int birthdayCakeCandles(int n, int[] ar) {

        int max = 0;
        int count = 0;

        for(int i = 0;i<ar.length;i++) {
            if(ar[i] > max) {
                count = 0;
                max = ar[i];

            }
            if(ar[i] == max){
                count++;
            }
        }



        return count;
    }


    public static void main(String[] args) {

        int n = 4;
        int[] ar = new int[] {3, 2, 1, 3};

        System.out.println(birthdayCakeCandles(n, ar));
    }


}
