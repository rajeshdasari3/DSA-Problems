import java.util.ArrayList;
import java.util.List;

public class LuckyNumberInAMatrix {
    private static List<Integer> luckyNumbers (int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] row = new int[m];
        int[] col = new int[n];

        for (int i = 0; i < m; i++) {
            int mini = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                // update the max in every column
                col[j] = Math.max(col[j], matrix[i][j]);

                // find the minimum in entire row
                mini = Math.min(mini, matrix[i][j]);
            }
            // update the minimum in current row
            row[i] = mini;
        }

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // check if the current number is both in row[] and col[]
                // means current number is both minimum in row and maximum in col
                if (row[i] == col[j]) {
                    ans.add(row[i]); // add the lucky number to ans
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] matrix = {{7, 8}, {1, 2}};

        System.out.println(luckyNumbers(matrix));
    }
}

/*
Constraints:
-------------
m == mat.length
n == mat[i].length
1 <= n, m <= 50
1 <= matrix[i][j] <= 105.
All elements in the matrix are distinct.
 */