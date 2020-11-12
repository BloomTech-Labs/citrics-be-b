package com.lambdaschool.foundation.models;

/**
 * special class for city id + name schema
 */
public class CityAbstract
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
     * state postal code, already established, pulled from existing data in DB
     */
    private String stateCode;

    /**
     *  city population, already established, pulled from existing data in DB
     */

    private Long population;

    /**
     * average home cost, already established, pulled from existing data in DB
     */
    private Double averageHomeCost;

    /**
     * average rent, already established, pulled from existing data in DB
     */
    private Double rent;

    /**
     * cost of living index, already established, pulled from existing data in
     * DB
     */
    private Double costOfLivingIndex;

    /**
     * Default constructor
     */
    public CityAbstract()
    {
    }

    /**
     * Main constructor
     * @param cityId database id of city
     * @param cityName name of city
     * @param stateCode postal code of state of city
     * @param population population of city
     * @param averageHomeCost average home cost of city
     * @param rent average rent of city
     * @param costOfLivingIndex cost of living index of city
     */
    public CityAbstract(long cityId, String cityName, String stateCode,
                        Long population, Double averageHomeCost, Double rent,
                        Double costOfLivingIndex) {
        this.cityId = cityId;
        this.cityName = cityName;
        this.stateCode = stateCode;
        this.population = population;
        this.averageHomeCost = averageHomeCost;
        this.rent = rent;
        this.costOfLivingIndex = costOfLivingIndex;
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

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    public Double getAverageHomeCost() {
        return averageHomeCost;
    }

    public void setAverageHomeCost(Double averageHomeCost) {
        this.averageHomeCost = averageHomeCost;
    }

    public Double getRent() {
        return rent;
    }

    public void setRent(Double rent) {
        this.rent = rent;
    }

    public Double getCostOfLivingIndex() {
        return costOfLivingIndex;
    }

    public void setCostOfLivingIndex(Double costOfLivingIndex) {
        this.costOfLivingIndex = costOfLivingIndex;
    }

    /**
     * Override default toString method
     * @return String representation of object
     */
    @Override
    public String toString()
    {
        return "CityAbstract{" +
            "cityId=" + cityId +
            ", cityName='" + cityName + "'" +
            ", stateCode'" + stateCode + "'" +
            ", population" + population +
            ", averageHomeCost" + averageHomeCost +
            ", rent" + rent +
            ", costOfLivingIndex" + costOfLivingIndex +
            '}';
    }
}
