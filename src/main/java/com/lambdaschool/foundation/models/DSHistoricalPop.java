package com.lambdaschool.foundation.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DSHistoricalPop
{
    /**
     * This model is used to parse the historical
     * data coming in from the DS API
     */

    @JsonProperty("POP_2010_census")
    private float sPOP_2010_census;

    @JsonProperty("POP_2011_est")
    private float sPOP_2011_est;

    @JsonProperty("POP_2012_est")
    private float sPOP_2012_est;

    @JsonProperty("POP_2013_est")
    private float sPOP_2013_est;

    @JsonProperty("POP_2014_est")
    private float sPOP_2014_est;

    @JsonProperty("POP_2015_est")
    private float sPOP_2015_est;

    @JsonProperty("POP_2016_est")
    private float sPOP_2016_est;

    @JsonProperty("POP_2017_est")
    private float sPOP_2017_est;

    @JsonProperty("POP_2018_est")
    private float sPOP_2018_est;

    @JsonProperty("POP_2019_est")
    private float sPOP_2019_est;

    public DSHistoricalPop()
    {
    }

    public float getsPOP_2010_census()
    {
        return sPOP_2010_census;
    }

    public void setsPOP_2010_census(float sPOP_2010_census)
    {
        this.sPOP_2010_census = sPOP_2010_census;
    }

    public float getsPOP_2011_est()
    {
        return sPOP_2011_est;
    }

    public void setsPOP_2011_est(float sPOP_2011_est)
    {
        this.sPOP_2011_est = sPOP_2011_est;
    }

    public float getsPOP_2012_est()
    {
        return sPOP_2012_est;
    }

    public void setsPOP_2012_est(float sPOP_2012_est)
    {
        this.sPOP_2012_est = sPOP_2012_est;
    }

    public float getsPOP_2013_est()
    {
        return sPOP_2013_est;
    }

    public void setsPOP_2013_est(float sPOP_2013_est)
    {
        this.sPOP_2013_est = sPOP_2013_est;
    }

    public float getsPOP_2014_est()
    {
        return sPOP_2014_est;
    }

    public void setsPOP_2014_est(float sPOP_2014_est)
    {
        this.sPOP_2014_est = sPOP_2014_est;
    }

    public float getsPOP_2015_est()
    {
        return sPOP_2015_est;
    }

    public void setsPOP_2015_est(float sPOP_2015_est)
    {
        this.sPOP_2015_est = sPOP_2015_est;
    }

    public float getsPOP_2016_est()
    {
        return sPOP_2016_est;
    }

    public void setsPOP_2016_est(float sPOP_2016_est)
    {
        this.sPOP_2016_est = sPOP_2016_est;
    }

    public float getsPOP_2017_est()
    {
        return sPOP_2017_est;
    }

    public void setsPOP_2017_est(float sPOP_2017_est)
    {
        this.sPOP_2017_est = sPOP_2017_est;
    }

    public float getsPOP_2018_est()
    {
        return sPOP_2018_est;
    }

    public void setsPOP_2018_est(float sPOP_2018_est)
    {
        this.sPOP_2018_est = sPOP_2018_est;
    }

    public float getsPOP_2019_est()
    {
        return sPOP_2019_est;
    }

    public void setsPOP_2019_est(float sPOP_2019_est)
    {
        this.sPOP_2019_est = sPOP_2019_est;
    }

    @Override
    public String toString()
    {
        return "DSHistoricalPop{" +
            "sPOP_2010_census=" + sPOP_2010_census +
            ", sPOP_2011_est=" + sPOP_2011_est +
            ", sPOP_2012_est=" + sPOP_2012_est +
            ", sPOP_2013_est=" + sPOP_2013_est +
            ", sPOP_2014_est=" + sPOP_2014_est +
            ", sPOP_2015_est=" + sPOP_2015_est +
            ", sPOP_2016_est=" + sPOP_2016_est +
            ", sPOP_2017_est=" + sPOP_2017_est +
            ", sPOP_2018_est=" + sPOP_2018_est +
            ", sPOP_2019_est=" + sPOP_2019_est +
            '}';
    }
}
