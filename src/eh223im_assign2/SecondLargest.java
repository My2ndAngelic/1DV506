package eh223im_assign2;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Initialize
        int counter = 1;
        int largest1, largest2;
        int input;

        // First number
        System.out.print("Enter number #" + counter + ": ");
        input = scan.nextInt();
        largest1 = input;
        counter++;

        // Second number
        System.out.print("Enter number #" + counter + ": ");
        input = scan.nextInt();
        if (input >= largest1) {
            largest2 = largest1;
            largest1 = input;
        } else {
            largest2 = input;
        }
        counter++;

        // Loop: input, compare, push and increase the counter
        while (counter < 11) {
            System.out.print("Enter number #" + counter + ": ");
            input = scan.nextInt();
            if (input >= largest1) {
                largest2 = largest1;
                largest1 = input;
            } else if (input > largest2) {
                largest2 = input;
            }
            counter++;
        }

        System.out.println("The second largest is: " + largest2);
    }
}
