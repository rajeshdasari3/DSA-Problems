import java.util.List;
import java.util.ArrayList;

public class AddToArrayFormOfInteger {
    private static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        int idx = num.length - 1;

        while (idx >= 0 || k != 0) {
            // check for the validity of idx
            if (idx >= 0) {
                k += num[idx];
            }
            ans.addFirst(k % 10);
            k /= 10;
            idx--;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] num = {0};
        int k = 1000;

        System.out.println(addToArrayForm(num, k));
    }
}

/*
Constraints:
------------
1 <= num.length <= 104
0 <= num[i] <= 9
num does not contain any leading zeros except for the zero itself.
1 <= k <= 104
 */