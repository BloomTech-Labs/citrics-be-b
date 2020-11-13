package com.lambdaschool.foundation.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "population_history")
public class PopulationHistory extends Auditable
{
    /**
     * Model for City's historical population data
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    private long populationId;

    /**
     * Year of entry
     */
    @NotNull
    private int year;

    /**
     * City's average population
     */
    private long population;

    /**
     * City entry belongs to
     */
    @ManyToOne
    @JoinColumn(name = "city_id")
    @NotNull
    @JsonIgnore
    private City city;

    /**
     * Default constructor
     */
    public PopulationHistory()
    {
    }

    /**
     * Main constructor
     * @param year Year of entry
     * @param population Average population
     * @param city City entry belongs to
     */
    public PopulationHistory(
            @NotNull int year,
            long population,
            @NotNull City city)
    {
        this.year = year;
        this.population = population;
        this.city = city;
    }

    /**
     * Getters and setters for PopulationHistory's fields
     *
     **********************************************************************************************/
    public long getPopulationId()
    {
        return populationId;
    }

    public void setPopulationId(long populationId)
    {
        this.populationId = populationId;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public long getPopulation()
    {
        return population;
    }

    public void setPopulation(long pop)
    {
        this.population = pop;
    }

    public City getCity()
    {
        return city;
    }

    public void setCity(City city)
    {
        this.city = city;
    }

    /**
     * Override default toString()
     * @return String of PopulationHistory object
     */
    @Override
    public String toString()
    {
        return "PopulationHistory{" +
            "year=" + year +
            ", population=" + population +
            '}';
    }
}
