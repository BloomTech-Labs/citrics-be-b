package com.lambdaschool.foundation.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "cities")
public class City extends Auditable
{
    /**
     * Generated City id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long cityId;

    /**
     * The City name (String)
     */
    @NotNull
    private String cityName;

    /**
     * The two letter state abbreviation
     */
    @NotNull
    private String stateCode;

    /**
     * City's Timezone
     */
    private String timezone;

    /**
     * City's latitude
     */
    private Double latitude;

    /**
     * City's longitude
     */
    private Double longitude;

    /**
     * City's FPIS
     */
    private String fpis;

    /**
     * City's GNIS
     */
    private String gnis;

    /**
     * City's wiki image url
     */
    // @Column(columnDefinition = "TEXT")
    private String imageUrl;

    /**
     * City's website
     */
    private String website;

    /**
     * City's average population
     */
    private Double population;

    /**
     * City's population density per square mile
     */
    private Double densitymisq;

    /**
     * City's population density per square kilometer
     */
    private Double populationDensity;

    /**
     * City's average age
     */
    private Double averageAge;

    /**
     * City's average household income
     */
    private Double householdIncome;

    /**
     * City's average individual income
     */
    private Double individualIncome;

    /**
     * City's average home cost
     */
    private Double averageHomeCost;

    /**
     * City's average rent cost
     */
    private Double rent;

    /**
     * City's average cost of living index
     */
    private Double costOfLivingIndex;

    /**
     * City's current ACA status
     */
    private String acaStatus;

    /**
     * City's average temp
     * calculated from the historical weather data
     */
    private Double averageTemperature;

    /**
     * City's average precipitation
     * calculated from historical weather data
     */
    private Double averagePrecipitation;

    /**
     * City's average new covid-19 cases
     * calculated from the historical covid data
     */
    private Double averageNewCovidCases;

    /**
     * List of City's zipcodes
     */
    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Zipcode> zipcodes = new ArrayList<>();

