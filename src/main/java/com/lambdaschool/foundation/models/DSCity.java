package com.lambdaschool.foundation.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DSCity {
    private String city;
    private int pop;
    private double age;
    private int household;
    private int individual;
    private int house;
    private int rent;
    private double COLI;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPop() {
        return pop;
    }

    public void setPop(int pop) {
        this.pop = pop;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public int getHousehold() {
        return household;
    }

    public void setHousehold(int household) {
        this.household = household;
    }

    public int getIndividual() {
        return individual;
    }

    public void setIndividual(int individual) {
        this.individual = individual;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public double getCOLI() {
        return COLI;
    }

    public void setCOLI(double COLI) {
        this.COLI = COLI;
    }

    @Override
    public String toString() {
        return "DSCity{" +
            "city='" + city + '\'' +
            ", pop=" + pop +
            ", age=" + age +
            ", household=" + household +
            ", individual=" + individual +
            ", house=" + house +
            ", rent=" + rent +
            ", COLI=" + COLI +
            '}';
    }
}
