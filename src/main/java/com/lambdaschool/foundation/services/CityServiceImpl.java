package com.lambdaschool.foundation.services;

import com.lambdaschool.foundation.exceptions.ResourceNotFoundException;
import com.lambdaschool.foundation.models.*;
import com.lambdaschool.foundation.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

@Transactional
@Service(value = "cityService")
public class CityServiceImpl implements CityService
{
    /**
     * Connection to city repository
     */
    @Autowired
    private CityRepository cityrepo;

    @Autowired
    private ZipcodeRepository ziprepo;

    @Autowired
    private CountyRepository countrepo;

    @Autowired
    private PopulationHistRepository poprepo;

    @Autowired
    private HistoricalIncomeRepository increpo;

    @Autowired
    private HistoricalHousingRepository housrepo;

    @Autowired
    private HistoricalCovidRepository covrepo;

    @Autowired
    private HistoricalWeatherRepository wearepo;

    @Autowired
    private UserRepository userrepo;



    /**
     * Find all cities in DB
     *
     * @return list of Cities
     */
    @Override
    public List<City> findAll()
    {
        List<City> list = new ArrayList<>();

        cityrepo.findAll()
            .iterator()
            .forEachRemaining(list::add);

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
    public City findCityById(long id) throws ResourceNotFoundException
    {
        return cityrepo.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("City id " + id + " not found!"));
    }

    /**
     * Saves new city to DB
     *
     * @param city new city to be saved
     * @return newly saved city
     */
    @Transactional
    @Override
    public City save(City city)
    {
        City c = new City();

        if (city.getCityid() != 0)
        {
            cityrepo.findById(city.getCityid())
                .orElseThrow(() -> new ResourceNotFoundException("City id " + city.getCityid() + " not found!"));
            c.setCityid(city.getCityid());
        }

        c.setCitynamestate(city.getCitynamestate());
        c.setStatecode(city.getStatecode());
        c.setTimezone(city.getTimezone());
        c.setLatitude(city.getLatitude());
        c.setLogitude(city.getLogitude());
        c.setFpis(city.getFpis());
        c.setGnis(city.getGnis());
        c.setWikiimgurl(city.getWikiimgurl());
        c.setWebsite(city.getWebsite());
        c.setPopulation(city.getPopulation());
        c.setDensitymisq(city.getDensitymisq());
        c.setDensitykmsq(city.getDensitykmsq());
        c.setAverageage(city.getAverageage());
        c.setHouseholdincome(city.getHouseholdincome());
        c.setIndividualincome(city.getIndividualincome());
        c.setAveragehouse(city.getAveragehouse());
        c.setRent(city.getRent());
        c.setCostoflivingindex(city.getCostoflivingindex());
        c.setAcastatus(city.getAcastatus());

        for (Zipcode z : city.getZipcodes())
        {
            Zipcode zip = ziprepo.findById(z.getZipid())
                .orElseThrow(() -> new ResourceNotFoundException("Zipcode id " + z.getZipid() + " not found!"));

            c.getZipcodes()
                .add(zip);
        }

        for (County county : city.getCounties())
        {
            County count = countrepo.findById(county.getCountyid())
                .orElseThrow(() -> new ResourceNotFoundException("County id " + county.getCountyid() + " not found!"));

            c.getCounties()
                .add(count);
        }

        for (PopulationHist p : city.getPopulationhist())
        {
            PopulationHist pop = poprepo.findById(p.getPopid())
                .orElseThrow(() -> new ResourceNotFoundException("Historical Population id " + p.getPopid() + " not found!"));

            c.getPopulationhist()
                .add(pop);
        }

        for (HistoricalIncome i : city.getHistoricalincome())
        {
            HistoricalIncome inc = increpo.findById(i.getIncid())
                .orElseThrow(() -> new ResourceNotFoundException("Historical Income id " + i.getIncid() + " not found!"));

            c.getHistoricalincome()
                .add(inc);
        }

        for (HistoricalHousing h : city.getHistoricalaveragehouse())
        {
            HistoricalHousing ho = housrepo.findById(h.getHouseid())
                .orElseThrow(() -> new ResourceNotFoundException("Historical Housing id " + h.getHouseid() + " not found!"));

            c.getHistoricalaveragehouse()
                .add(ho);
        }

        for (HistoricalCovid co : city.getCovid())
        {
            HistoricalCovid cov = covrepo.findById(co.getCovidid())
                .orElseThrow(() -> new ResourceNotFoundException("Historical Covid id " + co.getCovidid() + " not found!"));

            c.getCovid()
                .add(cov);
        }

        for (HistoricalWeather weather : city.getHistoricalweather())
        {
            HistoricalWeather h = wearepo.findById(weather.getWeatherid())
                .orElseThrow(() -> new ResourceNotFoundException("Historical Weather id " + weather.getWeatherid() + " not found!"));

            c.getHistoricalweather()
                .add(h);
        }

        for (UserCities user : city.getUsers())
        {
            c.getUsers()
                .add(user);

        }

        return cityrepo.save(c);
    }

