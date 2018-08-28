package app.old;

import java.util.Arrays;

public class SolutionGradingStudents {


    static int[] solve(int[] grade) {
return null;
    }

    public static void main(String[] args) {

        int[] ar = {73, 67, 38, 33};

        int fault = 40;

        for(int i = 0;i<ar.length;i++) {
            int tmp = ar[i];

            int remined = ar[i] % 5;
            if( remined == 0) {
                continue;
            } else {
                int l = 5 - remined;
                int a = (tmp + l) - tmp;

                if(tmp < fault) {
                    if ((fault - tmp) < 3) {
                        ar[i] = fault;
                    } else {
                        continue;
                    }

                } else {
                    if (a < 3) {
                        ar[i] = (tmp + l);
                    } else if (a == 3) {
                        continue;
                    }
                }


            }
          //  System.out.println(ar[i] % 5);
        }

        System.out.println(Arrays.toString(ar));


    }
}
