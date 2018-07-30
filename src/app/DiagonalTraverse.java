package app;

import java.util.Arrays;

/**
 *
 * Given a matrix of M x N elements (M rows, N columns), return all elements of the matrix in diagonal order as shown in the below image.
 * Output:  [1,2,4,7,5,3,6,8,9]
 *
 * https://leetcode.com/problems/diagonal-traverse/description/
 *
 */
public class DiagonalTraverse {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(Arrays.toString(findDiagonalOrder(matrix)));
    }


    public static int[] findDiagonalOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new int[0];
        }

        int m = matrix.length;
        int n = matrix[0].length;


        int[] result = new int[m * n];
        int row = 0, col = 0;
        int d = 1;

        for (int i = 0; i < m * n; i++) {
            result[i] = matrix[row][col];
            row -= d;
            col += d;

            if (row >= m) {
                row = m - 1;
                col += 2;
                d = -d;
            }
            if (col >= n) {
                col = n - 1;
                row += 2;
                d = -d;
            }
            if (row < 0) {
                row = 0;
                d = -d;
            }
            if (col < 0) {
                col = 0;
                d = -d;
            }
        }

        return result;
    }
}
