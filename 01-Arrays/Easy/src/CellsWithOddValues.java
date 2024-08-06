public class CellsWithOddValues {

    // return the number of odd-valued cells in the matrix
    // after applying the increment to all locations in indices.
    private static int oddCells(int m, int n, int[][] indices) {
        int[] rows = new int[m];
        int[] cols = new int[n];

        for (int[] indice: indices) {
            rows[indice[0]]++;
            cols[indice[1]]++;
        }

        int oddCount = 0;
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                int cellValue = rows[r] + cols[c];
                if (cellValue % 2 != 0) {
                    oddCount++;
                }
            }
        }
        return oddCount;
    }

    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        int[][] indices = {{0, 1}, {1, 1}};

        System.out.println(oddCells(m, n, indices));
    }
}

/*
Constraints:
------------
1 <= m, n <= 50
1 <= indices.length <= 100
0 <= ri < m
0 <= ci < n
 */