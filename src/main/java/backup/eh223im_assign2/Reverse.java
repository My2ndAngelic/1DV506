package backup.eh223im_assign2;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String str = scan.nextLine();
        char[] text = str.toCharArray();

        // char[] text = {'?', 't', 'h', 'g', 'i', 'r', ' ', ',', 'y', 's', 'a', 'E', ' ', 's', 'a', 'w', ' ', 's', 'i', 'h', 'T' };

        char[] revtext = new char[text.length];

        for (int i = 0; i < text.length; i++) {
            revtext[i] = text[text.length - i - 1];
        }

        System.out.println(text);
        System.out.println(revtext);

        scan.close();
    }
}

