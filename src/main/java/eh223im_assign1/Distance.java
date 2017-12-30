package backup.eh223im_assign1;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        double distance, x1, x2, y1, y2;
        Scanner scan = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("#.###");
        df.setRoundingMode(RoundingMode.HALF_UP);

        System.out.print("Enter x1: ");
        x1 = scan.nextDouble();
        System.out.print("Enter y1: ");
        y1 = scan.nextDouble();
        System.out.print("Enter x2: ");
        x2 = scan.nextDouble();
        System.out.print("Enter y2: ");
        y2 = scan.nextDouble();

        distance = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));

        System.out.print("Distance: " + df.format(distance));
        scan.close();
    }
}
