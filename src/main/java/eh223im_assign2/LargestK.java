package backup.eh223im_assign2;

import java.util.Scanner;

public class LargestK {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Input
        System.out.print("Give a positive integer: ");
        int a = scan.nextInt();

        if (a <= 0) {
            System.err.println("This is not a positive integer");
            System.exit(-1);
        }

        // Add number
        int k = 0;
        int sumK = 0;
        while (sumK < a) {
            k = k + 1;
            sumK = sumK + 2 * k;
        }

        // Expecting one more sum before the check
        k = (k - 1) * 2;

        // Export
        System.out.print("The largest K such that 0+2+4+6+...+K < " + a + " => K = " + k);
        scan.close();
    }
}
