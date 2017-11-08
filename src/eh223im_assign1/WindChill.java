package eh223im_assign1;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        double Twc, T, V;

        Scanner scan = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("#.#");
        df.setRoundingMode(RoundingMode.HALF_UP);

        System.out.print("Temperature (C): ");
        T = scan.nextDouble();
        System.out.print("Wind speed (m/s): ");
        V = scan.nextDouble() * 3.6;

        Twc = 13.12 + 0.6215 * T - 11.37 * Math.pow(V, 0.16) + 0.3965 * T * Math.pow(V, 0.16);
        System.out.print("Wind Chill Temperature (C): " + df.format(Twc));

        scan.close();
    }
}
