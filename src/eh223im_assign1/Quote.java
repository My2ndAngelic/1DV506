package eh223im_assign1;

import java.util.Scanner;

public class Quote {
    public static void main(String args[]) {
        System.out.print("Write a line of text: ");
        Scanner scan = new Scanner(System.in);
        String aLine = scan.nextLine();
        System.out.println("eh223im_assign1.Quote: \"" + aLine + "\"");
        scan.nextLine();
    }
}

// Adopted from lecture notes
// https://stackoverflow.com/questions/11871520/how-can-i-read-input-from-the-console-using-the-scanner-class-in-java
