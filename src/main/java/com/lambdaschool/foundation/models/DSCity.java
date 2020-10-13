package com.lambdaschool.foundation.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DSCity {
    private String city;
    private double population;
    private double median_age;
    private double median_household_income;
    private double median_individual_income;
    private double median_home_cost;
    private double median_rent;
    private double Cost_of_Living_Index = 55.5;


    public DSCity()
    {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public double getMedian_age() {
        return median_age;
    }

    public void setMedian_age(double median_age) {
        this.median_age = median_age;
    }

    public double getMedian_household_income() {
        return median_household_income;
    }

    public void setMedian_household_income(double median_household_income) {
        this.median_household_income = median_household_income;
    }

    public double getMedian_individual_income() {
        return median_individual_income;
    }

    public void setMedian_individual_income(double median_individual_income) {
        this.median_individual_income = median_individual_income;
    }

    public double getMedian_home_cost() {
        return median_home_cost;
    }

    public void setMedian_home_cost(double median_home_cost) {
        this.median_home_cost = median_home_cost;
    }

    public double getMedian_rent() {
        return median_rent;
    }

    public void setMedian_rent(double median_rent) {
        this.median_rent = median_rent;
    }

    public double getCost_of_Living_Index() {
        return Cost_of_Living_Index;
    }

    public void setCost_of_Living_Index(float cost_of_Living_Index) {
        this.Cost_of_Living_Index = cost_of_Living_Index;
    }

    @Override
    public String toString()
    {
        return "DSCity{" +
            "city='" + city + '\'' +
            ", population=" + population +
            ", median_age=" + median_age +
            ", median_household_income=" + median_household_income +
            ", median_individual_income=" + median_individual_income +
            ", median_home_cost=" + median_home_cost +
            ", median_rent=" + median_rent +
            ", Cost_of_Living_Index=" + Cost_of_Living_Index +
            '}';
    }
}
