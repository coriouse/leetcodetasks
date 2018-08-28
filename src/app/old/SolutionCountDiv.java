package app.old;

public class SolutionCountDiv {


    public int solution(int A, int B, int K) {

        int sum = 0;

        for (int i = A; i <= B; i++) {
            if ((i % K) == 0) {
                sum++;
            }
        }
        //right decision
        //return  B / K - A / K + (A % K == 0 ? 1 : 0);
        return sum;
    }

    public static void main(String[] args) {

        int A = 6;
        int B = 11;
        int K = 2;

        SolutionCountDiv solutionCountDiv = new SolutionCountDiv();
        System.out.println(solutionCountDiv.solution(A, B, K));

    }
}
