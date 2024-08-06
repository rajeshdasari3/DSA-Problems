
public class RicheshCustomerWealth {

    // returns the wealth that the richest customer has.
    private static int maximumWealth(int[][] accounts) {
        int maxi = 0, n = accounts[0].length;
        for (int[] account: accounts) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += account[i];
            }
            maxi = Math.max(maxi, sum);
        }
        return maxi;
    }

    public static void main(String[] args) {
        int[][] accounts = {
                {1, 5},
                {7, 3},
                {3, 5}
        };

        System.out.println(maximumWealth(accounts));
    }
}

/*
Constraints:
-------------
m == accounts.length
n == accounts[i].length
1 <= m, n <= 50
1 <= accounts[i][j] <= 100
 */