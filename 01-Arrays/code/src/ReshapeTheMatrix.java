import java.util.Arrays;

public class ReshapeTheMatrix {
    private static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        // return mat if reshape is not possible
        if (m * n != r * c) {
            return mat;
        }

        // create a 1D array
        int[] temp = new int[m * n];

        // load everything from mat to new 1D Array
        int idx = 0;
        for (int[] row : mat) {
            for (int j = 0; j < n; j++) {
                temp[idx] = row[j];
                idx++;
            }
        }

        // now create an array of desired rows and cols
        // enter the values from 1D array to this array in order
        int[][] ans = new int[r][c];
        idx = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans[i][j] = temp[idx++];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] mat = {{1, 2}, {3, 4}};
        int r = 1   ;
        int c = 4;

        System.out.println(Arrays.deepToString(matrixReshape(mat, r, c)));
    }
}

/*
Constraints:
------------
m == mat.length
n == mat[i].length
1 <= m, n <= 100
-1000 <= mat[i][j] <= 1000
1 <= r, c <= 300
 */