package app.old;

public class SolutionPassingCars {

    public int solution(int[] A) {

        int countOfZeros = 0;
        int count = 0;

        for (int i = 0; i < A.length; i++){
            if (A[i] == 0) {
                countOfZeros++;
            }
            if (A[i] == 1) {
                count += countOfZeros;
            }

            if (count > 1000000000)
                return -1;
        }
        return count;
    }


    public static void main(String[] args) {

        int[] A = new int[7];

        A[0] = 0;
        A[1] = 1;
        A[2] = 0;
        A[3] = 1;
        A[4] = 1;
        A[5] = 1;
        A[6] = 1;

        SolutionPassingCars solutionPassingCars = new SolutionPassingCars();
        System.out.println(solutionPassingCars.solution(A));

    }
}
