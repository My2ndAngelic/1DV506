package backup.eh223im_assign1;

import java.util.Random;

public class TelephoneNumber {
    public static void main(String[] args) {
        Random random = new Random();

        int min;
        int max;
        int r;
        String x = "", y = "", z = "";
        // First set the right bound by (max - min + 1), then add the minimum to shift the left bound
        min = 0;
        max = 9;
        r = random.nextInt((max - min) + 1) + min;
        x = x + r;
        r = random.nextInt((max - min) + 1) + min;
        x = x + r;
        r = random.nextInt((max - min) + 1) + min;
        x = x + r;


        min = 1;
        max = 9;
        r = random.nextInt((max - min) + 1) + min;
        z = z + r;

        min = 0;
        max = 9;
        r = random.nextInt((max - min) + 1) + min;
        y = y + r;
        r = random.nextInt((max - min) + 1) + min;
        y = y + r;
        r = random.nextInt((max - min) + 1) + min;
        y = y + r;
        r = random.nextInt((max - min) + 1) + min;
        y = y + r;
        r = random.nextInt((max - min) + 1) + min;
        y = y + r;

        System.out.println("0" + x + "-" + z + y);
    }
}

// Adopted from: https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java