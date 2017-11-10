package eh223im_assign1;

import java.text.DecimalFormat;
import java.util.Scanner;

import static java.math.RoundingMode.HALF_UP;

public class Convert {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter degree in F: ");
        double f = scan.nextDouble();

        DecimalFormat df = new DecimalFormat("#.#");
        df.setRoundingMode(HALF_UP);

        double c = ((f - 32) / 9 * 5); // Conversion
        System.out.print("Degree in C: " + df.format(c));
        scan.close();
    }
}