    /**
     * List of City's counties
     */
    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL)
    private List<County> counties = new ArrayList<>();

    /**
     * List of historical population data
     */
    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PopulationHistory> populationHistory = new ArrayList<>();

    /**
     * List of historical income data
     */
    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<HistoricalIncome> historicalIncome = new ArrayList<>();

    /**
     * List of historical housing cost
     */
    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<HistoricalHomeCost> historicalHomeCost = new ArrayList<>();

    /**
     * List of reported Covid-19 cases
     */
    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<HistoricalCovid> historicalCovid = new ArrayList<>();

    /**
     * List of historical weather data
     */
    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<HistoricalWeather> historicalWeather = new ArrayList<>();

    /**
     * List of User's who have favorited the city
     */
    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private Set<UserCities> users = new HashSet<>();

    /**
     * The Default constructor needed by JPA
     */
    public City()
    {
    }

    /**
     * The constructor with the non-nullable fields
     */
    public City(
        @NotNull String cityName)
    {
        this.cityName = cityName;
    }

    /**
     * Getters and setters for the City's fields
     *
     **************************************************************************/



    public long getCityId()
    {
        return cityId;
    }


    public void setCityId(long cityId)
    {
        this.cityId = cityId;
    }

    public String getCityName()
    {
        return cityName;
    }

    public void setCityName(String cityName)
    {
        this.cityName = cityName;
    }

    public String getStateCode()
    {
        return stateCode;
    }

    public void setStateCode(String stateCode)
    {
        this.stateCode = stateCode;
    }

    public String getTimezone()
    {
        return timezone;
    }

    public void setTimezone(String timezone)
    {
        this.timezone = timezone;
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

    public String getFpis()
    {
        return fpis;
    }

    public void setFpis(String fpis)
    {
        this.fpis = fpis;
    }

    public String getGnis()
    {
        return gnis;
    }

    public void setGnis(String gnis)
    {
        this.gnis = gnis;
    }

    public String getImageUrl()
    {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl)
    {
        this.imageUrl = imageUrl;
    }

    public String getWebsite()
    {
        return website;
    }

    public void setWebsite(String website)
    {
        this.website = website;
    }

    public Double getPopulation()
    {
        return population;
    }

    public void setPopulation(Double population)
    {
        this.population = population;
    }

    public Double getPopulationDensity()
    {
        return populationDensity;
    }

    public void setPopulationDensity(Double populationDensity)
    {
        this.populationDensity = populationDensity;
    }

    // TODO functions to return density per square mile and kilometer

    public Double getAverageAge()
    {
        return averageAge;
    }

    public void setAverageAge(Double averageAge)
    {
        this.averageAge = averageAge;
    }

    public Double getHouseholdIncome()
    {
        return householdIncome;
    }

    public void setHouseholdIncome(Double householdIncome)
    {
        this.householdIncome = householdIncome;
    }

    public Double getIndividualIncome()
    {
        return individualIncome;
    }

    public void setIndividualIncome(Double individualIncome)
    {
        this.individualIncome = individualIncome;
    }

    public Double getAverageHomeCost()
    {
        return averageHomeCost;
    }

    public void setAverageHomeCost(Double averageHomeCost)
    {
        this.averageHomeCost = averageHomeCost;
    }

    public Double getRent()
    {
        return rent;
    }

    public void setRent(Double rent)
    {
        this.rent = rent;
    }

    public Double getCostOfLivingIndex()
    {
        return costOfLivingIndex;
    }

    public void setCostOfLivingIndex(Double costOfLivingIndex)
    {
        this.costOfLivingIndex = costOfLivingIndex;
    }

    public String getAcaStatus()
    {
        return acaStatus;
    }

    public void setAcaStatus(String acaStatus)
    {
        this.acaStatus = acaStatus;
    }

    public List<Zipcode> getZipcodes()
    {
        return zipcodes;
    }

    public void setZipcodes(List<Zipcode> zipcodes)
    {
        this.zipcodes = zipcodes;
    }

    public List<PopulationHistory> getPopulationHistory()
    {
        return populationHistory;
    }

    public void setPopulationHistory(List<PopulationHistory> populationHistory)
    {
        this.populationHistory = populationHistory;
    }

    public List<HistoricalIncome> getHistoricalIncome()
    {
        return historicalIncome;
    }

    public void setHistoricalIncome(List<HistoricalIncome> historicalIncome)
    {
        this.historicalIncome = historicalIncome;
    }

    public List<HistoricalHomeCost> getHistoricalHomeCost()
    {
        return historicalHomeCost;
    }

    public void setHistoricalHomeCost(List<HistoricalHomeCost> historicalHomeCost)
    {
        this.historicalHomeCost = historicalHomeCost;
    }

    public List<HistoricalCovid> getHistoricalCovid()
    {
        return historicalCovid;
    }

    public void setHistoricalCovid(List<HistoricalCovid> covid)
    {
        this.historicalCovid = covid;
    }

    public List<HistoricalWeather> getHistoricalWeather()
    {
        return historicalWeather;
    }

    public void setHistoricalWeather(List<HistoricalWeather> historicalWeather)
    {
        this.historicalWeather = historicalWeather;
    }

    public Set<UserCities> getUsers()
    {
        return users;
    }

    public void setUsers(Set<UserCities> users)
    {
        this.users = users;
    }

    public Double getAverageTemperature()
    {
        return averageTemperature;
    }

    public void setAverageTemperature(Double averageTemperature)
    {
        this.averageTemperature = averageTemperature;
    }

    public Double getAveragePrecipitation()
    {
        return averagePrecipitation;
    }

    public void setAveragePrecipitation(Double averagePrecipitation)
    {
        this.averagePrecipitation = averagePrecipitation;
    }

    public Double getAverageNewCovidCases()
    {
        return averageNewCovidCases;
    }

    public void setAverageNewCovidCases(Double averageNewCovidCases)
    {
        this.averageNewCovidCases = averageNewCovidCases;
    }

    /**
     * Override default toString()
     * @return string of City object
     */
    @Override
    public String toString()
    {
        return "City{" +
            "cityId=" + cityId +
            ", cityName='" + cityName + '\'' +
            ", stateCode='" + stateCode + '\'' +
            ", timezone='" + timezone + '\'' +
            ", latitude=" + latitude +
            ", longitude=" + longitude +
            ", fpis='" + fpis + '\'' +
            ", gnis='" + gnis + '\'' +
            ", imageUrl='" + imageUrl + '\'' +
            ", website='" + website + '\'' +
            ", population=" + population +
            ", populationDensity=" + populationDensity +
            ", averageAge=" + averageAge +
            ", householdIncome=" + householdIncome +
            ", individualIncome=" + individualIncome +
            ", averageHomeCost=" + averageHomeCost +
            ", rent=" + rent +
            ", costOfLivingIndex=" + costOfLivingIndex +
            ", acaStatus='" + acaStatus + '\'' +
            ", averageTemperature=" + averageTemperature +
            ", averagePrecipitation=" + averagePrecipitation +
            ", averageNewCovidCases=" + averageNewCovidCases +
            ", zipcodes=" + zipcodes +
            ", populationHistory=" + populationHistory +
            ", historicalIncome=" + historicalIncome +
            ", historicalHomeCost=" + historicalHomeCost +
            ", covid=" + historicalCovid +
            ", historicalWeather=" + historicalWeather +
            ", users=" + users +
            '}';
    }
}
