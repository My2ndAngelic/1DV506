package eh223im_assign1;

import java.util.Scanner;

public class ShortName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Input


        System.out.print("Enter your first name: ");
        String f = scan.nextLine();
        System.out.print("Enter your last name: ");
        String l = scan.nextLine();

        f = " " + f;
        l = l + "    ";

        System.out.print("Your name is: " + f.charAt(0) + ". " + l.substring(0, 4));
        scan.close();
    }
}