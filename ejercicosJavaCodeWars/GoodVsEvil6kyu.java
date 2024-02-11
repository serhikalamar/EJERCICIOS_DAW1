public class GoodVsEvil {
    public static String battle(String good, String evil) {
        int[] goodValues = {1, 2, 3, 3, 4, 10};
        int[] evilValues = {1, 2, 2, 2, 3, 5, 10};

        int goodSum = calculateSum(good, goodValues);
        int evilSum = calculateSum(evil, evilValues);

        if (goodSum > evilSum) {
            return "Battle Result: Good triumphs over Evil";
        } else if (evilSum > goodSum) {
            return "Battle Result: Evil eradicates all trace of Good";
        } else {
            return "Battle Result: No victor on this battle field";
        }
    }

    private static int calculateSum(String counts, int[] values) {
        String[] countsArray = counts.split(" ");
        int sum = 0;

        for (int i = 0; i < countsArray.length; i++) {
            sum += Integer.parseInt(countsArray[i]) * values[i];
        }

        return sum;
    }
}