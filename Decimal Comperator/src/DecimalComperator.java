public class DecimalComperator {
    public static boolean areEqualByThreeDecimalPlaces (double x, double y) {
        x *= 1000;
        y *= 1000;

        if ((int) x == (int) y) {
            return true;
        } return false;

    }
}
