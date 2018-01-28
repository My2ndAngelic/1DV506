package eh223im_assign4;

import java.util.Scanner;

public class DrunkenWalk {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // User input
        System.out.print("Enter the size: ");
        int planeSize = scan.nextInt();
        System.out.print("Enter the number of steps: ");
        int maxStep = scan.nextInt();
        System.out.print("Enter number of walkers: ");
        int people = scan.nextInt();

        String k = null;
        do {
            System.out.print("Do you want to set the start position (Y/N): ");
            k = scan.nextLine();
        } while (!(k.toUpperCase().equals("Y") || k.toUpperCase().equals("N")));

        int x = 0;
        int y = 0;
        if (k.toUpperCase().equals("Y")) {
            System.out.print("Enter X-coordinate: ");
            scan.nextLine();
            System.out.print("Enter Y-coordinate: ");
            scan.nextLine();
        }

        // Main
        int dead = 0;
        for (int i = 0; i < people; i++) {
            RandomWalk rw = new RandomWalk(maxStep, planeSize);
            rw.setX(x);
            rw.setY(y);
            while (rw.inBound() && rw.moreStep()) {
                rw.walk();
            }
            System.out.println("Walker #" + i + " - " + rw.toString());
            if (!rw.inBound()) dead++;

        }

        // Result
        System.out.println("Dead: " + dead);
    }
}
