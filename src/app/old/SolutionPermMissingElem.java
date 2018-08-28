package app.old;

public class SolutionPermMissingElem {


    public int solution(int[] A) {

        int rem = 0;
        int sum = 0;
        for (int i = 1; i <= A.length; i++) {
            sum += i;
            rem += A[i - 1];
            System.out.println(i+" "+A[i - 1]+"      "+sum+" "+rem);
        }
        return (sum+A.length+1) - rem;
    }


    public static void main(String[] args) {

        int[] A = new int[6];

        A[0] = 2;
        A[1] = 3;
        A[2] = 1;
        A[3] = 5;
        A[4] = 4;
        A[5] = 7;






        SolutionPermMissingElem solutionPermMissingElem = new SolutionPermMissingElem();
        System.out.println(solutionPermMissingElem.solution(A));


    }


}
