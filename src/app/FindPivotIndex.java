package app;

/**
 *
 */
public class FindPivotIndex {

    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        //  int[] nums = {-1, -1, -1, 0, 1, 1};
        //int[] nums = {1, 2, 3};
        // assert 3 == getPivot(nums);
        System.out.println(getPivot(nums));

    }

    public static int getPivot(int[] nums) {
        int total = 0, sum = 0;
        for (int j = 0; j < nums.length; j++) {
            total += nums[j];
        }
        for (int i = 0; i < nums.length; i++) {
            if(i>0) {
                sum += nums[i-1];
            }
            if (sum * 2 == total - nums[i]) {
                return i;
            }
        }
        return -1;
    }

}




