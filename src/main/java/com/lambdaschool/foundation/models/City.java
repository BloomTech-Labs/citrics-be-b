package com.lambdaschool.foundation.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

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
     *  The City population (int)
     */
    private int populationdensityrating;


    private int safteyratingscore;

    private int costoflivingscore;

    private double averageincome;

    private int averagetemperature;

    private float lat;

    private float lon;



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

    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnoreProperties(value = "city")
    private Set<UserCities> users = new HashSet<>();

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
        @NotNull String cityname,
        @NotNull String citystate)
    {
        this.cityname = cityname;
        this.citystate = citystate;
        this.populationdensityrating = populationdensityrating;
    }

    /**
     * The constructor with all fields
     */
    public City(
        @NotNull String cityname,
        @NotNull String citystate,
        int populationdensityrating,
        float averageage,
        double averagehouseholdincome,
        double averageindividualincome,
        double averagehouseingcost,
        double averagerentcost,
        float costoflivingindex)
    {
        this.cityname = cityname;
        this.citystate = citystate;
        this.populationdensityrating = populationdensityrating;
        this.averageage = averageage;
        this.averagehouseholdincome = averagehouseholdincome;
        this.averageindividualincome = averageindividualincome;
        this.averagehouseingcost = averagehouseingcost;
        this.averagerentcost = averagerentcost;
        this.costoflivingindex = costoflivingindex;
    }

    public City(
        @NotNull String cityname,
        @NotNull String citystate,
        int populationdensityrating,
        int safteyratingscore,
        int costoflivingscore,
        double averageincome,
        int averagetemperature,
        float lat,
        float lon)
    {
        this.cityname = cityname;
        this.citystate = citystate;
        this.populationdensityrating = populationdensityrating;
        this.safteyratingscore = safteyratingscore;
        this.costoflivingscore = costoflivingscore;
        this.averageincome = averageincome;
        this.averagetemperature = averagetemperature;
        this.lat = lat;
        this.lon = lon;
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
    public int getPopulationdensityrating()
    {
        return populationdensityrating;
    }

    /**
     * Setter for the City population
     */
    public void setPopulationdensityrating(int population)
    {
        this.populationdensityrating = population;
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

    public Set<UserCities> getUsers()
    {
        return users;
    }

    public void setUsers(Set<UserCities> users)
    {
        this.users = users;
    }

    public int getSafteyratingscore()
    {
        return safteyratingscore;
    }

    public void setSafteyratingscore(int safteyratingscore)
    {
        this.safteyratingscore = safteyratingscore;
    }

    public int getCostoflivingscore()
    {
        return costoflivingscore;
    }

    public void setCostoflivingscore(int costoflivingscore)
    {
        this.costoflivingscore = costoflivingscore;
    }

    public double getAverageincome()
    {
        return averageincome;
    }

    public void setAverageincome(double averageincome)
    {
        this.averageincome = averageincome;
    }

    public int getAveragetemperature()
    {
        return averagetemperature;
    }

    public void setAveragetemperature(int averagetemperature)
    {
        this.averagetemperature = averagetemperature;
    }

    public float getLat()
    {
        return lat;
    }

    public void setLat(float lat)
    {
        this.lat = lat;
    }

    public float getLon()
    {
        return lon;
    }

    public void setLon(float lon)
    {
        this.lon = lon;
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
