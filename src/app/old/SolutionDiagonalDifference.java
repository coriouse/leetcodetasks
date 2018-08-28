package app.old;

public class SolutionDiagonalDifference {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 0},
        };
        int rDiagonal = 0;
        int lDiagonal = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    rDiagonal += matrix[i][j];
                    // System.out.print(matrix[i][j]+" ,");
                } else {
//                   System.out.print(" ,");
                }

                if (i == ((matrix[0].length - 1) - (matrix[0].length - 1 - j))) {
                    //System.out.print("(["+i+"] == ["+((matrix[0].length-1) - (matrix[0].length - 1 - i))+"]) ,");
                    System.out.print(matrix[i][matrix[0].length - 1 - j] + " ,");
                    lDiagonal += matrix[i][matrix[0].length - 1 - j];
                } else {
                    //System.out.print(" ,");
                }
            }

            System.out.println();
        }
//        return Math.abs(rDiagonal) - Math.abs(lDiagonal);

    }
}
