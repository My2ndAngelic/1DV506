/*
Selection sort algorithm
Obtained while reading some textbook.
*/

package eh223im_assign2;

import java.util.Scanner;

public class ReverseOrder {
    public static void main(String[] args) {
        int[] list = {0, 1, 5, 9, 6, 4, 3, 2, 7, 8};
        int temp = 0;

        System.out.println(list.length);
        boolean check = false;

        do {
            for (int i = 0; i < list.length - 1; i++) {
                if (list[i] < list[i + 1]) {
                    temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                }
            }

            for (int i = 0; i < list.length; i++) {
                System.out.print(list[i] + " ");
            }
            System.out.println();

            temp = 0;
            for (int i = 0; i < list.length-1; i++) {
                if (list[i] > list[i+1]) {
                    temp = temp + 1;
                }
            }

            if (temp == list.length - 1) {
                check = true;
            }

        } while (check == false);

        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }

    }
}
