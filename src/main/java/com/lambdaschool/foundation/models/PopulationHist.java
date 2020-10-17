package com.lambdaschool.foundation.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "populationhist")
public class PopulationHist extends Auditable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long popid;

    @NotNull
    private int year;

    @NotNull
    private double pop;

    @ManyToOne
    @JoinColumn(name = "cityid")
    @NotNull
    @JsonIgnoreProperties(value = "populationhist")
    private City city;

    public PopulationHist()
    {
    }

    public PopulationHist(
        @NotNull int year,
        @NotNull double pop,
        @NotNull City city)
    {
        this.year = year;
        this.pop = pop;
        this.city = city;
    }

    public long getPopid()
    {
        return popid;
    }

    public void setPopid(long popid)
    {
        this.popid = popid;
    }

    public double getPop()
    {
        return pop;
    }

    public void setPop(double pop)
    {
        this.pop = pop;
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
        return "PopulationHist{" +
            "year=" + year +
            ", pop=" + pop +
            '}';
    }
}
