package com.lambdaschool.foundation.services;

import com.lambdaschool.foundation.models.City;
import com.lambdaschool.foundation.models.CityAbstract;
import com.lambdaschool.foundation.models.DSCity;
import com.lambdaschool.foundation.models.User;

import java.util.List;

public interface CityService
{
    /**
     * Find all cities
     * @return list of cities
     */
    List<City> findAll();

    /**
     * Finds city by cityid
     * @param id cityid
     * @return City matching id
     */
    City findCityById(long id);

    /**
     * Saves new city
     * @param city new city to be saved
     * @return newly saved City
     */
    City save(City city);

    /**
     * Saves new city from DS API schema
     * @param city new city to be saved
     * @return newly saved city
     */
    City saveDs(DSCity city) throws Exception;

    /**
     * Finds city by cityName field
     * @param name cityName
     * @return City object matching name
     */
    City findByCityName(String name);

    /**
     * Finds all cities ids and names
     * @return List of city id and names
     */
    List<CityAbstract> findAllIds();

    /**
     * Finds the average value for all fields in cities excluding the historical data
     * @return a City object with the average of all city fields in the DB
     */
    City findAverageCity();

    /**
     * Finds the average city object stored in DB
     * @return
     */
    City returnAverageCity();

    /**
     * Saves city to current users fav cities list
     * @param id cityid of city to be saved
     * @param user user extracted by controller
     */
    void saveFavCity(long id, User user);
}
