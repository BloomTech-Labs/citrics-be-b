package com.lambdaschool.foundation.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "historicalweather")
public class HistoricalWeather extends Auditable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long weatherid;

    @NotNull
    private String month;

    @NotNull
    private Double precipitation;

    @NotNull
    private Double temperature;

    @ManyToOne
    @JoinColumn(name = "cityid")
    @NotNull
    @JsonIgnoreProperties(value = "historicalweather")
    private City city;

    public HistoricalWeather()
    {
    }

    public HistoricalWeather(
        @NotNull String month,
        @NotNull Double precipitation,
        @NotNull Double temperature,
        @NotNull City city)
    {
        this.month = month;
        this.precipitation = precipitation;
        this.temperature = temperature;
        this.city = city;
    }

    public long getWeatherid()
    {
        return weatherid;
    }

    public void setWeatherid(long weatherid)
    {
        this.weatherid = weatherid;
    }

    public String getMonth()
    {
        return month;
    }

    public void setMonth(String month)
    {
        this.month = month;
    }

    public Double getPrecipitation()
    {
        return precipitation;
    }

    public void setPrecipitation(Double precipitation)
    {
        this.precipitation = precipitation;
    }

    public Double getTemperature()
    {
        return temperature;
    }

    public void setTemperature(Double temperature)
    {
        this.temperature = temperature;
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
        return "HistoricalWeather{" +
            "month='" + month + '\'' +
            ", precipitation=" + precipitation +
            ", temperature=" + temperature +
            '}';
    }
}
