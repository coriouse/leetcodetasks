package app.old;

import java.util.Arrays;

public class SolutionCountOccure {


    public int[] solution(int[] A) {

        int[] count = new int[A.length+1];
        for(int i = 0;i<A.length;i++) {
                count[A[i]] += 1;
        }


        return count;

    }


    public static void main(String[] args) {

        int[] A = {2,2,3,4,3,5,7,5,4};

        SolutionCountOccure solutionCountOccure = new SolutionCountOccure();
        System.out.println(Arrays.toString(solutionCountOccure.solution(A)));

    }



}
