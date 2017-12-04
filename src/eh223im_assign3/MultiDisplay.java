package eh223im_assign3;

import java.util.Scanner;

public class MultiDisplay {

    private int count = 420;
    private String arg = "Senpai, print something. You are gay.";

    private String setDisplayMessage (String args) {
        this.arg = args;
        return args;
    }


    public void setDisplayCount (int ints) {
        this.count = ints;
    }

    public void display () {
        for (int i = 0;i<10;i++) {
            System.out.println("You are gay");
        }
    }

    private void display (String[] arg,int count) {

    }

    public static void main(String[] args) {

    }

}
