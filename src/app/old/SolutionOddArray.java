package app.old;

import java.util.Arrays;

public class SolutionOddArray {

    public int solution(int[] A) {

        Arrays.sort(A);

        int counter = 0;
        int num = 0;
        for(int i = 0;i<A.length;i++) {

            if(i == 0 && A[i] != A[i+1]) {
                num = A[i];
                break;
            }

            if(i == A.length && A[i] != A[i-1]){
                num = A[i];
                break;
            }

            if(A[i] == A[i+1]) {
                counter = 0;

            } else {
                counter++;

                if(counter == 2) {
                    num = A[i];
                    break;
                }
            }
        }

        return num;
    }


    public static void main(String[] args) {

        int[] A = new int[11];
        A[0] = 7;
        A[1] = 3;
        A[2] = 9;
        A[3] = 3;
        A[4] = 9;
        A[5] = 7;
        A[6] = 1;
        A[7] = 9;
        A[8] = 9;
        A[9] = 9;
        A[10] = 9;


        SolutionOddArray solutionOddArray = new SolutionOddArray();

        System.out.println(solutionOddArray.solution(A));



    }

}
