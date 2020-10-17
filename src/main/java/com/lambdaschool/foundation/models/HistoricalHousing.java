package com.lambdaschool.foundation.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "historicalhousing")
public class HistoricalHousing extends Auditable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long houseid;

    @NotNull
    private int year;

    @NotNull
    private int month;

    @NotNull
    private int housingcost;

    @ManyToOne()
    @JoinColumn(name = "cityid")
    @NotNull
    @JsonIgnoreProperties(value = "historicalaveragehouse")
    private City city;

    public HistoricalHousing()
    {
    }

    public HistoricalHousing(
        @NotNull int year,
        @NotNull int month,
        @NotNull int housingcost,
        @NotNull City city)
    {
        this.year = year;
        this.month = month;
        this.housingcost = housingcost;
        this.city = city;
    }

    public long getHouseid()
    {
        return houseid;
    }

    public void setHouseid(long houseid)
    {
        this.houseid = houseid;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public int getHousingcost()
    {
        return housingcost;
    }

    public void setHousingcost(int housingcost)
    {
        this.housingcost = housingcost;
    }

    public City getCity()
    {
        return city;
    }

    public void setCity(City city)
    {
        this.city = city;
    }

    public int getMonth()
    {
        return month;
    }

    public void setMonth(int month)
    {
        this.month = month;
    }

    @Override
    public String toString()
    {
        return "HistoricalHousing{" +
            "year=" + year +
            ", month=" + month +
            ", housingcost=" + housingcost +
            '}';
    }
}
