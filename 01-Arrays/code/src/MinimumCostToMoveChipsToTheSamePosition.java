public class MinimumCostToMoveChipsToTheSamePosition {
    private static int minCostToMoveChips(int[] position) {
        int oddCount = 0;
        int evenCount = 0;

        for (int p: position) {
            // we can move all coins at all odd positions into a single position without any cost
            // also same for coins at all even positions
            if (p % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        // now we have our coins at a two positions
        // move coins from position with fewer coins
        return Math.min(oddCount, evenCount);
    }

    public static void main(String[] args) {
        int[] position = {2,2,2,3,3};

        System.out.println(minCostToMoveChips(position));
    }
}

/*
Constraints:
------------
1 <= position.length <= 100
1 <= position[i] <= 10^9
 */