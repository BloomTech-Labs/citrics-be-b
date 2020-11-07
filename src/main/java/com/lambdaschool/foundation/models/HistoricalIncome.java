package com.lambdaschool.foundation.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Model for City's historical income data
 */
@Entity
@Table(name = "historical_income")
public class HistoricalIncome extends Auditable
{
    /**
     * Income ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    private long incomeId;

    /**
     * Year of entry
     */
    @NotNull
    private int year;

    /**
     * City's average individual income
     */
    @NotNull
    private int individualIncome;

    /**
     * City's average household income
     */
    @NotNull
    private int householdIncome;

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
    public HistoricalIncome()
    {
    }

    /**
     * Main constructor
     * @param year Year of entry
     * @param individualIncome Average individual income
     * @param householdIncome Average household income
     * @param city City entry belongs to
     */
    public HistoricalIncome(
        @NotNull int year,
        @NotNull int individualIncome,
        @NotNull int householdIncome,
        @NotNull City city)
    {
        this.year = year;
        this.individualIncome = individualIncome;
        this.householdIncome = householdIncome;
        this.city = city;
    }

    /**
     * Getters and setters for HistoricalIncome's fields
     *
     ****************************************************************************************/
    public long getIncomeId()
    {
        return incomeId;
    }

    public void setIncomeId(long incomeId)
    {
        this.incomeId = incomeId;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public int getIndividualIncome()
    {
        return individualIncome;
    }

    public void setIndividualIncome(int income)
    {
        this.individualIncome = income;
    }

    public int getHouseholdIncome()
    {
        return householdIncome;
    }

    public void setHouseholdIncome(int householdIncome)
    {
        this.householdIncome = householdIncome;
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
     * @return String of HistoricalIncome object
     */
    @Override
    public String toString()
    {
        return "HistoricalIncome{" +
            "year=" + year +
            ", individualIncome=" + individualIncome +
            ", householdIncome=" + householdIncome +
            '}';
    }
}
