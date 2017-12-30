package backup.eh223im_assign2;

import java.util.ArrayList;
import java.util.Random;

public class FrequencyTable {
    public static void main(String[] args) {
        // Initialize
        ArrayList numList = new ArrayList <Integer>();
        // int[] numList = new int[6000];
        Random ran = new Random();
        int k = 0, max = 6, min = 1, one = 0, two = 0, three = 0, four = 0, five = 0, six = 0;

        // Main problem
        for (int i = 0; i < 6000; i++) {
            numList.add(ran.nextInt(max - min + 1) + min); // Random a number (1-6) and add to array
            switch ((int) numList.get(i)) { // Count
                case 1:
                    one++;
                    break;
                case 2:
                    two++;
                    break;
                case 3:
                    three++;
                    break;
                case 4:
                    four++;
                    break;
                case 5:
                    five++;
                    break;
                case 6:
                    six++;
                    break;
                default:
                    break; // Safety break, just in case
            }
        }

        // Export
        System.out.println(numList);
        System.out.println((int) numList.get(3));
        System.out.println("One: " + one);
        System.out.println("Two: " + two);
        System.out.println("Three: " + three);
        System.out.println("Four: " + four);
        System.out.println("Five: " + five);
        System.out.println("Six: " + six);
    }
}
