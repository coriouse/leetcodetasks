package app.old;


import java.util.Arrays;

public class SolutionTriangle {
    public int solution(int[] A) {

        if(A.length == 1)
            return 1;

        Arrays.sort(A);
        int count = 0;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] != A[i + 1]) {
                count++;
            }
            if (i + 1 == A.length - 1) {
                if (A[A.length - 1] != A[i])
                    count++;
            }
        }
        return count;

    }


    public static void main(String[] args) {

        int[] A = new int[3];

        A[0] = 1;
        A[1] = 1;
        A[2] = 1;
/*        A[2] = 1;
        A[3] = 2;
        A[4] = 3;
        A[5] = 1;

        A[6] = 4;*/
        SolutionTriangle solutionTriangle = new SolutionTriangle();
        System.out.println(solutionTriangle.solution(A));


    }
}
