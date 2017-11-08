package eh223im_assign2;

import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.println("Guess a number between 1 to 100");

        int min = 1;
        int max = 100;
        int answer = random.nextInt((max - min) + 1) + min; //Generate number from 1 to 100

        int n = 1;

        System.out.print("Guess 1: ");
        int guess = scan.nextInt();

        while (guess != answer) {
            n++;
            if (guess < answer) {
                System.out.println("Clue: higher");
            } else {
                System.out.println("Clue: lower");
            }
            System.out.print("Guess " + n + ": ");
            guess = scan.nextInt();
        }

        System.out.println("Correct answer after only " + n + " guesses – Excellent!");
        scan.close();
    }
}
