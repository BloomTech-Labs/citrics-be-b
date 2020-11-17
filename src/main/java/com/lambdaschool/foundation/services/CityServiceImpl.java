package com.lambdaschool.foundation.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lambdaschool.foundation.exceptions.ResourceNotFoundException;
import com.lambdaschool.foundation.models.*;
import com.lambdaschool.foundation.repository.*;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service(value = "cityService")
public class CityServiceImpl implements CityService {

  /**
   * Connections to needed repositories
   */
  private final CityRepository cityRepository;

  private final ZipcodeRepository zipcodeRepository;

  private final PopulationHistRepository populationHistRepository;

  private final HistoricalIncomeRepository historicalIncomeRepository;

  private final HistoricalHousingRepository historicalHousingRepository;

  private final HistoricalCovidRepository historicalCovidRepository;

  private final HistoricalWeatherRepository historicalWeatherRepository;

  private final UserRepository userRepository;

  public CityServiceImpl(CityRepository cityRepository, ZipcodeRepository zipcodeRepository, PopulationHistRepository populationHistRepository, HistoricalIncomeRepository historicalIncomeRepository, HistoricalHousingRepository historicalHousingRepository, HistoricalCovidRepository historicalCovidRepository, HistoricalWeatherRepository historicalWeatherRepository, UserRepository userRepository) {
    this.cityRepository = cityRepository;
    this.zipcodeRepository = zipcodeRepository;
    this.populationHistRepository = populationHistRepository;
    this.historicalIncomeRepository = historicalIncomeRepository;
    this.historicalHousingRepository = historicalHousingRepository;
    this.historicalCovidRepository = historicalCovidRepository;
    this.historicalWeatherRepository = historicalWeatherRepository;
    this.userRepository = userRepository;
  }

  /**
   * Find all cities in DB
   *
   * @return list of Cities
   */
  @Override
  public List<City> findAll() {
    List<City> list = new ArrayList<>();

    cityRepository.findAll().iterator().forEachRemaining(list::add);

    return list;
  }

  /**
   * find city by cityid
   *
   * @param id local id of city
   * @return City object matching the city id or
   * @throws ResourceNotFoundException
   */
  @Override
  public City findCityById(long id) throws ResourceNotFoundException {
    return cityRepository
      .findById(id)
      .orElseThrow(
        () -> new ResourceNotFoundException("City id " + id + " not found!")
      );
  }

  /**
   * Find all cities ids of cities matching the current user's filter
   * @param maxLength Maximum length or return list, if 0 there is no maximum
   * @return List of city ids of cities matching the current user's filter
   */
  @Override
  public List<Long> findIdByFilter(int maxLength) {
    // TODO use authenticated user
    long id = 1;
    List<Long> matchList = new ArrayList<>();
    List<City> cityList = findAll();
    User currentUser = userRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException(
                    "User id " + id + " not found!"));

    for (City city : cityList) {
      // continue loop (don't add city) if it fails any filter criteria
      if (currentUser.getMinPopulation() != null)
        if (city.getPopulation() < currentUser.getMinPopulation())
          continue;
      if (currentUser.getMaxPopulation() != null)
        if (city.getPopulation() > currentUser.getMaxPopulation())
          continue;
      if (currentUser.getMinRent() != null)
        if (city.getRent() < currentUser.getMinRent())
          continue;
      if (currentUser.getMaxRent() != null)
        if (city.getRent() > currentUser.getMaxRent())
          continue;
      if (currentUser.getMaxHouseCost() != null)
        if (city.getAverageHomeCost() < currentUser.getMinHouseCost())
          continue;
      if (currentUser.getMaxHouseCost() != null)
        if (city.getAverageHomeCost() > currentUser.getMaxHouseCost())
          continue;

      matchList.add(city.getCityId());
      // if we have a maximum, check if we have reached it
      if (maxLength != 0 && matchList.size() == maxLength)
        break;
    }

