package eh223im_assign1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input
        System.out.print("Enter a thing: ");
        double k = scan.nextDouble();

        // Echo back
        System.out.println("You have printed: " + k);
        scan.close();
    }
}
