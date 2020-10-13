package com.lambdaschool.foundation.controllers;

import com.lambdaschool.foundation.models.City;
import com.lambdaschool.foundation.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cities")
public class CityController
{
    @Autowired
    private CityService cityService;

    @GetMapping(value = "/all",
       produces = "application/json")
    public ResponseEntity<?> listAllCities()
    {
        List<City> cities = cityService.findAll();
        return  new ResponseEntity<>(cities, HttpStatus.OK);
    }

    @GetMapping(value = "/city/{id}", produces = "application/json")
    public ResponseEntity<?> getCityById(@PathVariable Long id)
    {
        City c = cityService.findCityById(id);
        return new ResponseEntity<>(c, HttpStatus.OK);
    }
}
