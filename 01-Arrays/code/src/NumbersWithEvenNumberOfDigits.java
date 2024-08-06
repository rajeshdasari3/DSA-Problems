public class NumbersWithEvenNumberOfDigits {
    private static int findNumbers(int[] nums) {
        int evenCount = 0;
        for (int num: nums) {
            int temp = num;
            int count = 0;
            while (temp != 0) {
                temp /= 10;
                count++;
            }
            if (count % 2 == 0) evenCount++;
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