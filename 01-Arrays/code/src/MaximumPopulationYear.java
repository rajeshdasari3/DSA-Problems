public class MaximumPopulationYear {
    private static int maximumPopulation(int[][] logs) {

        // create a map using array
        // to hold years from 1950 to 2050(inclusive)
        int[] population = new int[101];

        for (int[] log: logs) {
            int birth = log[0];
            int death = log[1];
            population[birth - 1950]++;
            population[death - 1950]--;
        }

        int maxPopulation = 0, currPopulation = 0, year = 1950;
        for (int i = 0; i < 101; i++) {
            currPopulation += population[i];
            if (currPopulation > maxPopulation) {
                maxPopulation = currPopulation;
                year = 1950 + i;
            }
        }
        return year;
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