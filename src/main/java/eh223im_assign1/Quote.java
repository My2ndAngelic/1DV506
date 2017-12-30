package backup.eh223im_assign1;

import java.util.Scanner;

public class Quote {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        // In
        System.out.print("Write a line of text: ");
        String aLine = scan.nextLine();
        // Out
        System.out.println("backup.eh223im_assign1.Quote: \"" + aLine + "\"");
        scan.nextLine();
    }
}
