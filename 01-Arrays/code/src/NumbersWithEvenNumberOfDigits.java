public class NumbersWithEvenNumberOfDigits {
    private static int findNumbers(int[] nums) {
        int evenCount = 0;
        for (int num: nums) {
            String temp = String.valueOf(num);
            if (temp.length() % 2 == 0) evenCount++;
        }
        return evenCount;
    }

    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};

        System.out.println(findNumbers(nums));
    }
}

/*
Constraints:
----------
1 <= nums.length <= 500
1 <= nums[i] <= 105
 */