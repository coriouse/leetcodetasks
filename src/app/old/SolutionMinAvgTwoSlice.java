package app.old;

public class SolutionMinAvgTwoSlice {



    public int solution(int[] A) {

        int[] arr = new int[A.length+1];

        for(int i=1;i<arr.length;i++) {

            arr[i] = arr[i-1] + A[i-1];

        }


        return 1;

    }

    public static void main(String[] args) {

        int[] A = new int[7];

        A[0] = 4;
        A[1] = 2;
        A[2] = 2;
        A[3] = 5;
        A[4] = 1;
        A[5] = 5;
        A[6] = 8;

        SolutionMinAvgTwoSlice solutionMinAvgTwoSlice = new SolutionMinAvgTwoSlice();
        System.out.println(solutionMinAvgTwoSlice.solution(A));


    }
}
