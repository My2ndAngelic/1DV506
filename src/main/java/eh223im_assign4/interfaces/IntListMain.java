package eh223im_assign4.interfaces;

import java.util.Iterator;

public class IntListMain {
    public static void main(String[] args) {
        // Add elements to IntList
        IntList list = new ArrayIntList();
        for (int i = 0; i < 10; i++)
            list.add(i * 5);

        // Check methods print and findMin
        print(list);
        System.out.println("Min = " + findMin(list));

        // Check Exception
        try {
            int n = list.get(-99);
        } catch (IndexOutOfBoundsException ie) {
            System.out.println(ie.getMessage());
        }

        // Check iterator
        Iterator <Integer> it = list.iterator();
        while (it.hasNext()) {
            int n = it.next();
            System.out.print(n + "  ");
        }

    }

    private static void print(IntList l) {
        for (int i = 0; i < l.size(); i++)
            System.out.print(l.get(i) + " ");
        System.out.println("");
    }

    private static int findMin(IntList l) {
        int min = l.get(0);
        for (int i = 1; i < l.size(); i++) {
            if (l.get(i) < min)
                min = l.get(i);
        }
        return min;
    }
}

    

    

