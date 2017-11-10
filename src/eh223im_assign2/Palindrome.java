package eh223im_assign2;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter a string: ");
        String str = scan.nextLine();
        System.out.println(str);
        String str2 = "", str3 = "";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter((str.charAt(i))) == true) {
                str2 += str.charAt(i);
            }
        }

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(str.length() - i - 1)) == true) {
                str3 += str.charAt(str.length() - 1 - i);
            }
        }

        str2 = str2.toUpperCase();
        str3 = str3.toUpperCase();

        if (str2.equals(str3)) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome");
        }

        scan.close();
    }
}
