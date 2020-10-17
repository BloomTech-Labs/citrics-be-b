package com.lambdaschool.foundation.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "historicalcovid")
public class HistoricalCovid extends Auditable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    private long covidid;

    @NotNull
    private int year;

    @NotNull
    private int month;

    @NotNull
    private int day;

    @NotNull
    private int cases;

    @ManyToOne
    @JoinColumn(name = "cityid")
    @NotNull
    @JsonIgnore
    private City city;

    public HistoricalCovid()
    {
    }

    public HistoricalCovid(
        @NotNull int year,
        @NotNull int month,
        @NotNull int day,
        @NotNull int cases,
        @NotNull City city)
    {
        this.year = year;
        this.month = month;
        this.day = day;
        this.cases = cases;
        this.city = city;
    }

    public long getCovidid()
    {
        return covidid;
    }

    public void setCovidid(long covidid)
    {
        this.covidid = covidid;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public int getMonth()
    {
        return month;
    }

    public void setMonth(int month)
    {
        this.month = month;
    }

    public int getDay()
    {
        return day;
    }

    public void setDay(int day)
    {
        this.day = day;
    }

    public int getCases()
    {
        return cases;
    }

    public void setCases(int cases)
    {
        this.cases = cases;
    }

    public City getCity()
    {
        return city;
    }

    public void setCity(City city)
    {
        this.city = city;
    }

    @Override
    public String toString()
    {
        return "HistoricalCovid{" +
            "year=" + year +
            ", month=" + month +
            ", day=" + day +
            ", cases=" + cases +
            '}';
    }
}
