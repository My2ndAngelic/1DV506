package eh223im_assign1;

import java.util.Scanner;

public class Seconds {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        //Scan for h,m,s
        System.out.print("Hour: ");
        int hour = scan.nextInt();
        System.out.print("Minute: ");
        int min = scan.nextInt();
        System.out.print("Second: ");
        int sec = scan.nextInt();

        //Math & output
        sec = hour * 3600 + min * 60 + sec;
        System.out.print("Total number of seconds: " + sec);
        scan.nextLine();
    }
}
