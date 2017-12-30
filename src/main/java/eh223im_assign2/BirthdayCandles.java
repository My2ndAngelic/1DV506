package backup.eh223im_assign2;

public class BirthdayCandles {
    public static void main(String[] args) {
        // Initialize
        int age = 0;
        int candle = 0;
        int box = 0;
        int boxT = 0;

        // Count to 100
        for (age = 1; age < 101; age++) {
            while (candle < age) { // If lack candle, then add a box of 24
                box++;
                boxT++;
                candle = candle + 24;
            }

            if (box > 0) { // If bought, print
                System.out.println("Before " + age + " birthday, " + " buy " + box + " box(es)");
            }

            candle = candle - age; // Use all candles for ages
            box = 0; // Reset
        }

        // Export all data
        System.out.println("Total boxes: " + boxT + " Candles left: " + candle);
    }
}
