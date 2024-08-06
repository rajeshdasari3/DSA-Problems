import java.util.Arrays;

public class FindNUniqueIntegersSumUpToZero {
    private static int[] sumZero(int n) {
        int[] ans = new int[n];
        int idx = 0;

        while (n >= 1) {
            if (n == 1) {
                ans[idx++] = 0;
                n--;
            } else{
                ans[idx++] = -n;
                ans[idx++] = n;
                n -= 2;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(sumZero(n)));
    }
}

/*
Constraints:
------------
1 <= n <= 1000
 */