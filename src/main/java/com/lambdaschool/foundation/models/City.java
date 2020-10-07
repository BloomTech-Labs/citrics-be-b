package com.lambdaschool.foundation.models;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "cities")
public class City extends Auditable
{

    /**
     * Generate City id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long cityid;

    /**
     * The City name (String)
     */
    @NotNull
    private String cityname;

    /**
     *  The City State (String)
     */
    @NotNull
    private  String citystate;

    /**
     *  The City population (double)
     */
    @NotNull
    private double population;

    /**
     *  The City's average age (float)
     */
    private float averageage;

    /**
     *  The City's average income per household (double)
     */
    private double averagehouseholdincome;

    /**
     *  The City's average income per individual (double)
     */
    private double averageindividualincome;

    /**
     *  The City's average cost to buy a house (double)
     */
    private double averagehouseingcost;

    /**
     *  The City's average cost to rent a house (double)
     */
    private double averagerentcost;

    /**
     *  The City's cost of living index (float)
     */
    private float costoflivingindex;

    /**
     * The Default constructor needed by JPA
     */
    public City()
    {
    }

    /**
     * The constructor with the non-nullable fields
     */
    public City(
        long cityid,
        @NotNull String cityname,
        @NotNull String citystate,
        @NotNull double population)
    {
        this.cityid = cityid;
        this.cityname = cityname;
        this.citystate = citystate;
        this.population = population;
    }

    /**
     * The constructor with all fields
     */
    public City(
        long cityid,
        @NotNull String cityname,
        @NotNull String citystate,
        @NotNull double population,
        float averageage,
        double averagehouseholdincome,
        double averageindividualincome,
        double averagehouseingcost,
        double averagerentcost,
        float costoflivingindex)
    {
        this.cityid = cityid;
        this.cityname = cityname;
        this.citystate = citystate;
        this.population = population;
        this.averageage = averageage;
        this.averagehouseholdincome = averagehouseholdincome;
        this.averageindividualincome = averageindividualincome;
        this.averagehouseingcost = averagehouseingcost;
        this.averagerentcost = averagerentcost;
        this.costoflivingindex = costoflivingindex;
    }

    /**
     * Getter for the CityID
     */
    public long getCityid()
    {
        return cityid;
    }

    /**
     * Setter for the CityID
     */
    public void setCityid(long cityid)
    {
        this.cityid = cityid;
    }

    /**
     * Getter for the City name
     */
    public String getCityname()
    {
        return cityname;
    }

    /**
     * Setter for the City name
     */
    public void setCityname(String cityname)
    {
        this.cityname = cityname;
    }

    /**
     * Getter for the City state
     */
    public String getCitystate()
    {
        return citystate;
    }

    /**
     * Setter for the City state
     */
    public void setCitystate(String citystate)
    {
        this.citystate = citystate;
    }

    /**
     * Getter for the City population
     */
    public double getPopulation()
    {
        return population;
    }

    /**
     * Setter for the City population
     */
    public void setPopulation(double population)
    {
        this.population = population;
    }

    /**
     * Getter for the City's average age
     */
    public float getAverageage()
    {
        return averageage;
    }

    /**
     * Setter for the City's average age
     */
    public void setAverageage(float averageage)
    {
        this.averageage = averageage;
    }

    /**
     * Getter for the City's average household income
     */
    public double getAveragehouseholdincome()
    {
        return averagehouseholdincome;
    }

    /**
     * Setter for the City's average household income
     */
    public void setAveragehouseholdincome(double averagehouseholdincome)
    {
        this.averagehouseholdincome = averagehouseholdincome;
    }

    /**
     * Getter for the City's average individual income
     */
    public double getAverageindividualincome()
    {
        return averageindividualincome;
    }

    /**
     * Setter for the City's average individual income
     */
    public void setAverageindividualincome(double averageindividualincome)
    {
        this.averageindividualincome = averageindividualincome;
    }

    /**
     * Getter for the City's average housing cost
     */
    public double getAveragehouseingcost()
    {
        return averagehouseingcost;
    }

    /**
     * Setter for the City's average housing cost
     */
    public void setAveragehouseingcost(double averagehouseingcost)
    {
        this.averagehouseingcost = averagehouseingcost;
    }

    /**
     * Getter for the City's average renting cost
     */
    public double getAveragerentcost()
    {
        return averagerentcost;
    }

    /**
     * Setter for the City's average renting cost
     */
    public void setAveragerentcost(double averagerentcost)
    {
        this.averagerentcost = averagerentcost;
    }

    /**
     * Getter for the City's cost of living index
     */
    public float getCostoflivingindex()
    {
        return costoflivingindex;
    }

    /**
     * Setter for the City's cost of living index
     */
    public void setCostoflivingindex(float costoflivingindex)
    {
        this.costoflivingindex = costoflivingindex;
    }

    /**
     * toString override method
     */
    @Override
    public String toString()
    {
        return super.toString();
    }
}
