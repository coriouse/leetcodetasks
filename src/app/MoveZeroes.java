package app;

import java.util.Arrays;

/**
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * <p>
 * Example:
 * <p>
 * Input: [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * Note:
 * <p>
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 */
public class MoveZeroes {

    public static void main(String[] args) {

        //int[] nums = {0, 1, 0, 3, 12};

        int[] nums = {0, 0, 1};

        moveZeroes(nums);

        System.out.println(Arrays.toString(nums));


    }

    public static void moveZeroes(int[] nums) {

        int pos = 0;
        int i = 0;

        while (i < nums.length) {
            if (nums[i] != 0) {
                nums[pos] = nums[i];
                pos++;
            }
            i++;
        }

        while (pos < nums.length) {
            nums[pos] = 0;
            pos++;
        }

    }
}
