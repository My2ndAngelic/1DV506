package eh223im_assign1;

import java.util.Scanner;

public class Seconds {
    public static void main(String args[]) {
        //Variable declare
        Scanner scan = new Scanner(System.in); //Input scanner

        //Scan for h,m,s
        System.out.print("Hour: ");
        int hour = scan.nextInt();
        System.out.print("Minute: ");
        int min = scan.nextInt();
        System.out.print("Second: ");
        int sec = scan.nextInt();

        //Math & output
        int secT;
        secT = hour * 3600 + min * 60 + sec;
        System.out.print("Total number of seconds: " + secT);
        scan.nextLine();
    }
}
