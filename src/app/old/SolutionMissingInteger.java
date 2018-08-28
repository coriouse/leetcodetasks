package app.old;

public class SolutionMissingInteger {

    public int solution(int[] A) {
        int len = A.length;
        int max = 1;
        int[] store = new int[len + 1];


        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0 && A[i] <= len) {
                store[A[i]] += 1;
            }

            if (A[i] > max) {
                max = A[i];
            }
        }

        for (int i = 1; i < store.length; i++) {
            if (store[i] == 0) {
                return i;
            }
        }

        return (max+1);
    }


    public static void main(String[] args) {

      // int[] A = {1, 3, 6, 4, 1, 2, -4, -1, 1000};

       int[] A = { 1008, 1003, 1002, 1001, 1000};

        SolutionMissingInteger solutionMissingInteger = new SolutionMissingInteger();
        System.out.println(solutionMissingInteger.solution(A));


    }
}