    /**
     * Saves new city from DS API schema
     *
     * @param city JSON City to be saved
     * @return newly saved City object
     */
    @Transactional
    @Override
    public City saveDs(DSCity city)
    {
        City c = new City();

        c.setCitynamestate(city.getCity() + ", " + city.getStatename());
        c.setStatecode(city.getAbbrev());
        c.setTimezone(city.getTimezone());
        c.setLatitude(city.getLatitude());
        c.setLogitude(city.getLongitude());
        c.setFpis(city.getFIPS());
        c.setWikiimgurl(city.getWiki_img_url());
        c.setWebsite(city.getWebsite());
        c.setPopulation(city.getPop());
        c.setDensitymisq(city.getDensity_mi_sq());
        c.setDensitykmsq(city.getDensity_km_sq());
        c.setAverageage(city.getAge());
        c.setHouseholdincome(city.getHousehold());
        c.setIndividualincome(city.getIndividual());
        c.setAveragehouse(city.getHouse());
        c.setRent(city.getRent());
        c.setCostoflivingindex(city.getCOLI());
        c.setAcastatus(city.getACA_status());

        if (city.getZiplist() != null)
        {
            String rawZip = city.getZiplist();
            String[] split = rawZip.split(" ");

            for (String s : split)
            {
                c.getZipcodes()
                    .add(new Zipcode(s,
                        c));
            }
        }

        if (city.getCounties() != null)
        {
            String rawCount = city.getCounties();
            String[] split = rawCount.split(" ");

            for (String s : split)
            {
                c.getCounties()
                    .add(new County(s,
                        c));
            }
        }

        if (city.getPop_hist() != null)
        {
            String raw = city.getPop_hist();
            raw = raw.replace("{",
                "");
            raw = raw.replace("}",
                "");
//            String nameState = "city:" + city.getCity() + "," + city.getStatename() + ",";
//            raw = raw.replace(nameState,
//                "");
            raw = raw.replace("city:", "");
            raw = raw.replace(city.getCity() + ",", "");
            raw = raw.replace(city.getStatename() + ",", "");
            raw = raw.replace("POP",
                "");
            raw = raw.replace("_",
                "");
            raw = raw.replace("census",
                "");
            raw = raw.replace("est",
                "");

//            System.out.println(nameState);
            raw = raw.trim();
            System.out.println(raw);

            String[] split = raw.split(",");

            for (String s : split)
            {
                System.out.printf(s);
                String[] splits = s.split(":");
                c.getPopulationhist()
                    .add(new PopulationHist(Integer.parseInt(splits[0]),
                        Double.parseDouble(splits[1]),
                        c));
            }

        }

        if (city.getIncome_hist() != null)
        {
            String raw = city.getIncome_hist();
            raw = raw.replace("{", "");
            raw = raw.replace("}", "");
            raw = raw.replace("_Med", "");
            raw = raw.replace("_Inc", "");

            String[] split = raw.split(",");

            List<String> house = new ArrayList<>();
            List<String> ind = new ArrayList<>();


            for (String s: split)
            {
                if (s.contains("Hou"))
                {
                    house.add(s);
                }
                else if (s.contains("Ind"))
                {
                    ind.add(s);
                }
            }

            Hashtable<Integer, List<Integer>> h = new Hashtable<>();


            for (String s: house)
            {
                s.replace("_Hou", "");
                String[] splits = s.split(":");
                int year = Integer.parseInt(splits[0]);
                int cost = Integer.parseInt(splits[1]);

                List<Integer> list = new ArrayList<>();
                list.add(cost);
                h.put(year, list);
            }

            for (String s: ind)
            {
                s.replace("_Ind", "");
                String[] splits = s.split(":");
                int year = Integer.parseInt(splits[0]);
                int cost = Integer.parseInt(splits[1]);

                List<Integer> list = h.get(year);
                list.add(cost);
            }

            Set<Integer> keys = h.keySet();

            for (Integer key: keys)
            {
                List<Integer> list = h.get(key);

                c.getHistoricalincome().add(new HistoricalIncome(key, list.get(1), list.get(0), c));
            }

        }

        if (city.getHome_hist() != null)
        {
            String raw = city.getHome_hist();
            raw = raw.replace("{", "");
            raw = raw.replace("}", "");

            String[] split = raw.split(",");

            for (String s: split)
            {
                String[] first = s.split(":");

                int cost = Integer.parseInt(first[1]);

                String[] second = first[0].split("_");

                int year = Integer.parseInt(second[0]);
                int month = Integer.parseInt(second[1]);

                c.getHistoricalincome().add(new HistoricalIncome(year, month, cost, c));
            }
        }

        if (city.getJhcovid() != null)
        {
            String raw = city.getJhcovid();
            raw = raw.replace("{", "");
            raw = raw.replace("}", "");

            String[] split = raw.split(",");

            for (String s: split)
            {
                if (s.contains("C") || s.contains(city.getStatename()) || s.contains("U"))
                {
                    continue;
                } else
                {
                    String[] first = s.split(":");
                    int cases = Integer.parseInt(first[1]);

                    String[] second = first[0].split("_");

                    int year = Integer.parseInt(second[0]);
                    int month = Integer.parseInt(second[1]);
                    int day = Integer.parseInt(second[2]);

                    c.getCovid().add(new HistoricalCovid(year, month, day, cases, c));
                }


            }
        }

        if (city.getWeather_hist() != null)
        {
            String raw = city.getWeather_hist();
            raw = raw.replace("{", "");
            raw = raw.replace("}", "");

            String[] split = raw.split(",");

            List<String> perc = new ArrayList<>();
            List<String> temp = new ArrayList<>();
            Hashtable<String, List<Double>> h = new Hashtable<>();

            for (String s: split)
            {
                if (s.contains("prec"))
                {
                    perc.add(s);
                } else if (s.contains("temp"))
                {
                    temp.add(s);
                }
            }

            for (String s: perc)
            {
                String[] first = s.split(":");

                double value = Double.parseDouble(first[1]);

                String[] second = first[0].split("_");
                String month = second[0];

                List<Double> list = new ArrayList<>();
                list.add(value);

                h.put(month, list);
            }

            for (String s: temp)
            {
                String[] first = s.split(":");

                double value = Double.parseDouble(first[1]);

                String[] second = first[0].split("_");
                String month = second[0];

                List<Double> list = h.get(month);
                list.add(value);
            }

            Set<String> keys = h.keySet();

            for (String key: keys)
            {
                List<Double> list = h.get(key);
                c.getHistoricalweather().add(new HistoricalWeather(key, list.get(0), list.get(1), c));
            }
        }

        return cityrepo.save(c);
    }

