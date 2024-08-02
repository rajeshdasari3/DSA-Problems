import java.util.Arrays;

public class ConcatenationOfArray {
    private static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int [] ans = new int[2 * n];

        for (int i = 0; i < 2 * n; i++) {
            ans[i] = nums[i % n];
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
}

/*
Constraints:
------------
n == nums.length
1 <= n <= 1000
1 <= nums[i] <= 1000
 */