package com.lambdaschool.foundation.controllers;

import com.lambdaschool.foundation.models.City;
import com.lambdaschool.foundation.models.CityIdName;
import com.lambdaschool.foundation.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cities")
public class CityController
{
    /**
     * Conenction to city services
     */
    @Autowired
    private CityService cityService;

    /**
     *  /all endpont (Not enough memory in free tier of
     *  Heroku to use with fully populated DB. Disabled until
     *  resources are available)
     * @return list of all cities
     */
    @GetMapping(value = "/all",
       produces = "application/json")
    public ResponseEntity<?> listAllCities()
    {
        List<City> cities = cityService.findAll();
        return  new ResponseEntity<>(cities, HttpStatus.OK);
    }

    /**
     * /city/{cityid} endpoint
     * @param id cityid
     * @return city object matching cityid or throws exception
     */
    @GetMapping(value = "/city/{id}", produces = "application/json")
    public ResponseEntity<?> getCityById(@PathVariable Long id)
    {
        City c = cityService.findCityById(id);
        return new ResponseEntity<>(c, HttpStatus.OK);
    }

    /**
     * /allid endpoint
     * @return list of all City name's and id's
     */
    @GetMapping(value = "/allid", produces = "application/json")
    public ResponseEntity<?> listAllCityIds()
    {
        List<CityIdName> myList = cityService.findAllIds();

        return new ResponseEntity<>(myList, HttpStatus.OK);
    }

    /**
     * /avg endpoint
     * @return City with average fields of all cities
     */
    @GetMapping(value = "/avg", produces = "application/json")
    public ResponseEntity<?> getAverageCity()
    {
        City c = cityService.returnAverageCity();

        return new ResponseEntity<>(c,HttpStatus.OK);
    }
}
