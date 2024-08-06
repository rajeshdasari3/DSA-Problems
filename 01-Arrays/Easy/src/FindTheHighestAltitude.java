public class FindTheHighestAltitude {

    // returns the highest altitude of a point
    private static int largestAltitude(int[] gain) {
        int max = 0, altitude = 0;

        for (int i = 0; i < gain.length; i++) {
            altitude += gain[i];
            max = Math.max(altitude, max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};

        System.out.println(largestAltitude(gain));
    }
}

/*
Constraints:
-------------
n == gain.length
1 <= n <= 100
-100 <= gain[i] <= 100
 */