    return matchList;
  }

  /**
   * Saves new city to DB
   * Had to modify last minute to accept new city schema returned by DS
   * @param city new city to be saved
   * @return newly saved city
   */
  @Transactional
  @Override
  public City save(City city) {
    City c = new City();

    if (city.getCityId() != 0) {
      cityRepository
        .findById(city.getCityId())
        .orElseThrow(
          () ->
            new ResourceNotFoundException(
              "City id " + city.getCityId() + " not found!"
            )
        );
      c.setCityId(city.getCityId());
    }

    c.setCityName(city.getCityName());
    c.setStateCode(city.getStateCode());
    c.setTimezone(city.getTimezone());
    c.setLatitude(city.getLatitude());
    c.setLongitude(city.getLongitude());
    c.setFpis(city.getFpis());
    c.setGnis(city.getGnis());
    c.setImageUrl(city.getImageUrl());
    c.setWebsite(city.getWebsite());
    c.setPopulation(city.getPopulation());
    c.setPopulationDensity(city.getPopulationDensity());
    c.setAverageAge(city.getAverageAge());
    c.setHouseholdIncome(city.getHouseholdIncome());
    c.setIndividualIncome(city.getIndividualIncome());
    c.setAverageHomeCost(city.getAverageHomeCost());
    c.setRent(city.getRent());
    c.setCostOfLivingIndex(city.getCostOfLivingIndex());
    c.setAcaStatus(city.getAcaStatus());

    for (Zipcode z : city.getZipcodes()) {
      Zipcode zip = zipcodeRepository
        .findById(z.getZipId())
        .orElseThrow(
          () ->
            new ResourceNotFoundException(
              "Zipcode id " + z.getZipId() + " not found!"
            )
        );

      c.getZipcodes().add(zip);
    }

    for (PopulationHistory p : city.getPopulationHistory()) {
      /**
       * UNCOMMENT WHEN DB IS DONE SEEDING
       * cannot find property until DB is seeded
       */
      //            PopulationHistory pop = poprepo.findById(p.getPopid())
      //                .orElseThrow(() -> new ResourceNotFoundException("Historical Population id " + p.getPopid() + " not found!"));

      c
        .getPopulationHistory()
        .add(new PopulationHistory(p.getYear(), p.getPopulation(), c));
    }

    for (HistoricalIncome i : city.getHistoricalIncome()) {
      /**
       * UNCOMMENT WHEN DB IS DONE SEEDING
       * cannot find property until DB is seeded
       */
      //            HistoricalIncome inc = increpo.findById(i.getIncomeId())
      //                .orElseThrow(() -> new ResourceNotFoundException("Historical Income id " + i.getIncomeId() + " not found!"));

      c
        .getHistoricalIncome()
        .add(
          new HistoricalIncome(
            i.getYear(),
            i.getIndividualIncome(),
            i.getHouseholdIncome(),
            c
          )
        );
    }

    for (HistoricalHomeCost h : city.getHistoricalHomeCost()) {
      /**
       * UNCOMMENT WHEN DB IS DONE SEEDING
       * cannot find property until DB is seeded
       */
      //            HistoricalHomeCost ho = housrepo.findById(h.getHouseId())
      //                .orElseThrow(() -> new ResourceNotFoundException("Historical Housing id " + h.getHouseId() + " not found!"));

      c
        .getHistoricalHomeCost()
        .add(
          new HistoricalHomeCost(h.getYear(), h.getYear(), h.getHomeCost(), c)
        );
    }

    for (HistoricalCovid co : city.getHistoricalCovid()) {
      /**
       * UNCOMMENT WHEN DB IS DONE SEEDING
       * cannot find property until DB is seeded
       */
      //            HistoricalCovid cov = covrepo.findById(co.getCovidId())
      //                .orElseThrow(() -> new ResourceNotFoundException("Historical Covid id " + co.getCovidId() + " not found!"));

      c
        .getHistoricalCovid()
        .add(
          new HistoricalCovid(
            co.getYear(),
            co.getMonth(),
            co.getDay(),
            co.getCases(),
            c
          )
        );
    }

    for (HistoricalWeather weather : city.getHistoricalWeather()) {
      /**
       * UNCOMMENT WHEN DB IS DONE SEEDING
       * cannot find property until DB is seeded
       */
      //            HistoricalWeather h = wearepo.findById(weather.getWeatherId())
      //                .orElseThrow(() -> new ResourceNotFoundException("Historical Weather id " + weather.getWeatherId() + " not found!"));

      c
        .getHistoricalWeather()
        .add(
          new HistoricalWeather(
            weather.getMonth(),
            weather.getPrecipitation(),
            weather.getTemperature(),
            c
          )
        );
    }

    for (UserCities user : city.getUsers()) {
      c.getUsers().add(user);
    }

    c.setAverageTemperature(city.getAverageTemperature());
    c.setAveragePrecipitation(city.getAveragePrecipitation());
    c.setAverageNewCovidCases(city.getAverageNewCovidCases());

    return cityRepository.save(c);
  }

  /**
   * Saves new city from DS API schema
   * Had to modify last minute to accept new city schema returned by DS
   * @param city JSON City to be saved
   * @return newly saved City object
   */
  @Transactional
  @Override
  public City saveDs(DSCity city) throws Exception {
    /**
     * Takes DScity model and converts it to City
     */

    City c = new City();

    c.setCityName(city.getCity() + ", " + city.getStatename());
    c.setStateCode(city.getAbbrev());
    c.setTimezone(city.getTimezone());
    c.setLatitude(city.getLatitude());
    c.setLongitude(city.getLongitude());
    c.setFpis(city.getFIPS());
    c.setImageUrl(city.getWiki_img_url());
    c.setWebsite(city.getWebsite());
    c.setPopulation(city.getPop());
    c.setPopulationDensity(city.getDensity_mi_sq());
    c.setAverageAge(city.getAge());
    c.setHouseholdIncome(city.getHousehold());
    c.setIndividualIncome(city.getIndividual());
    c.setAverageHomeCost(city.getHouse());
    c.setRent(city.getRent());
    c.setCostOfLivingIndex(city.getCOLI());
    c.setAcaStatus(city.getACA_status());

    /**
     * Splits zipcode string into
     * an actual list of strings
     */
    if (city.getZiplist() != null) {
      String rawZip = city.getZiplist();
      String[] split = rawZip.split(" ");

      for (String s : split) {
        c.getZipcodes().add(new Zipcode(s, c));
      }
    }

    /**
     * Splits historical population list string
     * into an actual list of historical populations
     */
    if (city.getPop_hist() != null) {
      DSHistoricalPop p = city.getPop_hist();

      ObjectMapper mapper = new ObjectMapper();

      String raw = mapper.writeValueAsString(p);
      raw = raw.replace("{", "");
      raw = raw.replace("}", "");
      raw = raw.replace("\"", "");
      raw = raw.replace("city:", "");
      raw = raw.replace(city.getCity() + ", " + city.getStatename() + ",", "");
      raw = raw.replace("Braintree ", "");
      raw = raw.replace("Town,", "");
      raw = raw.replace("Nashville-Davidson,", "");
      //            raw = raw.replace(city.getStatename() + ",",
      //                "");
      raw = raw.replace("POP", "");
      raw = raw.replace("_", "");
      raw = raw.replace("census", "");
      raw = raw.replace("est", "");

      raw = raw.trim();

      String[] split = raw.split(",");
      //            migrating population from double to int broke it
      //            for (String s : split)
      //            {
      //                String[] splits = s.split(":");
      //                c.getPopulationHistory()
      //                    .add(new PopulationHistory(Integer.parseInt(splits[0]),
      //                        Double.parseDouble(splits[1]),
      //                        c));
      //            }

    }

    /**
     * Splits historical income string
     * into an actual list of historical incomes
     */
    if (city.getIncome_hist() != null) {
      DSHistoricalIncome i = city.getIncome_hist();

      ObjectMapper mapper = new ObjectMapper();

      String raw = mapper.writeValueAsString(i);
      raw = raw.replace("{", "");
      raw = raw.replace("}", "");
      raw = raw.replace("\"", "");
      raw = raw.replace("_Med", "");
      raw = raw.replace("_Inc", "");

      String[] split = raw.split(",");

      List<String> house = new ArrayList<>();
      List<String> ind = new ArrayList<>();

      for (String s : split) {
        if (s.contains("Hou")) {
          house.add(s);
        } else if (s.contains("Ind")) {
          ind.add(s);
        }
      }

      Hashtable<Integer, List<Integer>> h = new Hashtable<>();

      for (String s : house) {
        s = s.replace("_Hou", "");
        String[] splits = s.split(":");
        int year = Integer.parseInt(splits[0]);
        int cost = Integer.parseInt(splits[1]);

        List<Integer> list = new ArrayList<>();
        list.add(cost);
        h.put(year, list);
      }

      for (String s : ind) {
        s = s.replace("_Ind", "");
        String[] splits = s.split(":");
        int year = Integer.parseInt(splits[0]);
        int cost = Integer.parseInt(splits[1]);

        List<Integer> list = h.get(year);
        list.add(cost);
      }

      Set<Integer> keys = h.keySet();

      for (Integer key : keys) {
        List<Integer> list = h.get(key);

        c
          .getHistoricalIncome()
          .add(new HistoricalIncome(key, list.get(1), list.get(0), c));
      }
    }

    /**
     * Splits historical hosuing string
     * into an actual list of historical housing
     */
    if (city.getHome_hist() != null) {
      DSHistoricalHousing h = city.getHome_hist();

      ObjectMapper mapper = new ObjectMapper();

      String raw = mapper.writeValueAsString(h);

      raw = raw.replace("{", "");
      raw = raw.replace("}", "");
      raw = raw.replace("\"", "");
      String[] split = raw.split(",");

      for (String s : split) {
        String[] first = s.split(":");

        double cost;

        try {
          cost = Double.parseDouble(first[1]);
        } catch (NumberFormatException nfe) {
          cost = 0;
        }

        String[] second = first[0].split("_");

        int year = Integer.parseInt(second[0]);
        int month = Integer.parseInt(second[1]);

        c
          .getHistoricalHomeCost()
          .add(new HistoricalHomeCost(year, month, (int) cost, c));
      }
    }

    /**
     * Splits historical covid string
     * into an actual list of historical covid cases
     */
    if (city.getJhcovid() != null) {
      DSHistoricalCovid cov = city.getJhcovid();

      ObjectMapper mapper = new ObjectMapper();

      String raw = mapper.writeValueAsString(cov);
      raw = raw.replace("{", "");
      raw = raw.replace("}", "");
      raw = raw.replace("\"", "");

      String[] split = raw.split(",");

      for (String s : split) {
        if (
          s.contains("C") || s.contains(city.getStatename()) || s.contains("U")
        ) {
          continue;
        } else {
          String[] first = s.split(":");
          int cases = (int) Double.parseDouble(first[1]);

          String[] second = first[0].split("_");

          int year = Integer.parseInt(second[0]);
          int month = Integer.parseInt(second[1]);
          int day = Integer.parseInt(second[2]);

          c
            .getHistoricalCovid()
            .add(new HistoricalCovid(year, month, day, cases, c));
        }
      }
    }

    /**
     * Splits historical weather string
     * into actual list of historical weather
     */
    if (city.getWeather_hist() != null) {
      DSHistoricalWeather w = city.getWeather_hist();

      ObjectMapper mapper = new ObjectMapper();

      String raw = mapper.writeValueAsString(w);
      raw = raw.replace("{", "");
      raw = raw.replace("}", "");
      raw = raw.replace("\"", "");

      String[] split = raw.split(",");

      List<String> perc = new ArrayList<>();
      List<String> temp = new ArrayList<>();
      Hashtable<String, List<Double>> h = new Hashtable<>();

      for (String s : split) {
        if (s.contains("prec")) {
          perc.add(s);
        } else if (s.contains("temp")) {
          temp.add(s);
        }
      }

      for (String s : perc) {
        String[] first = s.split(":");

        double value = Double.parseDouble(first[1]);

        String[] second = first[0].split("_");
        String month = second[0];

        List<Double> list = new ArrayList<>();
        list.add(value);

        h.put(month, list);
      }

      for (String s : temp) {
        String[] first = s.split(":");

        double value = Double.parseDouble(first[1]);

        String[] second = first[0].split("_");
        String month = second[0];

        List<Double> list = h.get(month);
        list.add(value);
      }

      Set<String> keys = h.keySet();

      for (String key : keys) {
        List<Double> list = h.get(key);
        c
          .getHistoricalWeather()
          .add(new HistoricalWeather(key, list.get(0), list.get(1), c));
      }
    }

    /**
     * Calculates historical data averages
     */
    double totalHistPopulaion = 0;
    double totalHistInd = 0;
    double totalHistHouse = 0;
    double totalHistoricalHousing = 0;
    int totalCovidCount = 0;
    double totalCovid = 0;
    int totalPercCount = 0;
    double totalPerc = 0;
    int totalTempCount = 0;
    double totalTemp = 0;

    for (PopulationHistory pop : c.getPopulationHistory()) {
      totalHistPopulaion += pop.getPopulation();
    }

    for (HistoricalIncome v : c.getHistoricalIncome()) {
      totalHistInd += v.getIndividualIncome();
      totalHistHouse += v.getHouseholdIncome();
    }

    for (HistoricalHomeCost h : c.getHistoricalHomeCost()) {
      totalHistoricalHousing += h.getHomeCost();
    }

    for (HistoricalCovid co : c.getHistoricalCovid()) {
      totalCovidCount++;
      totalCovid += co.getCases();
    }

    for (HistoricalWeather h : c.getHistoricalWeather()) {
      totalPercCount++;
      totalTempCount++;

      totalPerc += h.getPrecipitation();
      totalTemp += h.getTemperature();
    }

    c.setAverageTemperature(totalTemp / totalTempCount);
    c.setAveragePrecipitation(totalPerc / totalPercCount);
    c.setAverageNewCovidCases(totalCovid / totalCovidCount);

    return cityRepository.save(c);
  }

  /**
   * Find city by city name
   *
   * @param name city name
   * @return city object matching name or throws exception
   */
  @Override
  public City findByCityName(String name) {
    City c = cityRepository.findByCityName(name);
    if (c == null) {
      throw new ResourceNotFoundException("City name " + name + " not found!");
    }
    return c;
  }

  /**
   * Find all cities and their name's + id's
   *
   * @return List of City name's and Id's
   */
  @Override
  public List<CityAbstract> findAllIds() {
    List<CityAbstract> cities = new ArrayList<>();

    cityRepository
      .findAll()
      .iterator()
      .forEachRemaining(
        city ->
          cities.add(
            new CityAbstract(
              city.getCityId(),
              city.getCityName(),
              city.getStateCode(),
              city.getPopulation(),
              city.getAverageHomeCost(),
              city.getRent(),
              city.getCostOfLivingIndex()
            )
          )
      );

    return cities;
  }

  /**
   * Find the average value for all city fields
   * excludes historical data
   * @return a City with the field averages of all cities
   */
  @Override
  public City findAverageCity() {
    List<City> cities = new ArrayList<>();

    City c = new City();
    int totalCities = 0;
    String cityNameState = "National Average, USA";
    double totalLatitude = 0;
    double totalLongitude = 0;
    double totalPopulation = 0;
    double totalDensityMiSq = 0;
    double totalDensityKmSq = 0;
    double totalAge = 0;
    double totalHousehold = 0;
    double totalIndividual = 0;
    double totalHousing = 0;
    double totalRent = 0;
    double costOfLivingIndex = 0;
    double totalTemp = 0;
    double totalPerc = 0;
    double totalCov = 0;

    cityRepository.findAll().iterator().forEachRemaining(cities::add);

    for (int i = 0; i < cities.size(); i++) {
      totalCities++;
      City x = cities.get(i);
      totalLatitude += x.getLatitude();
      totalLongitude += x.getLongitude();
      totalPopulation += x.getPopulation();
      totalDensityMiSq +=
        (c.getPopulationDensity() != null) ? x.getPopulationDensity() : 0;
      totalAge += x.getAverageAge();
      totalHousehold += x.getHouseholdIncome();
      totalIndividual += x.getIndividualIncome();
      totalHousing += x.getAverageHomeCost();
      totalRent += x.getRent();
      totalTemp += x.getAverageTemperature();
      totalPerc += x.getAveragePrecipitation();
      totalCov += x.getAverageNewCovidCases();

      costOfLivingIndex +=
        (x.getCostOfLivingIndex() != null) ? x.getCostOfLivingIndex() : 0;
    }

    c.setCityName(cityNameState);
    c.setLatitude(totalLatitude / totalCities);
    c.setLongitude(totalLongitude / totalCities);
    c.setPopulation((long) (totalPopulation / totalCities));
    c.setPopulationDensity(totalDensityMiSq / totalCities);
    c.setAverageAge(totalAge / totalCities);
    c.setHouseholdIncome(totalHousehold / totalCities);
    c.setIndividualIncome(totalIndividual / totalCities);
    c.setAverageHomeCost(totalHousing / totalCities);
    c.setRent(totalRent / totalCities);
    c.setCostOfLivingIndex(costOfLivingIndex / totalCities);
    c.setAverageTemperature(totalTemp / totalCities);
    c.setAveragePrecipitation(totalPerc / totalCities);
    c.setAverageNewCovidCases(totalCov / totalCities);

    return c;
  }

  /**
   * Finds the average city object stored in DB
   * @return National Average City
   */
  @Override
  public City returnAverageCity() {
    return findByCityName("National Average, USA");
  }

  /**
   * Saves the city by id to current users fav cities
   * @param id cityid of city to be saved
   * @param user user extracted by controller
   */
  @Override
  public void saveFavCity(long id, User user) {
    City c = findCityById(id);
    UserCities us = new UserCities(user, c);

    user.getFavoriteCities().add(us);
    c.getUsers().add(us);
  }
}
