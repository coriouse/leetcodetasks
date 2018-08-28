package app.old;

import java.util.Arrays;

public class SolutionArrayShifting {


    public int[] solution(int[] A, int K) {
        for (int j = 0; j < K; j++) {
            shiftArrRight(A, A[A.length - 1]);
        }
        return A;
    }

    private static void shiftArrRight(int[] arr, int head) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];
            arr[i] = head;
            head = temp;
        }
    }


    public static void main(String[] args) {


        int[] A = {3, 8, 9, 7, 6};
        int K = 3;

        //[9, 7, 6, 3, 8]

        //int[] A = {0, 0, 0};
        //int K = 1;


        //int[] A = {1, 2, 3, 4};
        //int K = 4;

        SolutionArrayShifting solutionArrayShifting = new SolutionArrayShifting();
        System.out.println(Arrays.toString(solutionArrayShifting.solution(A, K)));


    }

}
