public class MatrixDiagonalSum {

    // returns the sum of the matrix diagonals
    private static int diagonalSum(int[][] mat) {
        int m = mat.length;
        int dSum = 0;
        for (int i = 0; i < m; i++) {
            dSum += mat[i][i];
            if (i != m - 1 - i) {
                dSum += mat[i][m - 1 - i];
            }
        }
        return dSum;
    }

    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println(diagonalSum(mat));
    }
}

/*
Constraints:
------------
n == mat.length == mat[i].length
1 <= n <= 100
1 <= mat[i][j] <= 100
 */