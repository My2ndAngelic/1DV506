package eh223im_assign4.sort_cities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class SortCities {
    public static void main(String[] args) {
        // Google file-reading method
        String path = "/Users/My2ndAngelic/Downloads/city.txt";
        File f = new File(path);
        Scanner scanFile = null;
        Random ran = new Random();

        try {
            scanFile = new Scanner(f);
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
            System.exit(-1);
        }
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        City c = new City();
        c.readFile(path);
        c.sort();

        for (int i = 1; i<c.getCities().length; i++) {
            System.out.println(c.getCities()[i]);
        }
    }
}
