//Bubble sort algorithm

package eh223im_assign2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ReverseOrder2 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();


        boolean check = true;
        int temp = -1;

        while (check = true) {
            System.out.print("Enter next number: ");
            list.add(scan.nextInt());
            temp++;
            if (list.get(temp) < 0) {
                break;
            }
        }
        list.remove(temp);

//        Random random = new Random();
//        for (int i = 0;i<20;i++) {
//            list.add(random.nextInt(100));
//        }
        System.out.println(list);

        check = false;

        do {
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) < list.get(i+1)) {
                    temp = list.get(i);
                    list.set(i,list.get(i+1));
                    list.set(i+1,temp);
                    TimeUnit.MILLISECONDS.sleep(100);
                    System.out.println(list);
                }
            }

            temp = 0;
            for (int i = 0; i < list.size()-1; i++) {
                if (list.get(i) >= list.get(i+1)) {
                    temp++;
                }
            }

            if (temp == list.size() - 1) {
                check = true;
            }
            System.out.println (list);
        } while (check == false);

        System.out.println("In reverse order: "+list);


    }
}
