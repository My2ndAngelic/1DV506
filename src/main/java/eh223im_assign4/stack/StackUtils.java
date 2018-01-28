package eh223im_assign4.stack;

import java.util.Iterator;

public class StackUtils implements Stack {

    Object[] obj = new Object[0];
    int size = obj.length;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        try {
            Object o = obj[0];
            return true;
        } catch (IndexOutOfBoundsException e) {
            return false;
        }
    }

    // Return the first element;
    public Object peek() {
        try {
            return obj[0];
        } catch (IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException("Empty stack.");
        }
    }

    // Return and remove the first element
    public Object pop() {
        try {
            Object o = obj[0];
            Object[] temp = new Object[size - 1];
            System.arraycopy(obj, 1, temp, 0, size - 1);
            obj = temp;
            size--;
            return o;
        } catch (IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException("Empty stack.");
        }

    }

    // Add one to the top, then update array & size
    public void push(Object element) {
        Object[] temp = new Object[size + 1];
        temp[0] = element;
        System.arraycopy(obj, 0, temp, 1, size);
        size++;
        obj = temp;
    }

    public Iterator <Object> iterator() {
        return new StackIterator <Object>(obj, size);
    }
}
