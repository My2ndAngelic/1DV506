package eh223im_assign4.sort_cities;

import java.util.Iterator;

public class CityIterator<City> implements Iterator<City> {
    private int nextElement = 0;      // first element at start
    private final City[] cities;
    private final int max;             // final element in array

    public CityIterator(City[] city, int maxIndex) {
        cities = city;
        max = maxIndex;
    }

    public boolean hasNext() {
        return nextElement < max;
    }

    public City next() {
        return cities[nextElement++];  // Pick out and increase
    }
}
