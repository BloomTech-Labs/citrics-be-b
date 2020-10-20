package com.lambdaschool.foundation.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DSHistoricalPop
{
//    private String city;

//    @JsonProperty("POP_2010_census")
    private float POP_2010_census;

//    @JsonProperty("POP_2011_est")
    private float POP_2011_est;

//    @JsonProperty("POP_2012_est")
    private float POP_2012_est;

//    @JsonProperty("POP_2013_est")
    private float POP_2013_est;

//    @JsonProperty("POP_2014_est")
    private float POP_2014_est;

//    @JsonProperty("POP_2015_est")
    private float POP_2015_est;

//    @JsonProperty("POP_2016_est")
    private float POP_2016_est;

//    @JsonProperty("POP_2017_est")
    private float POP_2017_est;

//    @JsonProperty("POP_2018_est")
    private float POP_2018_est;

//    @JsonProperty("POP_2019_est")
    private float POP_2019_est;

    public DSHistoricalPop()
    {
    }

//    public String getCity()
//    {
//        return city;
//    }
//
//    public void setCity(String city)
//    {
//        this.city = city;
//    }

    public float getPOP_2010_census()
    {
        return POP_2010_census;
    }

    public void setPOP_2010_census(float POP_2010_census)
    {
        this.POP_2010_census = POP_2010_census;
    }

    public float getPOP_2011_est()
    {
        return POP_2011_est;
    }

    public void setPOP_2011_est(float POP_2011_est)
    {
        this.POP_2011_est = POP_2011_est;
    }

    public float getPOP_2012_est()
    {
        return POP_2012_est;
    }

    public void setPOP_2012_est(float POP_2012_est)
    {
        this.POP_2012_est = POP_2012_est;
    }

    public float getPOP_2013_est()
    {
        return POP_2013_est;
    }

    public void setPOP_2013_est(float POP_2013_est)
    {
        this.POP_2013_est = POP_2013_est;
    }

    public float getPOP_2014_est()
    {
        return POP_2014_est;
    }

    public void setPOP_2014_est(float POP_2014_est)
    {
        this.POP_2014_est = POP_2014_est;
    }

    public float getPOP_2015_est()
    {
        return POP_2015_est;
    }

    public void setPOP_2015_est(float POP_2015_est)
    {
        this.POP_2015_est = POP_2015_est;
    }

    public float getPOP_2016_est()
    {
        return POP_2016_est;
    }

    public void setPOP_2016_est(float POP_2016_est)
    {
        this.POP_2016_est = POP_2016_est;
    }

    public float getPOP_2017_est()
    {
        return POP_2017_est;
    }

    public void setPOP_2017_est(float POP_2017_est)
    {
        this.POP_2017_est = POP_2017_est;
    }

    public float getPOP_2018_est()
    {
        return POP_2018_est;
    }

    public void setPOP_2018_est(float POP_2018_est)
    {
        this.POP_2018_est = POP_2018_est;
    }

    public float getPOP_2019_est()
    {
        return POP_2019_est;
    }

    public void setPOP_2019_est(float POP_2019_est)
    {
        this.POP_2019_est = POP_2019_est;
    }

    @Override
    public String toString()
    {
        return "DSHistoricalPop{" +
//            "city='" + city + '\'' +
            ", POP_2010_census=" + POP_2010_census +
            ", POP_2011_est=" + POP_2011_est +
            ", POP_2012_est=" + POP_2012_est +
            ", POP_2013_est=" + POP_2013_est +
            ", POP_2014_est=" + POP_2014_est +
            ", POP_2015_est=" + POP_2015_est +
            ", POP_2016_est=" + POP_2016_est +
            ", POP_2017_est=" + POP_2017_est +
            ", POP_2018_est=" + POP_2018_est +
            ", POP_2019_est=" + POP_2019_est +
            '}';
    }
}
