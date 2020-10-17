package com.lambdaschool.foundation.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "counties")
public class County extends Auditable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    private long countyid;

    @NotNull
    private String name;

    @ManyToOne
    @JoinColumn(name = "cityid")
    @NotNull
    @JsonIgnore
    private City city;

    public County()
    {
    }

    public County(
        @NotNull String name,
        @NotNull City city)
    {
        this.name = name;
        this.city = city;
    }

    public long getCountyid()
    {
        return countyid;
    }

    public void setCountyid(long countyid)
    {
        this.countyid = countyid;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
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
        return "County{" +
            "name='" + name + '\'' +
            '}';
    }
}
