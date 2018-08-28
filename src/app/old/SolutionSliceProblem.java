package app.old;

public class SolutionSliceProblem {

    public int solution(int[] A) {

        for(int p = 0;p<A.length;p++) {
            for(int q = p;q<A.length;q++) {
                for(int i = p;i<q+1;i++) {
                    System.out.print("A[i]="+A[i]+",");
                }
                System.out.println();
            }
        }

        return 0;
    }

    public static void main(String[] args) {

        int[] A = new int[7];
        A[0] = 5;
        A[1]=-7;
        A[2]=3;
        A[3]=5;
        A[4]=-2;
        A[5]=4;
        A[6]=-1;

        SolutionSliceProblem solutionSliceProblem = new SolutionSliceProblem();
        solutionSliceProblem.solution(A);

    }

/*
    def slow_max_slice(A):
    n = len(A)
    result = 0
    for p in xrange(n):
        for q in xrange(p, n):
             sum = 0
             for i in xrange(p, q + 1):
                 sum += A[i]
                 result = max(result, sum)
    return result

*/


}
