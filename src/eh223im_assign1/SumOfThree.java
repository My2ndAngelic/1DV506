package eh223im_assign1;

import java.util.Scanner;

public class SumOfThree {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number here: ");

        int d;
        for (int k = 100;k<1000;k++) {
            d = k % 10 + (k % 100 - k % 10) / 10 + (k % 1000 - k % 100) / 100;
            System.out.println("Sum of last three digits: " + +k+","+d);
        }
       // scan.nextLine();
    }
}
