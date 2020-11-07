package com.lambdaschool.foundation.models;

/**
 * special class for city id + name schema
 */
public class CityIdName
{
    /**
     * city id, already established, pulled from existing data in DB
     */
    private long cityId;

    /**
     * city name, already established, pulled from existing data in DB
     */
    private String cityName;

    /**
     * Default constructor
     */
    public CityIdName()
    {
    }

    /**
     * Main constructor
     * @param cityId id of city in local DB
     * @param cityName name of city in local DB
     */
    public CityIdName(
        long cityId,
        String cityName)
    {
        this.cityId = cityId;
        this.cityName = cityName;
    }

    /**
     * Getter for cityId
     * @return cityId
     */
    public long getCityId()
    {
        return cityId;
    }

    /**
     * Setter for cityId
     * @param cityId cityId
     */
    public void setCityId(long cityId)
    {
        this.cityId = cityId;
    }

    /**
     * Getter for cityName
     * @return CityName
     */
    public String getCityName()
    {
        return cityName;
    }

    /**
     * Setter for cityName
     * @param cityName CityName
     */
    public void setCityName(String cityName)
    {
        this.cityName = cityName;
    }

    /**
     * Override default toString method
     * @return String representation of object
     */
    @Override
    public String toString()
    {
        return "CityIdName{" +
            "cityId=" + cityId +
            ", cityName='" + cityName + '\'' +
            '}';
    }
}
