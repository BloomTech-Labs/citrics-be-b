package com.lambdaschool.foundation.services;

import com.lambdaschool.foundation.exceptions.ResourceNotFoundException;
import com.lambdaschool.foundation.models.City;
import com.lambdaschool.foundation.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "cityService")
public class CityServiceImpl implements CityService
{
    @Autowired
    private CityRepository cityrepo;

    public List<City> findAll()
    {
        List<City> list = new ArrayList<>();

        cityrepo.findAll()
            .iterator()
            .forEachRemaining(list::add);

        return list;
    }

    public City findCityById(long id) throws ResourceNotFoundException
    {
        return cityrepo.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("City id " + id + " not found!"));
    }

    @Transactional
    public City save(City city)
    {
        City newCity = new City();

        if(city.getCityid() != 0)
        {
            cityrepo.findById(city.getCityid()).orElseThrow(() -> new ResourceNotFoundException("City id " + city.getCityid() + " not found!"));
            newCity.setCityid(city.getCityid());
        }

        newCity.setCityname(city.getCityname());
        newCity.setCitystate(city.getCitystate());
        newCity.setPopulationdensityrating(city.getPopulationdensityrating());
        newCity.setSafteyratingscore(city.getSafteyratingscore());
        newCity.setCostoflivingscore(city.getCostoflivingscore());
        newCity.setAverageincome(city.getAverageincome());
        newCity.setAveragetemperature(city.getAveragetemperature());
        newCity.setLat(city.getLat());
        newCity.setLon(city.getLon());

        return cityrepo.save(newCity);
    }
}
