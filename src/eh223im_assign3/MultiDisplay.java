package eh223im_assign3;

import java.util.Scanner;

public class MultiDisplay {

    public String setDisplayMessage (String args) {
        Scanner scan = new Scanner(System.in);
        this.arg = scan.next();
        return args;
    }

    private String arg = "";

    public void setDisplayCount (int ints) {
        for (int i = 0; i<ints;i++) {
            System.out.println(setDisplayMessage(arg));
        }
    }

    private void display (String[] arg) {

    }

    private void count (int ints) {

    }


}
