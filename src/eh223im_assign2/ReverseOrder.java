//Bubble sort algorithm

package eh223im_assign2;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList <Integer>();

        boolean check = true;
        int temp = -1;

        // Enter a non-negative number
        while (check == true) {
            System.out.print("Enter a natural number: ");
            list.add(scan.nextInt());
            temp++;
            if (list.get(temp) < 0) {
                check = false;
            }
        }
        list.remove(temp);

        // Print the list
        System.out.println(list);


        do {
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) < list.get(i + 1)) {
                    temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                    System.out.println(list);
                }
            }

            temp = 0;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) >= list.get(i + 1)) {
                    temp++;
                }
            }

            if (temp == list.size() - 1) {
                check = true;
            }
            System.out.println(list);
        } while (check == false);

        System.out.println("Number of positive integers: " + list.size());
        System.out.println("In reverse order: " + list);

    }
}
