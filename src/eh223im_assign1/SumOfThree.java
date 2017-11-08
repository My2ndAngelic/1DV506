package eh223im_assign1;

import java.util.Scanner;

public class SumOfThree {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int k;
        System.out.print("Enter your number here: ");
        k = scan.nextInt();

        int d;
        d = k % 10 + (k % 100 - k % 10) / 10 + (k % 1000 - k % 100) / 100;

        System.out.println("Sum of last three digits: " + d);
        scan.nextLine();
    }
}
