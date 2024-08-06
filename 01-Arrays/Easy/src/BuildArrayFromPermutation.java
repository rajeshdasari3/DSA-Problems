import java.util.Arrays;

public class BuildArrayFromPermutation {
    private static int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildArray(nums)));
    }
}


/*
Constraints:
-------------
1 <= nums.length <= 1000
0 <= nums[i] < nums.length
The elements in nums are distinct.
 */