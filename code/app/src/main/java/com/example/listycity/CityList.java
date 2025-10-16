package com.example.listycity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.example.listycity.City;

/**
 * Manages a collection of City objects.
 * Provides methods to add, delete, and retrieve cities and prevents duplicates
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * Adds a city to the list if it does not already exist
     *
     * @param city the city to add
     * @throws IllegalArgumentException if the city already exists in the list
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * Returns a sorted list of all cities
     * Cities are sorted alphabetically by name
     *
     * @return a sorted list of cities
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * Checks if a city exists in the list.
     *
     * @param city the city to check for
     * @return true if the city is in the list, false otherwise
     */
    public boolean hasCity(City city){
        return cities.contains(city);
    }

    /**
     * Removes a city from the list
     *
     * @param city the city to remove
     * @throws IllegalArgumentException if the city does not exist in the list
     */
    public void delete(City city){
        if(cities.contains(city)){
            cities.remove(city);
        }
        else{
            throw new IllegalArgumentException();
        }
    }

    /**
     * Returns the total number of cities in the list
     *
     * @return the number of cities
     */
    public int countCities(){
        return cities.size();
    }
}