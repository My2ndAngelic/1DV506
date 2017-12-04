package eh223im_assign3;

import java.util.Random;

public class SweID {
    public static void main(String[] args) {

        // My real personal number
        String str = "";
        String str2 = "";

        String[] strarr = {"invalid ID -","invalid month |","invalid date |","invalid checksum |"};
        for (int i = 0; i < 10; i++) {
            str = genID();
            System.out.println(str+"\t"+"female: "+isFemaleNumber(str) + "\t"+"male: "+isMaleNumber(str));
        }

        System.out.println("female: "+isFemaleNumber(str));
        System.out.println("male: "+isMaleNumber(str));
        System.out.println("leap: "+isLeap("001203"));

        if (isValidID(str)) {
            strarr[0] = "valid ID.";
        }

        if (isValidMonth(str)) {
            strarr[1] = "";
        }

        if (isValidDate(str)) {
            strarr[2] = "";
        }

        if (isValidChecksum(str)) {
            strarr[3] = "";
        }

        System.out.println();
        System.out.println(str+": "+strarr[0]+" "+strarr[1]+" "+strarr[2]+" "+strarr[3]);
    }


    // Compare if those two are the same ID number
    private static boolean areEqual(String str, String str2) {
        StringBuilder substr = new StringBuilder(), substr2 = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                substr.append(str.charAt(i));
            }
        }
        for (int i = 0; i < str2.length(); i++) {
            if (Character.isDigit(str2.charAt(i))) {
                substr2.append(str2.charAt(i));
            }
        }

        return substr.toString().equals(substr2.toString());
    }

    // Check if valid ID
    private static boolean isValidID (String str) {
        return (isValidChecksum(str) && isValidMonth(str) && isValidDate(str));
    }


    // Check if valid Checksum
    private static boolean isValidChecksum(String str) {
        StringBuilder strRaw = new StringBuilder();

        // Create a new string only for number
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                strRaw.append(str.charAt(i));
            }
        }

        int check = 0, com = 0;
        for (int i = 0; i < strRaw.length() - 1; i++) {
            if (strRaw.length() % 2 == 0) {
                if (i % 2 == 0) {
                    check = (strRaw.charAt(i) - 48) * 2;
                    if (check % 9 == 0 & check > 9) {
                        check = 9;
                    } else {
                        check %= 9;
                    }
                    com += check;
                } else {
                    check = strRaw.charAt(i) - 48;
                    com += check;
                }
            }
        }
        com = (10 - com % 10) % 10;

        return (com == (Integer.parseInt(String.valueOf(str.charAt(10)))));
    }


    // Return first part
    private static String getFirstPart(String str) {
        StringBuilder k = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                if (k.length() < 6) {
                    k.append(str.charAt(i));
                }
            }
        }
        return k.toString();
    }

    // Get year, specify 4 if need 4 characters, otherwise any number will return 2 characters
    private static String getYear(String str, int n) {
        StringBuilder sb = new StringBuilder();
        sb.append(getFirstPart(str));

        int year = Integer.parseInt(sb.substring(0, 2));

        if (n == 4) {
            // Year range: 1931 to 2030
            if (year > 30) {
                year += 1900;
            } else {
                year += 2000;
            }
            sb = new StringBuilder();
            sb.append(Integer.toString(year));
        } else {
            sb = new StringBuilder();
            sb.append(Integer.toString(year));
        }

        return sb.toString();
    }

    // Get month, return 2 character: 01 - 12
    private static String getMonth(String str) {
        String str2 = (getFirstPart(str));
        return str2.substring(2, 4);
    }

    // Get date, return 2 character: 01 ~ 12
    private static String getDay(String str) {
        String str2 = (getFirstPart(str));
        return str2.substring(4, 6);
    }

    // Check if valid month
    private static boolean isValidMonth(String str) {
        String str2 = getFirstPart(str);
        int month = Integer.parseInt(getMonth(str2));
        return month >= 1 & month <= 12;
    }

    // Check if valid date
    private static boolean isValidDate(String str) {
        String str2 = getFirstPart(str);
        int year = Integer.parseInt(getYear(str2, 4));
        int month = Integer.parseInt(getMonth(str2));
        int date = Integer.parseInt(getDay(str2));
        int min = 0, max = 0;

        if (isLeap(Integer.toString(year))) {
            switch (month) {
                case 1:
                    min = 1;
                    max = 31;
                    break;
                case 2:
                    min = 1;
                    max = 29;
                    break;
                case 3:
                    min = 1;
                    max = 31;
                    break;
                case 4:
                    min = 1;
                    max = 30;
                    break;
                case 5:
                    min = 1;
                    max = 31;
                    break;
                case 6:
                    min = 1;
                    max = 30;
                    break;
                case 7:
                    min = 1;
                    max = 31;
                    break;
                case 8:
                    min = 1;
                    max = 31;
                    break;
                case 9:
                    min = 1;
                    max = 30;
                    break;
                case 10:
                    min = 1;
                    max = 31;
                    break;
                case 11:
                    min = 1;
                    max = 30;
                    break;
                case 12:
                    min = 1;
                    max = 31;
                    break;
                default:
                    min = -1;
                    max = -1;
                    break;
            }
        } else {
            switch (month) {
                case 1:
                    min = 1;
                    max = 31;
                    break;
                case 2:
                    min = 1;
                    max = 28;
                    break;
                case 3:
                    min = 1;
                    max = 31;
                    break;
                case 4:
                    min = 1;
                    max = 30;
                    break;
                case 5:
                    min = 1;
                    max = 31;
                    break;
                case 6:
                    min = 1;
                    max = 30;
                    break;
                case 7:
                    min = 1;
                    max = 31;
                    break;
                case 8:
                    min = 1;
                    max = 31;
                    break;
                case 9:
                    min = 1;
                    max = 30;
                    break;
                case 10:
                    min = 1;
                    max = 31;
                    break;
                case 11:
                    min = 1;
                    max = 30;
                    break;
                case 12:
                    min = 1;
                    max = 31;
                    break;
                default:
                    min = -1;
                    max = -1;
                    break;
            }
        }

        boolean check = false;

        if (month >= 1 && month <= 12) {
            if ((date >= min) & (date <= max)) {
                check = true;
            }
        } else check = false;

        return check;
    }


    // Return last part
    private static String getLastPart(String str) {
        StringBuilder k = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                k.append(str.charAt(i));
            }
        }

        k.delete(0, 6);

        return k.toString();
    }

    // Check genders
    private static boolean isMaleNumber(String str) {

        return Integer.parseInt(getLastPart(str).substring(2,3)) %2 != 0;

    }

    private static boolean isFemaleNumber(String str) {

        return Integer.parseInt(getLastPart(str).substring(2,3)) %2 == 0;
    }

    // Check if year is leap, requires year in 4 numbers
    private static boolean isLeap(String str) {
        int year = Integer.parseInt(getYear(str,4));
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    // Generate ID, repeat until valid is generated.
    private static String genID() {
        StringBuilder str = new StringBuilder();
        Random ran = new Random();

        do {
            str = new StringBuilder();
            int year = Integer.parseInt(String.valueOf(ran.nextInt(99) + 1));
            int month = Integer.parseInt(String.valueOf(ran.nextInt(12) + 1));
            int day = Integer.parseInt(String.valueOf(ran.nextInt(31) + 1));
            int gender = Integer.parseInt(String.valueOf(ran.nextInt(9) + 1));
            int person = Integer.parseInt(String.valueOf(ran.nextInt(99) + 1));
            int checksum = Integer.parseInt(String.valueOf(ran.nextInt(9) + 1));
            str.append(String.format("%02d", year)).append(String.format("%02d", month)).append(String.format("%02d", day)).append("-").append(gender).append(String.format("%02d", person)).append(checksum);
        } while (!isValidID(str.toString()));

        return str.toString();
    }

}
