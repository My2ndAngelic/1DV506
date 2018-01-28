package eh223im_assign4.stack;

import java.util.Iterator;

/*
 * Using the class example
 *
 */

public class StackIterator<Object> implements Iterator <Object> {
    private final Object[] objects;
    private final int max;             // final element in array
    private int nextElement = 0;      // first element at start

    public StackIterator(Object[] obj, int maxIndex) {
        objects = obj;
        max = maxIndex;
    }

    public boolean hasNext() {
        return nextElement < max;
    }

    public Object next() {
        return objects[nextElement++];  // Pick out and increase
    }
}
