package eh223im_assign2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SalaryRevision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList <Integer> arrayList = new ArrayList <>();

        int sum = 0;
        String inputString = "Provide salaries (and terminate input with 'X'): ";

        boolean check = true;

        do {
            System.out.print(inputString);
            check = scan.hasNextInt();
            if (check) {
                arrayList.add(scan.nextInt());
            }
        } while (check == true);

        Collections.sort(arrayList);
        int counter = arrayList.size();

        for (int i = 0; i < counter; i++) {
            sum += arrayList.get(i);
        }

        Collections.sort(arrayList);

        int gap = arrayList.get(counter - 1) - arrayList.get(0);

        System.out.println("Provided list: " + arrayList);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (sum / counter));
        System.out.println("Gap: " + gap);
    }
}