    /**
     * Find city by citynamestate
     *
     * @param name citynamestate
     * @return city object match name or throws exception
     */
    @Override
    public City findByName(String name)
    {
        City c = cityrepo.findByCitynamestate(name);
        if (c == null)
        {
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
    public List<CityIdName> findAllIds()
    {
        List<CityIdName> cities = new ArrayList<>();

        cityrepo.findAll()
            .iterator()
            .forEachRemaining((city) -> cities.add(new CityIdName(city.getCityid(),
                city.getCitynamestate())));

        return cities;
    }

    /**
     * Find the average value for all city fields
     *
     * @return a City with the field averages of all cities
     */
    @Override
    public City findAverageCity()
    {
        List<City> cities = new ArrayList<>();

        City c = new City();
        int totalCities = 0;
        String cityNameState = "National Average, USA";
        double totalPopulation = 0;
        int totalPopulationDensityRating = 0;
        int totalSafteyRatingScore = 0;
        int totalCostofLivingScore = 0;
        double totalAverageIncome = 0;
        int totalAverageTemperature = 0;
        float totalLat = 0;
        float totalLon = 0;
        double totalAverageAge = 0;
        double totalAverageHouseholdIncome = 0;
        double totalAverageIndividualIncome = 0;
        double totalAverageHouseingCost = 0;
        double totalAverageRentCost = 0;
        double totalCostOfLivingIndex = 0;

        cityrepo.findAll()
            .iterator()
            .forEachRemaining(cities::add);

        for (int i = 0; i < cities.size(); i++)
        {
            totalCities++;
            //            totalPopulation += cities.get(i).getPopulation();
            //            totalPopulationDensityRating += cities.get(i).getPopulationdensityrating();
            //            totalSafteyRatingScore += cities.get(i).getSafteyratingscore();
            //            totalCostofLivingScore += cities.get(i).getCostoflivingscore();
            //            totalAverageIncome += cities.get(i).getAverageincome();
            //            totalAverageTemperature += cities.get(i).getAveragetemperature();
            //            totalLat += cities.get(i).getLat();
            //            totalLon += cities.get(i).getLon();
            //            totalAverageAge += cities.get(i).getAverageage();
            //            totalAverageHouseholdIncome += cities.get(i).getAveragehouseholdincome();
            //            totalAverageIndividualIncome += cities.get(i).getAverageindividualincome();
            //            totalAverageHouseingCost += cities.get(i).getAveragehouseingcost();
            //            totalAverageRentCost += cities.get(i).getAveragerentcost();
            totalCostOfLivingIndex += cities.get(i)
                .getCostoflivingindex();
        }

        c.setCitynamestate(cityNameState);
        //        c.setPopulation(totalPopulation / totalCities);
        //        c.setPopulationdensityrating(totalPopulationDensityRating / totalCities);
        //        c.setSafteyratingscore(totalSafteyRatingScore / totalCities);
        //        c.setCostoflivingscore(totalCostofLivingScore / totalCities);
        //        c.setAverageincome(totalAverageIncome / totalCities);
        //        c.setAveragetemperature(totalAverageTemperature / totalCities);
        //        c.setLat(totalLat / totalCities);
        //        c.setLon(totalLon / totalCities);
        //        c.setAverageage(totalAverageAge / totalCities);
        //        c.setAveragehouseholdincome(totalAverageHouseholdIncome / totalCities);
        //        c.setAverageindividualincome(totalAverageIndividualIncome / totalCities);
        //        c.setAveragehouseingcost(totalAverageHouseingCost / totalCities);
        //        c.setAveragerentcost(totalAverageRentCost / totalCities);
        c.setCostoflivingindex(totalCostOfLivingIndex / totalCities);

        return c;
    }
}
