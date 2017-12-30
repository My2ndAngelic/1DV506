package backup.eh223im_assign2;

import java.util.Scanner;

class ChessColor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a location of chess: ");
        String input = scan.nextLine();
        input = input.toUpperCase();

        int row = (int) input.charAt(0) - 64;
        int column = (int) input.charAt(1) - 48;

        // A1 is white, because I said so
        if (row % 2 == column % 2) {
            System.out.println("White");
        } else {
            System.out.println("Black");
        }
    }
}
