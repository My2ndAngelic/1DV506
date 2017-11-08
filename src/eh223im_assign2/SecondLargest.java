package eh223im_assign2;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter something: "); int Int = scan.nextInt();
        int largest1 = Int;
        System.out.print("Enter something: "); Int = scan.nextInt();
        int largest2 = Int;
        int largest3 = Int;
        if (largest1 < largest2) {
            largest3 = largest1;
            largest1 = largest2;
            largest2 = largest3;
        }

        int counter = 2;

        while (counter <5) {
            System.out.print("Enter something: ");
            Int = scan.nextInt();
            if (Int > largest1) {
                largest2 = largest1;
                largest1 = Int;
            }
            if (largest1 < largest2) {
                largest3 = largest1;
                largest1 = largest2;
                largest2 = largest3;
            }
            counter++;
        }

        System.out.println(largest2);
        /*
        int largest = int1;
        int position = 1;


        if (largest < int1) {
            largest = int1;
            position = 1;
        }
        if (largest < int2) {
            largest = int2;
            position = 2;
        }
        if (largest < int3) {
            largest = int3;
            position = 3;
        }
        if (largest < int4) {
            largest = int4;
            position = 4;
        }
        if (largest < int5) {
            largest = int5;
            position = 5;
        }
        if (largest < int6) {
            largest = int6;
            position = 6;
        }
        if (largest < int7) {
            largest = int7;
            position = 7;
        }

        System.out.println(largest);

        counter = 1;
        largest = null;
        int position2 = position;

        if (largest < int1 && position2 != position) {
            largest = int1;
            position = 1;
        }
        if (largest < int2 && position2 != position) {
            largest = int2;
            position = 2;
        }
        if (largest < int3 && position2 != position) {
            largest = int3;
            position = 3;
        }
        if (largest < int4 && position2 != position) {
            largest = int4;
            position = 4;
        }
        if (largest < int5 && position2 != position) {
            largest = int5;
            position = 5;
        }
        if (largest < int6 && position2 != position) {
            largest = int6;
            position = 6;
        }
        if (largest < int7 && position2 != position) {
            largest = int7;
            position = 7;
        }

        System.out.println(largest+" "+position);
        */
        scan.close();
    }
}
