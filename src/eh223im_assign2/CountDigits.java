package eh223im_assign2;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Input integer, convert to String
        System.out.print("Please enter a positive integer: ");
        int inputI = Math.abs(90529);
        String inputS = Integer.toString(inputI);
        System.out.println(inputS);
        int zero = 0, odd = 0, even = 0, a = 0;
        int counter = 0;

        // Count number of digit
        if (inputI == 0) { // If 0, count 1
            counter++;
        } else {
            counter = (int) Math.floor(Math.log10(inputI)) + 1; // If not, take log10 of it, then floor it, and + 1
        }

        // Count using modulo function
        for (int i = 0; i < counter; i++) {
            a = inputI % 10;
            if (a == 0) {
                zero++;
            } else if (a % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            inputI=inputI/10;
        }

        // Output
        System.out.println("Zero: " + zero);
        System.out.println("Odd: " + odd);
        System.out.println("Even: " + even);
    }
}

/*
Mathematical algorithm source: https://brilliant.org/wiki/finding-digits-of-a-number/
Adopted from: https://stackoverflow.com/questions/27096670/how-to-sum-digits-of-an-integer-in-java
*/