package eh223im_assign2;

import java.util.Scanner;

public class Backwards {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Provide a line of text: ");
        String str = scan.nextLine();

        String str2 = "";
        int a = str.length() - 1;

        // Reverse
        for (int i = 0; i < str.length(); i++) {
            str2 = str2 + str.charAt(a - i);
        }

        System.out.println(str2);
        scan.close();
    }
}

