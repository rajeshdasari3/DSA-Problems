import java.util.Arrays;

public class ShuffleTheArray {

    // Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
    //Return the array in the form [x1,y1,x2,y2,...,xn,yn].
    private static int[] shuffle(int[] nums, int n) {

        int[] ans = new int[2 * n];

        int idx = 0;
        for (int i = 0; i < n; i++) {
            ans[idx] = nums[i];
            ans[idx + 1] = nums[n + i];
            idx += 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = nums.length / 2;
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }
}

/*
Constraints:
-------------
1 <= n <= 500
nums.length == 2n
1 <= nums[i] <= 10^3
 */