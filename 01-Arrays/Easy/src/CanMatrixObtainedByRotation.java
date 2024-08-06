import java.util.Arrays;

public class CanMatrixObtainedByRotation {
    private static boolean findRotation(int[][] mat, int[][] target) {

        // return true if the mat == target otherwise
        // rotate the matrix 90 degrees and check
        // we will have to rotate the mat 4 times 0, 90, 180, 270 degrees
        for (int i = 0; i < 4; i++) {
            if (Arrays.deepEquals(mat, target)) {
                return true;
            }
            mat = rotate90Degrees(mat);
        }
        return false;  // match not found
    }

    private static int[][] rotate90Degrees(int[][] mat) {
        int n = mat.length;
        int[][] ans = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = mat[n - 1 - j][i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] mat = {{0, 1}, {1, 0}};
        int[][] target = {{1, 0}, {0, 1}};

        System.out.println(findRotation(mat, target));
    }
}

/*
Constraints:
-----------
n == mat.length == target.length
n == mat[i].length == target[i].length
1 <= n <= 10
mat[i][j] and target[i][j] are either 0 or 1.
 */