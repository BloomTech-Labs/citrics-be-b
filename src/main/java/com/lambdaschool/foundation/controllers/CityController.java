package com.lambdaschool.foundation.controllers;

import com.lambdaschool.foundation.models.City;
import com.lambdaschool.foundation.models.CityAbstract;
import com.lambdaschool.foundation.models.User;
import com.lambdaschool.foundation.services.CityService;
import com.lambdaschool.foundation.services.UserService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cities")
public class CityController {

  /**
   * Connection to city services
   */
  private final CityService cityService;

  private final UserService userService;

  public CityController(CityService cityService, UserService userService) {
    this.cityService = cityService;
    this.userService = userService;
  }

  //    /**
  //     *  /all endpoint (Not enough memory in free tier of
  //     *  Heroku to use with fully populated DB. Disabled until
  //     *  resources are available)
  //     * @return list of all cities
  //     */
  //    @GetMapping(value = "/all",
  //       produces = "application/json")
  //    public ResponseEntity<?> listAllCities()
  //    {
  //        List<City> cities = cityService.findAll();
  //        return  new ResponseEntity<>(cities, HttpStatus.OK);
  //    }

  /**
   * /city/{id} endpoint
   * @param id city id
   * @return city object matching city id or throws exception
   */
  @GetMapping(value = "/city/{id}", produces = "application/json")
  public ResponseEntity<?> getCityById(@PathVariable Long id) {
    City c = cityService.findCityById(id);
    return new ResponseEntity<>(c, HttpStatus.OK);
  }

  /**
   * /allid endpoint
   * @return list of all City abstracts
   */
  @GetMapping(value = "/allid", produces = "application/json")
  public ResponseEntity<?> listAllCityIds() {
    List<CityAbstract> myList = cityService.findAllIds();

    return new ResponseEntity<>(myList, HttpStatus.OK);
  }

  /**
   * /filterid endpoint - returns city ids matching filter
   * @return list of all ids matching filter
   */
  @GetMapping(value = "/filterid/{maxLength}", produces = "application/json")
  public ResponseEntity<?> filterCityIds(@PathVariable int maxLength) {
    List<Long> myList = cityService.findIdByFilter(maxLength);

    return new ResponseEntity<>(myList, HttpStatus.OK);
  }

  /**
   * /favorite/{cityId} endpoint
   * this adds city to users fav cities
   * extracts user from token
   * @param cityId city id to be added to favs
   * @return null, 201 status
   */
  @PostMapping(value = "/favorite/{cityId}")
  public ResponseEntity<?> addFavoriteCity(
    @PathVariable long cityId
//    Authentication authentication
  ) {
//    User user = userService.findByName(authentication.getName());
    long userId = 1;
    cityService.saveFavoriteCity(cityId, userId);

    return new ResponseEntity<>(null, HttpStatus.CREATED);
  }
}
