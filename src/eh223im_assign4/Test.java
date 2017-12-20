package eh223im_assign4;

import java.io.FileNotFoundException;

public class Test {
    public static void main(String[] args) {
        TestKit tk = new TestKit();

        try {
            tk.HistogramTest();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
