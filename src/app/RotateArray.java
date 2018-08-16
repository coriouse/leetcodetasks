package app;

import java.util.Arrays;

/**
 *
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 *
 * Example 1:
 *
 * Input: [1,2,3,4,5,6,7] and k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 * Example 2:
 *
 * Input: [-1,-100,3,99] and k = 2
 * Output: [3,99,-1,-100]
 * Explanation:
 * rotate 1 steps to the right: [99,-1,-100,3]
 * rotate 2 steps to the right: [3,99,-1,-100]
 * Note:
 *
 * Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
 * Could you do it in-place with O(1) extra space?
 *
 * https://leetcode.com/problems/rotate-array/solution/
 *
 */
public class RotateArray {


    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7};
        int  k = 3;
     //   System.out.println(Arrays.toString(nums));
        rotate(nums, k);
      //  System.out.println(Arrays.toString(nums));
    }


    public static void rotate(int[] nums, int k) {
        int len = nums.length;
        /*while(k>0) {
            int last = nums[len-1];
            for(int i = 1;i<len;i++) {
                nums[len-i] = nums[len-i-1];
            }
            nums[0] = last;
            --k;
        }*/

for(int i = 0;i<nums.length;i++) {
    System.out.println("((i + k) % nums.length)=("+i+")"+((i + k) % nums.length));
}
    }

}
