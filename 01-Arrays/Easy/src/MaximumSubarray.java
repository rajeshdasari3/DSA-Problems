public class MaximumSubarray {
    private static int maxSubArray(int[] nums) {
        int largestSum = nums[0];
        int currSum = 0;

        for (int num: nums) {
            currSum += num;

            if (currSum > largestSum) {
                largestSum = currSum;
            }

            if (currSum <= 0) {
                currSum = 0;
            }
        }

        return largestSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(maxSubArray(nums));
    }
}

/*
Constraints:
------------
1 <= nums.length <= 105
-104 <= nums[i] <= 104
 */