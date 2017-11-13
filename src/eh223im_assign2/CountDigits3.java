// Count by using character

package eh223im_assign2;

import java.util.Scanner;

public class CountDigits3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Input integer, convert to String
        System.out.print("Provide a positive integer: "); int inputI = Math.abs(3570008);
        String inputS = Integer.toString(inputI);
        int zero = 0, odd = 0, even = 0;

        char r = '2';
        int c = (int) r-48;
        System.out.println("Debug: "+c);

        // Convert to character array
        for (int i = 0; i < inputS.length(); i++) {
            if ( (int) (inputS.charAt(i)-48) == 0) { // Convert to ASCII value, subtract 48 to get integer value
                zero++;
            } else if ( ((int) ( (int) ((inputS.charAt(i)) - 48)%2) == 0)) {
                even++;
            } else {
                odd++;
            }
        }

        // Output
        System.out.println(  "Zero: " + zero +"\n"
                           + "Odd: " + odd + "\n"
                           + "Even: " + even);

        scan.close();
    }
}


