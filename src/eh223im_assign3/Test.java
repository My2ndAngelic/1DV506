package eh223im_assign3;

import java.text.DecimalFormat;
import java.util.Random;

public class Test {
    public static void Check(String str) {
        System.out.println("Done ex 1.");
        System.out.println("Done ex 2.");
    }

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        Random ran = new Random();

        String sb = "6603109288";
        System.out.println(sb.substring(2,4));

//        int year = ran.nextInt(1900);
//        int month = ran.nextInt(12) - 1;
//        int day = 0;
//
//        int max, min;
//        boolean leap = false;
//
//        if (year % 4 == 0) {
//            if (year % 100 == 0) {
//                if (year % 400 == 0) {
//                    leap = true;
//                } else {
//                    leap = false;
//                }
//            } else {
//                leap = false;
//            }
//        }
//
//        System.out.println(leap);
//
//        switch (month) {
//            case 1: min = 1; max = 31;
//            case 2: min = 1; max = 29;
//            case 3: min = 1; max = 31;
//            case 4: min = 1; max = 30;
//            case 5: min = 1; max = 31;
//            case 6: min = 1; max = 30;
//            case 7: min = 1; max = 31;
//            case 8: min = 1; max = 31;
//            case 9: min = 1; max = 30;
//            case 10: min = 1; max = 31;
//            case 11: min = 1; max = 30;
//            case 12: min = 1; max = 31;
//        }
//
//        int gender = 2;
//        int person = 19;
//        int checksum = 2;
//
//
//
//        stringBuilder.append(String.format("%02d",year)+String.format("%02d",month)+String.format("%02d",day)+"-"+gender+String.format("%02d",person)+checksum);
//        System.out.println(stringBuilder.toString());

//        String str = "660310--9288";
//        String str2 = "6603109288";
//
//        StringBuilder substr = new StringBuilder(), substr2 = new StringBuilder();
//
//        for (int i = 0; i<str.length();i++) {
//            if (Character.isDigit(str.charAt(i))) {
//                substr.append(str.charAt(i));
//            }
//        }
//
//        for (int i = 0; i<str2.length();i++) {
//            if (Character.isDigit(str2.charAt(i))) {
//                substr2.append(str2.charAt(i));
//            }
//        }
//
//        System.out.println(substr.toString()+ "\n"+ substr2.toString());
//
//        if (substr.toString().equals(substr2.toString())) {
//            System.out.println("true");
//        } else System.out.println("false");

//        StringBuilder strRaw = new StringBuilder();
//
//        for (int i = 0; i<str.length(); i++) {
//            if (Character.isDigit(str.charAt(i))) {
//                strRaw.append(str.charAt(i));
//            }
//        }
//
//        System.out.println(strRaw);
//
//        int check = 0;
//        int com = 0;
//        int k = 0, l = 0;
//
//        for (int i = 0; i<strRaw.length()-1;i++) {
//            if (strRaw.length()%2 == 0) {
//                if (i%2 == 0) {
//                    k = (strRaw.charAt(i) - 48) * 2;
//                    if (k%9 == 0 & k>9) {
//                        k = 9;
//                    } else {
//                        k %= 9;
//                    }
//                    System.out.println(k);
//                    l += k;
//                }
//                else {
//                    k = strRaw.charAt(i) - 48;
//                    System.out.println(k);
//                    l += k;
//                }
//            }
//        }
//        l = (10 - l%10);
//        System.out.println("\n"+l+"\n");
//        System.out.println((str.charAt(10)-48));
//
//        if (l == (str.charAt(10)-48)) {
//            System.out.println("True");
//        } else System.out.println("False");

    }
}
