package eh223im_assign4.sort_cities;

import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class City implements Comparable <City> {
    public String getCityname() {
        return cityname;
    }

    public City[] getCities() {
        return cities;
    }

    public int getFilesize() {
        return filesize;
    }

    private int zipcode;
    private String cityname;
    private City[] cities;
    private int filesize;

    City(int zip, String name) {
        this.zipcode = zip;
        this.cityname = name;
    }

    City() {
        zipcode = 0;
        cityname = "";
        cities = new City[0];
        filesize = 0;
    }

    public String toString() {
        return getName() + " " + getZipcode();
    }

    public Iterator <City> iterator() {
        return new CityIterator <City>(cities, filesize);
    }

    public int getZipcode() {
        return zipcode;
    }

    public String getName() {
        return cityname;
    }

    public void setCities(City[] cities) {
        this.cities = cities;
    }

    public void readFile(String dir) {
        File f = new File(dir);
        Scanner scanFile = null;

        try {
            scanFile = new Scanner(f);

            String[] tempData; //

            while (scanFile.hasNext()) {
                filesize++;
                tempData = scanFile.nextLine().split(";");
                zipcode = Integer.parseInt(tempData[0]);
                cityname = tempData[1];
                City c = new City(zipcode, cityname);
                City[] cT = new City[cities.length + 1];
                cT = Arrays.copyOf(cities, cities.length);
                cT[cT.length] = c;
                cities = cT;
            }
        } catch (Exception e) { // If it does not work, then print
            e.printStackTrace();
        }
    }

    public void sort() { // Bubble sort
        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; i < cities.length - 2; j++) {
                City temp;
                if (cities[j].compareTo(cities[j + 1]) > 0) {
                    temp = cities[j];
                    cities[j] = cities[j + 1];
                    cities[j + 1] = temp;
                }
            }
        }
    }

    public int compareTo(City c) {
        return zipcode - c.getZipcode();
    }

}