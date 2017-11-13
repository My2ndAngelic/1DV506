package eh223im_assign2;

import java.util.Scanner;

public class ChessColor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("You enter: ");
        String input = "D5";
        input = input.toUpperCase();

        int row = (int) input.charAt(0) - 64;
        int column = (int) input.charAt(1) - 48;

        if (row%2 == column%2) {
            System.out.println("White");
        } else {
            System.out.println("Black");
        }
    }
}
