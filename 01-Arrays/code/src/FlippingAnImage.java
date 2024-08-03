import java.util.Arrays;

public class FlippingAnImage {

    // flips the image horizontally, then invert it, and returns the resulting image.
    private static int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;

        for (int[] row: image) {
            for(int i = 0; i < (n + 1)/2; i++){
                int temp = row[i];
                row[i] = row[n - 1 - i] ^ 1;
                row[n - 1 - i] = temp ^ 1;
            }
        }
        return image;
    }

    public static void main(String[] args) {
        int[][] image = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};

        System.out.println(Arrays.deepToString(flipAndInvertImage(image)));
    }
}

/*
Constraints:
------------
n == image.length
n == image[i].length
1 <= n <= 20
images[i][j] is either 0 or 1.
 */