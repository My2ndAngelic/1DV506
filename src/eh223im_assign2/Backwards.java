package eh223im_assign2;

import java.util.Scanner;

public class Backwards {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Input
        System.out.print("Provide a line of text: ");
        String str = scan.nextLine();

        String str2 = "";

        // Reverse
        for (int i = 0; i < str.length(); i++) {
            str2 = str2 + str.charAt(str.length() - 1 - i);
        }

        //
        System.out.println(str2);
        scan.close();
    }
}

