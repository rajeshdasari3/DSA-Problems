import java.util.Arrays;
import java.util.ArrayList;

public class CreateTargetArrayInTheGivenOrder {

    private static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            temp.add(index[i], nums[i]);
        }

        // ArrayList to Array
        int[] target = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            target[i] = temp.get(i);
        }
        return target;
    }

    
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }
}

/*
Constraints:
-------------
1 <= nums.length, index.length <= 100
nums.length == index.length
0 <= nums[i] <= 100
0 <= index[i] <= i
 */