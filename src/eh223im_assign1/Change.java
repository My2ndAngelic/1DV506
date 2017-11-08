package eh223im_assign1;

import java.util.Scanner;

public class Change {
    public static void main(String args[]) {
        // Input scanner
        Scanner scan = new Scanner(System.in);

        // Scan for real number
        System.out.print("Price: ");
        double price = scan.nextDouble();
        System.out.print("Payment: ");
        int pay = scan.nextInt();

        int leftover = (int) Math.round(pay - price);  // Assume that customer always pay more than the price
        System.out.println("Change: " + leftover + " kronor");

        int x, y;

        // Write everything, copy and paste, Since Math.floorDiv requires a long
        x = 1000;
        y = leftover / x;                                 // Get number of bill needed
        leftover = leftover - x * y;                    // Subtract into leftover
        System.out.println("" + x + "kr bills: " + y);  // Print number of bills needed

        x = 500;
        y = leftover / x;
        leftover = leftover - x * y;
        System.out.println(" " + x + "kr bills: " + y);

        x = 100;
        y = leftover / x;
        leftover = leftover - x * y;
        System.out.println(" " + x + "kr bills: " + y);

        x = 50;
        y = leftover / x;
        leftover = leftover - x * y;
        System.out.println("  " + x + "kr bills: " + y);

        x = 20;
        y = leftover / x;
        leftover = leftover - x * y;
        System.out.println("  " + x + "kr bills: " + y);

        x = 10;
        y = leftover / x;
        leftover = leftover - x * y;
        System.out.println("  " + x + "kr coins: " + y);

        x = 5;
        y = leftover / x;
        leftover = leftover - x * y;
        System.out.println("   " + x + "kr coins: " + y);

        x = 1;
        System.out.println("   " + x + "kr coins: " + leftover); // Everything lies here.

        scan.close();
    }
}
