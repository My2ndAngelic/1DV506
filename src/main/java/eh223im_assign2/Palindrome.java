package backup.eh223im_assign2;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Input
        System.out.print("Please enter a string: ");
        String str = "Was it a rat I saw?";
        System.out.println(str);
        String str2 = "", str3 = "";

        // Extract letters to an arrays
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter((str.charAt(i))) == true) {
                str2 += str.charAt(i);
            }
        }

        // Reverse
        for (int i = 0; i < str2.length(); i++) {
            str3 += str2.charAt(str2.length() - i - 1);
        }

        // Convert to upper case
        str2 = str2.toUpperCase();
        str3 = str3.toUpperCase();

        // Compare & output
        if (str2.equals(str3)) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome");
        }

        scan.close();
    }
}
