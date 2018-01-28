/**
 * IntArrayIterator.java
 * 22 dec 2014
 */
package eh223im_assign4.interfaces;

import java.util.Iterator;

/**
 * @author jlnmsi
 */
public class IntArrayIterator implements Iterator <Integer> {
    private final int[] elements;
    private final int max;             // final element in array
    private int nextElement = 0;      // first element at start

    public IntArrayIterator(int[] values, int maxIndex) {
        elements = values;
        max = maxIndex;
    }

    public boolean hasNext() {
        return nextElement < max;
    }

    public Integer next() {
        return elements[nextElement++];  // Pick out and increase
    }
}
