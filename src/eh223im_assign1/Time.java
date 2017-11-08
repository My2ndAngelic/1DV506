package eh223im_assign1;

import java.util.Scanner;

public class Time {
    public static void main(String args[]) {
        //Variable declare
        Scanner scan = new Scanner(System.in); //Input scanner

        //Scan for real number
        System.out.print("Number of second: ");
        int sec = scan.nextInt();

        //Math & output
        
        //Calculate hours
        int hour = Math.floorDiv(sec, 3600);
        sec = sec - hour * 3600;
        //Calculate minutes
        int min = Math.floorDiv(sec, 60);
        sec = sec - min * 60;
        //Leftover is second

        //Output
        System.out.print("This corresponds to: " + hour + " hour " + min + " min " + sec + " sec.");

        scan.nextLine();
    }
}
