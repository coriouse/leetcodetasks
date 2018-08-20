package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.
 *
 * Note that the row index starts from 0.
 *
 *
 * In Pascal's triangle, each number is the sum of the two numbers directly above it.
 *
 * Example:
 *
 * Input: 3
 * Output: [1,3,3,1]
 * Follow up:
 *
 * Could you optimize your algorithm to use only O(k) extra space?
 *
 */
public class PascalsTriangleII {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(getRow(3).toArray()));
    }


    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        // Second base case; first row is always [1].
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);
        // First base case; if user requests zero rows, they get zero rows.
        if (rowIndex == 0) {
            return triangle.get(0);
        }



        for (int rowNum = 1; rowNum < rowIndex+1; rowNum++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(rowNum-1);

            // The first row element is always 1.
            row.add(1);

            // Each triangle element (other than the first and last of each row)
            // is equal to the sum of the elements above-and-to-the-left and
            // above-and-to-the-right.
            for (int j = 1; j < rowNum; j++) {
                row.add(prevRow.get(j-1) + prevRow.get(j));
            }

            // The last row element is always 1.
            row.add(1);

            triangle.add(row);
        }

        return triangle.get(rowIndex);
    }


}
