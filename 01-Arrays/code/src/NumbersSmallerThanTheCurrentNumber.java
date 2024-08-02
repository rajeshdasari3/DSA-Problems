import java.util.Arrays;

public class NumbersSmallerThanTheCurrentNumber {
    private static int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;

        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int num: nums) {
                count += (num < nums[i])? 1: 0;
            }
            ans[i] = count;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};

        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
}

/*
Constraints:
------------
2 <= nums.length <= 500
0 <= nums[i] <= 100
 */