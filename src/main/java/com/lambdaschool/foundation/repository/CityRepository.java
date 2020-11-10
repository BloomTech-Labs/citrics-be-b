package com.lambdaschool.foundation.repository;

import com.lambdaschool.foundation.models.City;
import org.springframework.data.repository.CrudRepository;

public interface CityRepository extends CrudRepository<City, Long>
{
    /**
     * Finds city by the cityName field
     * @param cityName name of city
     * @return City matching cityName
     */
    City findByCityName(String cityName);
}
