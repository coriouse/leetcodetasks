package app.old;

public class SolutionFrogRiverOne {

    public int solution (int X, int[] A){

        int[]counter = new int[X+1];
        int size = 0;

        for (int i=0; i<A.length; i++){
            if (counter[A[i]] == 0){
                counter[A[i]] = A[i];
                size += 1;
                if (size == X){
                    return i;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
       int[] A = new int[8];

        A[0] = 1;
        A[1] = 3;
        A[2] = 1;
        A[3] = 4;
        A[4] = 2;
        A[5] = 3;
        A[6] = 5;
        A[7] = 4;

        SolutionFrogRiverOne solutionFrogRiverOne = new SolutionFrogRiverOne();
        System.out.println(solutionFrogRiverOne.solution(5, A));


    }


}
