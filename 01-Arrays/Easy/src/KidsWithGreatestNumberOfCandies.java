import java.util.List;
import java.util.ArrayList;

public class KidsWithGreatestNumberOfCandies {
    // returns a boolean array result of length n,
    // where result[i] is true if, after giving the ith kid all the extraCandies,
    // they will have the greatest number of candies among all the kids, or false otherwise.
    private static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxi = 0;
        for (int currCandies: candies) {
            maxi = Math.max(maxi, currCandies);
        }

        List<Boolean> ans = new ArrayList<>();
        for (int candy : candies) {
            ans.add(candy + extraCandies >= maxi);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;

        System.out.println(kidsWithCandies(candies, extraCandies));
    }
}

/*
Constraints:
-------------
n == candies.length
2 <= n <= 100
1 <= candies[i] <= 100
1 <= extraCandies <= 50
 */