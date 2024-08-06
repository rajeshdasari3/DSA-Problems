public class RemoveDuplicatesFromSortedArray {
    private static int removeDuplicates(int[] nums) {
        // start from index 1
        // as there is only one number duplicate is not possible
        int idx = 1;

        for (int i = 1; i < nums.length; i++) {
            // if the current and previous number is not same
            // it is not a duplicate
            if (nums[i] != nums[i - 1]) {
                nums[idx] = nums[i];
                idx++;
            }
        }

        return idx;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        int n = removeDuplicates(nums);

        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

/*
Constraints:
------------
1 <= nums.length <= 3 * 104
-100 <= nums[i] <= 100
nums is sorted in non-decreasing order.
 */