package eh223im_assign2;

import java.util.Scanner;

public class CountA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Input
        System.out.print("Provide a line of text: ");
        String str = scan.nextLine();

        int a = 0;
        int A = 0;

        // Count
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                a++;
            } else if (str.charAt(i) == 'A') {
                A++;
            }
        }

        //Output
        System.out.println("Number of a: " + a);
        System.out.println("Number of A: " + A);

        scan.close();
    }
}
