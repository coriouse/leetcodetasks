package app.old;

public class SolutionTapeEquilibrium {


    public int solution(int[] A) {

        int[] arrp = new int[A.length-1];

        int sum1 = 0;
        int sum2 = 0;

        int min = 0;

        for(int i = A.length-1;i> 0;i--) {
            sum2 += A[i];
            arrp[i-1] = sum2;
        }

        for(int i = 0;i<A.length-1;i++) {
            sum1 += A[i];
            int diff = Math.abs(sum1 - arrp[i]);
            if(i == 0)
                min = diff;

            if(min > diff) {
                min = diff;
            }
        }
        return min;
    }


    public static void main(String[] args) {

        int[] A = new int[6];
            A[0] = 3;
            A[1] = 2;
            A[2] = 2;
            A[3] = 4;
            A[4] = 3;
            A[5] = 5;

        SolutionTapeEquilibrium solutionTapeEquilibrium = new SolutionTapeEquilibrium();
        System.out.println(solutionTapeEquilibrium.solution(A));

    }




}
