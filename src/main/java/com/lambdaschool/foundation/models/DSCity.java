package com.lambdaschool.foundation.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DSCity {

    private String city;
    private String statename;
    private String abbrev;
    private String ziplist;
    private String timezone;
    private String counties;
    private Double latitude;
    private Double longitude;
    private String FIPS;
    private String GNIS;
    private String wiki_img_url;
    private String website;
    private Double pop;
    private Double density_mi_sq;
    private Double density_km_sq;
    private String pop_hist;
    private Double age;
    private Double household;
    private Double individual;
    private String income_hist;
    private Double house;
    private String home_hist;
    private Double rent;
    private Double COLI;
    private String ACA_status;
    private String weather_hist;
    private String jhcovid;

    public DSCity()
    {
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getStatename()
    {
        return statename;
    }

    public void setStatename(String statename)
    {
        this.statename = statename;
    }

    public String getAbbrev()
    {
        return abbrev;
    }

    public void setAbbrev(String abbrev)
    {
        this.abbrev = abbrev;
    }

    public String getZiplist()
    {
        return ziplist;
    }

    public void setZiplist(String ziplist)
    {
        this.ziplist = ziplist;
    }

    public String getTimezone()
    {
        return timezone;
    }

    public void setTimezone(String timezone)
    {
        this.timezone = timezone;
    }

    public String getCounties()
    {
        return counties;
    }

    public void setCounties(String counties)
    {
        this.counties = counties;
    }

    public Double getLatitude()
    {
        return latitude;
    }

    public void setLatitude(Double latitude)
    {
        this.latitude = latitude;
    }

    public Double getLongitude()
    {
        return longitude;
    }

    public void setLongitude(Double longitude)
    {
        this.longitude = longitude;
    }

    public String getFIPS()
    {
        return FIPS;
    }

    public void setFIPS(String FIPS)
    {
        this.FIPS = FIPS;
    }

    public String getGNIS()
    {
        return GNIS;
    }

    public void setGNIS(String GNIS)
    {
        this.GNIS = GNIS;
    }

    public String getWiki_img_url()
    {
        return wiki_img_url;
    }

    public void setWiki_img_url(String wiki_img_url)
    {
        this.wiki_img_url = wiki_img_url;
    }

    public String getWebsite()
    {
        return website;
    }

    public void setWebsite(String website)
    {
        this.website = website;
    }

    public Double getPop()
    {
        return pop;
    }

    public void setPop(Double pop)
    {
        this.pop = pop;
    }

    public Double getDensity_mi_sq()
    {
        return density_mi_sq;
    }

    public void setDensity_mi_sq(Double density_mi_sq)
    {
        this.density_mi_sq = density_mi_sq;
    }

    public Double getDensity_km_sq()
    {
        return density_km_sq;
    }

    public void setDensity_km_sq(Double density_km_sq)
    {
        this.density_km_sq = density_km_sq;
    }

    public String getPop_hist()
    {
        return pop_hist;
    }

    public void setPop_hist(String pop_hist)
    {
        this.pop_hist = pop_hist;
    }

    public Double getAge()
    {
        return age;
    }

    public void setAge(Double age)
    {
        this.age = age;
    }

    public Double getHousehold()
    {
        return household;
    }

    public void setHousehold(Double household)
    {
        this.household = household;
    }

    public Double getIndividual()
    {
        return individual;
    }

    public void setIndividual(Double individual)
    {
        this.individual = individual;
    }

    public String getIncome_hist()
    {
        return income_hist;
    }

    public void setIncome_hist(String income_hist)
    {
        this.income_hist = income_hist;
    }

    public Double getHouse()
    {
        return house;
    }

    public void setHouse(Double house)
    {
        this.house = house;
    }

    public String getHome_hist()
    {
        return home_hist;
    }

    public void setHome_hist(String home_hist)
    {
        this.home_hist = home_hist;
    }

    public Double getRent()
    {
        return rent;
    }

    public void setRent(Double rent)
    {
        this.rent = rent;
    }

    public Double getCOLI()
    {
        return COLI;
    }

    public void setCOLI(Double COLI)
    {
        this.COLI = COLI;
    }

    public String getACA_status()
    {
        return ACA_status;
    }

    public void setACA_status(String ACA_status)
    {
        this.ACA_status = ACA_status;
    }

    public String getWeather_hist()
    {
        return weather_hist;
    }

    public void setWeather_hist(String weather_hist)
    {
        this.weather_hist = weather_hist;
    }

    public String getJhcovid()
    {
        return jhcovid;
    }

    public void setJhcovid(String jhcovid)
    {
        this.jhcovid = jhcovid;
    }

    @Override
    public String toString()
    {
        return "DSCity{" +
            "city='" + city + '\'' +
            ", statename='" + statename + '\'' +
            ", abbrev='" + abbrev + '\'' +
            ", ziplist='" + ziplist + '\'' +
            ", timezone='" + timezone + '\'' +
            ", counties='" + counties + '\'' +
            ", latitude=" + latitude +
            ", longitude=" + longitude +
            ", FIPS='" + FIPS + '\'' +
            ", GNIS='" + GNIS + '\'' +
            ", wiki_img_url='" + wiki_img_url + '\'' +
            ", website='" + website + '\'' +
            ", pop=" + pop +
            ", density_mi_sq=" + density_mi_sq +
            ", density_km_sq=" + density_km_sq +
            ", pop_hist='" + pop_hist + '\'' +
            ", age=" + age +
            ", household=" + household +
            ", individual=" + individual +
            ", income_hist='" + income_hist + '\'' +
            ", house=" + house +
            ", home_hist='" + home_hist + '\'' +
            ", rent=" + rent +
            ", COLI=" + COLI +
            ", ACA_status='" + ACA_status + '\'' +
            ", weather_hist='" + weather_hist + '\'' +
            '}';
    }
}
