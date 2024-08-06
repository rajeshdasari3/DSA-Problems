import java.util.Arrays;

public class PlusOne {
    private static int[] plusOne(int[] digits) {
        int n = digits.length;
        int sum = 1;

        for (int i = n - 1; i >= 0; i--) {
            sum += digits[i];
            digits[i] = sum % 10;
            sum /= 10;
        }
        if (sum == 0) {
            return digits;
        }

        int[] ans = new int[n + 1];
        ans[0] = sum;
        System.arraycopy(digits, 0, ans, 1, n);
        return ans;
    }

    public static void main(String[] args) {
        int[] digits = {9, 9, 9, 9};

        System.out.println(Arrays.toString(plusOne(digits)));
    }
}

/*
Constraints:
------------
1 <= digits.length <= 100
0 <= digits[i] <= 9
digits does not contain any leading 0's.
 */