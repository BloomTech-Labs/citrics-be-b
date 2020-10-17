package com.lambdaschool.foundation.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "zipcodes")
public class Zipcode extends Auditable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long zipid;

    @NotNull
    private String code;

    @ManyToOne
    @JoinColumn(name = "cityid")
    @NotNull
    @JsonIgnoreProperties(value = "zipcodes")
    private City city;

    public Zipcode()
    {
    }

    public Zipcode(
        @NotNull String code,
        @NotNull City city)
    {
        this.code = code;
        this.city = city;
    }

    public long getZipid()
    {
        return zipid;
    }

    public void setZipid(long zipid)
    {
        this.zipid = zipid;
    }

    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
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
        return "Zipcode{" +
            "code='" + code + '\'' +
            '}';
    }
}
