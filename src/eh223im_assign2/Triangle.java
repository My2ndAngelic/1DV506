package eh223im_assign2;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Provide an odd positive integer: ");
        int n = scan.nextInt();

        // Give error and end the program if it is not
        if (((n % 2) == 0) || (n < 1)) {
            System.err.println("It is not an odd positive integer.");
            System.exit(-1);
        }

        System.out.println();

        // Right Triangle section
        System.out.println("Right triangle:");
        StringBuilder rightT = new StringBuilder();
        for (int i = 0; i < n; i++) {
            rightT.append(" ");                            // Add space to rightT string to make triangle
        }

        char[] rightTchars;
        for (int i = 0; i < n; i++) {                         // Adopted from https://stackoverflow.com/questions/6952363/replace-a-character-at-a-specific-index-in-a-string
            rightTchars = rightT.toString().toCharArray();               // Convert to array
            rightTchars[rightT.length() - i - 1] = '*';       // Replace position i-1 with *
            rightT = new StringBuilder(String.valueOf(rightTchars));             // Convert back to string
            System.out.println(rightT);                       // Print
        }

        System.out.println();

        // Isoscale triangle section
        System.out.println("Isoscale triangle: ");
        StringBuilder isoT = new StringBuilder();

        for (int i = 0; i < n; i++) {
            isoT.append(" ");                                  // Add empty space to isoT string to make triangle
        }
        char[] isoTchars;

        // Initialization of the middle character
        isoTchars = isoT.toString().toCharArray();                     // Convert to Array
        isoTchars[isoT.length() / 2] = '*';                 // Middle character = '*'
        isoT = new StringBuilder(String.valueOf(isoTchars));                   // Convert back to string

        for (int i = 0; i < (Math.floorDiv(n, 2) + 1); i++) {   // Repeat (n/2)+1 lines
            isoTchars = isoT.toString().toCharArray();                     // Convert to Array
            isoTchars[isoT.length() / 2 - i] = '*';             // Shift i step backward from middle, change ' ' to '*'
            isoTchars[isoT.length() / 2 + i] = '*';             // Shift i step forward from middle, change ' ' to '*'
            isoT = new StringBuilder(String.valueOf(isoTchars));                   // Convert back to string
            System.out.println(isoT);                           // Export
        }

        scan.close();
    }
}

//
