package app.old;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SolutionPermCheck {



    public int solution(int[] A) {

        Arrays.sort(A);
        int min = A[0];
        int max = A[A.length-1];

        Map<Integer, Integer> counter = new HashMap<>();

        for(int i = min;i<=max;i++) {
            counter.put(i, 0);
        }

        for(int i = 0;i<=A.length-1;i++) {
            if(counter.get(A[i]) != null) {
                counter.put(A[i], 1);
            }
        }

        for(int i = min;i<=max;i++) {
            if(counter.get(A[i]) == 0)
                return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
//OK
        int[] A = new int[4];

       A[0] = 4;
        A[1] = 1;
        A[2] = 3;
        A[3] = 2;
//FAIL
    /*  A[0] = 4;
        A[1] = 1;
        A[2] = 3;*/

        SolutionPermCheck solutionPermCheck = new SolutionPermCheck();
        System.out.println(solutionPermCheck.solution(A));


    }
}
