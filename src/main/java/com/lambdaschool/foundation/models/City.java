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
    private String citynamestate;

    /**
     *  The City population (int)
     */
    private double population;

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
    private double averageage;

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
    private double costoflivingindex;

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
        @NotNull String citynamestate)
    {
        this.citynamestate = citynamestate;
    }

    /**
     * The constructor with all fields
     */
    public City(
        @NotNull String citynamestate,
        int populationdensityrating,
        float averageage,
        double averagehouseholdincome,
        double averageindividualincome,
        double averagehouseingcost,
        double averagerentcost,
        float costoflivingindex)
    {
        this.citynamestate = citynamestate;
        this.populationdensityrating = populationdensityrating;
        this.averageage = averageage;
        this.averagehouseholdincome = averagehouseholdincome;
        this.averageindividualincome = averageindividualincome;
        this.averagehouseingcost = averagehouseingcost;
        this.averagerentcost = averagerentcost;
        this.costoflivingindex = costoflivingindex;
    }

    public City(
        @NotNull String citynamestate,
        int populationdensityrating,
        int safteyratingscore,
        int costoflivingscore,
        double averageincome,
        int averagetemperature,
        float lat,
        float lon)
    {
        this.citynamestate = citynamestate;
        this.populationdensityrating = populationdensityrating;
        this.safteyratingscore = safteyratingscore;
        this.costoflivingscore = costoflivingscore;
        this.averageincome = averageincome;
        this.averagetemperature = averagetemperature;
        this.lat = lat;
        this.lon = lon;
    }

    public City(
        @NotNull String citynamestate,
        double population,
        float averageage,
        double averagehouseholdincome,
        double averageindividualincome,
        double averagehouseingcost,
        double averagerentcost,
        float costoflivingindex
    )
    {
        this.citynamestate = citynamestate;
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
    public String getCitynamestate()
    {
        return citynamestate;
    }

    /**
     * Setter for the City name
     */
    public void setCitynamestate(String citynamestate)
    {
        this.citynamestate = citynamestate;
    }

    public double getPopulation()
    {
        return population;
    }

    public void setPopulation(double population)
    {
        this.population = population;
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
    public double getAverageage()
    {
        return averageage;
    }

    /**
     * Setter for the City's average age
     */
    public void setAverageage(double averageage)
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
    public double getCostoflivingindex()
    {
        return costoflivingindex;
    }

    /**
     * Setter for the City's cost of living index
     */
    public void setCostoflivingindex(double costoflivingindex)
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
        return "City{" +
            "cityid=" + cityid +
            ", citynamestate='" + citynamestate + '\'' +
            ", populationdensityrating=" + populationdensityrating +
            ", safteyratingscore=" + safteyratingscore +
            ", costoflivingscore=" + costoflivingscore +
            ", averageincome=" + averageincome +
            ", averagetemperature=" + averagetemperature +
            ", lat=" + lat +
            ", lon=" + lon +
            ", averageage=" + averageage +
            ", averagehouseholdincome=" + averagehouseholdincome +
            ", averageindividualincome=" + averageindividualincome +
            ", averagehouseingcost=" + averagehouseingcost +
            ", averagerentcost=" + averagerentcost +
            ", costoflivingindex=" + costoflivingindex +
            ", users=" + users +
            '}';
    }
}
