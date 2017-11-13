package eh223im_assign2;

import java.util.Scanner;

import static java.lang.System.in;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);
        int inputI = 0;
        int counter = (int) Math.floor(Math.log10(inputI)) + 1; // If not, take log10 of it, then floor it, and + 1
        System.out.println(inputI+" "+counter);
    }
}
