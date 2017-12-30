package eh223im_assign4;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) throws Exception {
        // Initialize
        File file = new File("input.txt");
        Scanner inFile = new Scanner(file);
        PrintWriter outFile = new PrintWriter("output.txt");
        Scanner inConsole = new Scanner(System.in);
        int[] res = new int[5]; // 0: Upper, 1: Lower, 2: Digit, 3: Whitespace, 4: Others;

        // Read whole lines, convert to char array, start counting. Use TestKit to test.
        while (inFile.hasNextLine()) {
            char[] k = inFile.nextLine().toCharArray();
            for (char aK : k) {
                if (Character.isUpperCase(aK)) {
                    res[0]++;
                } else if (Character.isLowerCase(aK)) {
                    res[1]++;
                } else if (Character.isDigit(aK)) {
                    res[2]++;
                } else if (Character.isWhitespace(aK)) {
                    res[3]++;
                } else {
                    res[4]++;
                }
            }
        }

        System.out.println("Number of upper case letters: " + res[0] + "\n" +
                "Number of lower case letters: " + res[1] + "\n" +
                "Number of digits: " + res[2] + "\n" +
                "Number of \"whitespaces\": " + res[3] + "\n" +
                "Number of others: " + res[4] + "\n");
    }
}

/*
Seems like there is something wrong with Whitespace on mac encoding,
it does not count linefeed, return or newline as whitespace.
*/