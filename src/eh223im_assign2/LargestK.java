package eh223im_assign2;

import java.util.Scanner;

public class LargestK {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Input
        System.out.print("Give a positive integer: ");
        int a = scan.nextInt();

        if (a <= 0) {
            System.out.println("This is not a positive integer");
            return;
        }

        int k = 0;
        int sumK = 0;
        while (sumK < a) {
            k = k + 1;
            sumK = sumK + 2 * k;
        }

        k = (k - 1) * 2; // Expecting one more sum before the check

        // Export
        System.out.print("The largest K such that 0+2+4+6+...+K < " + a + " => K = " + k);
        scan.close();
    }
}
