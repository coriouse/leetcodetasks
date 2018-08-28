package app.old;

public class SolutionDominator {


    public int solution(int[] A) {


        int val = 0;
        int counter = 0;
        for(int i = 0;i<A.length;i++) {
            if(counter == 0) {
                val = A[i];
                counter++;
            } else if(val != A[i]){
                counter--;
            } else {
                counter++;
            }
        }

        int candidate = -1;
        if(counter > 0){
            candidate = val;
        } else if(counter == 0) {
            return -1;
        }



        int c = 0, leader = -1, indexCandidate = -1, index = -1;
        for(int j = 0;j<A.length;j++) {
            if(candidate == A[j]) {
                indexCandidate = j;
                c++;
            }
        }

        if(c > A.length/2) {
            index = indexCandidate;
            leader = candidate;
        }
        return index;
    }


    public static void main(String[] args) {
        int[] A = new int[8];
  /*      A[0] = 3;
        A[1] = 4;
        A[2] = 3;
        A[3] = 2;
        A[4] = 3;
        A[5] = -1;
        A[6] = 3;
        A[7] = 3; */

        A[0] = 4;
        A[1] = 4;
        A[2] = 2;
        A[3] = 2;
        A[4] = 2;
        A[5] = -1;
        A[6] = 3;
        A[7] = 3;



        SolutionDominator solutionDominator = new SolutionDominator();
        System.out.println(solutionDominator.solution(A));

    }


}

