import java.util.Arrays;

public class RunningSumOf1DArray {

    // return the running sum of nums
    private static int[] runningSum(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
}

/*
Constraints:
------------
1 <= nums.length <= 1000
-10^6 <= nums[i] <= 10^6
 */
