public class MaximumPopulationYear {
    private static int maximumPopulation(int[][] logs) {
        int start = 2049;
        int end = 1950;

        // find the first and last years of the log
        for (int[] log: logs) {
            if (log[0] < start) start = log[0];
            if (log[1] > end) end = log[1];
        }

        int maxPopulation = 0;
        int ans = start;

        // traverse from the first to the last year of the survey
        for (int year = start; year < end; year++){
            int population = 0;
            // for each log check whether the current year is present in the logs
            for (int[] log: logs) {
                if (year >= log[0] && year < log[1]) {
                    population++;
                }
            }
            if (population > maxPopulation) {
                ans = year;
                maxPopulation = population;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] logs = {{1950,1961},{1960,1971},{1970,1981}};

        System.out.println(maximumPopulation(logs));
    }
}

/*
Constraints:
--------------
1 <= logs.length <= 100
1950 <= birthi < deathi <= 2050
 */