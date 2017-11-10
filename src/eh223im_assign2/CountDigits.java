package eh223im_assign2;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Input integer, convert to String
        System.out.print("Provide a positive integer: "); int inputI = Math.abs(scan.nextInt());
        String inputS = Integer.toString(inputI);
        int zero = 0, odd = 0, even = 0;

        // Convert to character array


        for (int i = 0; i < inputS.length(); i++) {
            if ((int) inputS.charAt(i) == 0) { // Convert to ASCII value, subtract 48 to get integer value
                zero++;
            } else if ((int) inputS.charAt(i) % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        // Output
        System.out.println("Zero: " + zero);
        System.out.println("Odd: " + odd);
        System.out.println("Even: " + even);

        scan.close();
    }
}


