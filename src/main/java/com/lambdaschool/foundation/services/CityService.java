package com.lambdaschool.foundation.services;

import com.lambdaschool.foundation.models.City;

import java.util.List;

public interface CityService
{
    List<City> findAll();

    City findCityById(long id);

    City save(City city);
}
