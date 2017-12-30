package eh223im_assign4.sort_cities;

import java.util.Iterator;

public class City implements SortCities{
    private String zipcode;
    private String name;
    private int fileLength = 0;
    private City[] cities;
    private int filesize = 0;

    City(String zip,String name){
        this.zipcode = zip;
        this.name = name;
        filesize++;
    }


    public Iterator<City> iterator() {
        return new CityIterator<City>(cities, filesize);
    }

    public String getZipcode() {
        return zipcode;
    }

    public String getName() {
        return name;
    }

    public void setCities(City[] cities) {
        this.cities = cities;
    }
}
