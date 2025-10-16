package com.example.listycity;

/**
 * Represents a city with its name and province
 */
public class City implements Comparable{
    private String city;
    private String province;

    /**
     * Creates a new City with the specified name and province
     *
     * @param city the name of the city
     * @param province the province where the city is located
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * Gets the name of the city
     *
     * @return the city name
     */
    String getCityName(){
        return this.city;
    }

    /**
     * Gets the name of the province
     *
     * @return the province name
     */
    String getProvinceName(){
        return this.province;
    }

    /**
     * Compares this city to another city by name
     *
     * @param o the object to compare to
     * @return a negative integer, zero, or a positive integer if this city
     *         is less than, equal to, or greater than the specified city
     */
    @Override
    public int compareTo(Object o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName());
    }

    /**
     * Checks if this city is equal to another object
     * Two cities are equal if they have the same name and province
     *
     * @param o the object to compare to
     * @return true if the cities have the same name and province, false otherwise
     */
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City c = (City)o;
        return this.city.equals(c.getCityName()) && this.province.equals(c.getProvinceName());
    }
}