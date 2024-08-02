public class NumberOfGoodPairs {
    // Given an array of integers nums, return the number of good pairs.
    //A pair (i, j) is called good if nums[i] == nums[j] and i < j.
    private static int numIdenticalPairs(int[] nums) {
        int n = nums.length, count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 3};

        System.out.println(numIdenticalPairs(nums));
    }
}

/*
Constraints:
-------------
1 <= nums.length <= 100
1 <= nums[i] <= 100
 */