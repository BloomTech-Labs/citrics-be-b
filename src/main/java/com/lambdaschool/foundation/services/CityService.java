package com.lambdaschool.foundation.services;

import com.lambdaschool.foundation.models.City;
import com.lambdaschool.foundation.models.CityAbstract;
import com.lambdaschool.foundation.models.User;
import java.util.List;

public interface CityService {
  /**
   * Find all cities
   * @return list of cities
   */
  List<City> findAll();

  /**
   * Finds city by city id
   * @param id city id
   * @return City matching id
   */
  City findCityById(long id);

  /**
   * Find all cities ids of cities matching the current user's filter
   * @param maxLength Maximum length or return list, if 0 there is no maximum
   * @return List of city ids of cities matching the current user's filter
   */
  List<Long> findIdByFilter(int maxLength);

  /**
   * Find all cities ids of cities matching the current user's filter
   * @param maxLength Maximum length or return list, if 0 there is no maximum
   * @return List of city ids of cities matching the current user's filter
   */
  List<CityAbstract> findAbstractByFilter(int maxLength);

  /**
   * Saves new city
   * @param city new city to be saved
   * @return newly saved City
   */
  City save(City city);

  //  /**
  //   * Saves new city from DS API schema
  //   * @param city new city to be saved
  //   * @return newly saved city
  //   */
  //  City saveDs(DSCity city) throws Exception;

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
   * Saves city to current users fav cities list
   * @param cityId city id of city to be saved
   * @param userId user extracted by controller
   */
  void saveFavoriteCity(long cityId, long userId);
}
