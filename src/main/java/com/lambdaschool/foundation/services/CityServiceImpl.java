package com.lambdaschool.foundation.services;

import com.fasterxml.jackson.databind.ObjectMapper;
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
     * Connections to needed repositories
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
    public City saveDs(DSCity city) throws Exception
    {
//        System.out.println(city);

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
            DSHistoricalPop p = city.getPop_hist();

            ObjectMapper mapper = new ObjectMapper();

            String raw = mapper.writeValueAsString(p);
//            System.out.println(raw);
            raw = raw.replace("{",
                "");
            raw = raw.replace("}",
                "");
            raw = raw.replace("\"", "");
//            System.out.println(raw);
            raw = raw.replace("city:",
                "");
//            System.out.println(raw);
//            System.out.println(city.getCity());
            raw = raw.replace(city.getCity() + ", " + city.getStatename() + ",",
                "");
            raw = raw.replace("Braintree ",
                "");
            raw = raw.replace("Town,",
                "");
            raw = raw.replace("Nashville-Davidson,",
                "");
//            raw = raw.replace(city.getStatename() + ",",
//                "");
            raw = raw.replace("pop",
                "");
            raw = raw.replace("_",
                "");
            raw = raw.replace("census",
                "");
            raw = raw.replace("est",
                "");

//            System.out.println(raw);

            raw = raw.trim();

            String[] split = raw.split(",");

            for (String s : split)
            {
                String[] splits = s.split(":");
                c.getPopulationhist()
                    .add(new PopulationHist(Integer.parseInt(splits[0]),
                        Double.parseDouble(splits[1]),
                        c));
            }

        }

        if (city.getIncome_hist() != null)
        {
            DSHistoricalIncome i = city.getIncome_hist();

            ObjectMapper mapper = new ObjectMapper();

            String raw = mapper.writeValueAsString(i);
//            System.out.println(raw);
            raw = raw.replace("{",
                "");
            raw = raw.replace("}",
                "");
            raw = raw.replace("\"", "");
            raw = raw.replace("_Med",
                "");
            raw = raw.replace("_Inc",
                "");

            String[] split = raw.split(",");

            List<String> house = new ArrayList<>();
            List<String> ind = new ArrayList<>();

            for (String s : split)
            {
                if (s.contains("Hou"))
                {
                    house.add(s);
                } else if (s.contains("Ind"))
                {
                    ind.add(s);
                }
            }

            Hashtable<Integer, List<Integer>> h = new Hashtable<>();

//            System.out.println(house);
//            System.out.println(ind);

            for (String s : house)
            {
                s = s.replace("_Hou",
                    "");
                String[] splits = s.split(":");
                int year = Integer.parseInt(splits[0]);
                int cost = Integer.parseInt(splits[1]);

                List<Integer> list = new ArrayList<>();
                list.add(cost);
                h.put(year,
                    list);
            }

            for (String s : ind)
            {
                s = s.replace("_Ind",
                    "");
                String[] splits = s.split(":");
                int year = Integer.parseInt(splits[0]);
                int cost = Integer.parseInt(splits[1]);

                List<Integer> list = h.get(year);
                list.add(cost);
            }

            Set<Integer> keys = h.keySet();

            for (Integer key : keys)
            {
                List<Integer> list = h.get(key);

                c.getHistoricalincome()
                    .add(new HistoricalIncome(key,
                        list.get(1),
                        list.get(0),
                        c));
            }

        }

        if (city.getHome_hist() != null)
        {
            DSHistoricalHousing h = city.getHome_hist();

            ObjectMapper mapper = new ObjectMapper();

            String raw = mapper.writeValueAsString(h);

            raw = raw.replace("{",
                "");
            raw = raw.replace("}",
                "");
            raw = raw.replace("\"", "");
            String[] split = raw.split(",");

            for (String s : split)
            {
                String[] first = s.split(":");

                double cost;

                try
                {
                    cost = Double.parseDouble(first[1]);
                } catch (NumberFormatException nfe)
                {
                    cost = 0;
                }

                String[] second = first[0].split("_");

                int year = Integer.parseInt(second[0]);
                int month = Integer.parseInt(second[1]);

                c.getHistoricalaveragehouse()
                    .add(new HistoricalHousing(year,
                        month,
                        (int) cost,
                        c));
            }
        }

        if (city.getJhcovid() != null)
        {
            DSHistoricalCovid cov = city.getJhcovid();

            ObjectMapper mapper = new ObjectMapper();

            String raw = mapper.writeValueAsString(cov);
            raw = raw.replace("{",
                "");
            raw = raw.replace("}",
                "");
            raw = raw.replace("\"", "");

//            System.out.println(raw);

            String[] split = raw.split(",");

            for (String s : split)
            {
                if (s.contains("C") || s.contains(city.getStatename()) || s.contains("U"))
                {
                    continue;
                } else
                {
                    String[] first = s.split(":");
//                    System.out.println(first[0]);
//                    System.out.println(first[1]);
                    int cases = (int) Double.parseDouble(first[1]);

                    String[] second = first[0].split("_");

                    int year = Integer.parseInt(second[0]);
                    int month = Integer.parseInt(second[1]);
                    int day = Integer.parseInt(second[2]);

                    c.getCovid()
                        .add(new HistoricalCovid(year,
                            month,
                            day,
                            cases,
                            c));
                }


            }
        }

        if (city.getWeather_hist() != null)
        {
            DSHistoricalWeather w = city.getWeather_hist();

            ObjectMapper mapper = new ObjectMapper();

            String raw = mapper.writeValueAsString(w);
            raw = raw.replace("{",
                "");
            raw = raw.replace("}",
                "");
            raw = raw.replace("\"", "");

            String[] split = raw.split(",");

            List<String> perc = new ArrayList<>();
            List<String> temp = new ArrayList<>();
            Hashtable<String, List<Double>> h = new Hashtable<>();


            for (String s : split)
            {
                if (s.contains("prec"))
                {
                    perc.add(s);
                } else if (s.contains("temp"))
                {
                    temp.add(s);
                }
            }

            System.out.println(perc);
            System.out.println(temp);

            for (String s : perc)
            {
                String[] first = s.split(":");

                double value = Double.parseDouble(first[1]);

//                System.out.println(first[0]);
//                System.out.println(first[1]);

                String[] second = first[0].split("_");
                String month = second[0];

                List<Double> list = new ArrayList<>();
                list.add(value);

                h.put(month,
                    list);
            }

            for (String s : temp)
            {
                String[] first = s.split(":");

                double value = Double.parseDouble(first[1]);

                String[] second = first[0].split("_");
                String month = second[0];

                List<Double> list = h.get(month);
                list.add(value);
            }

            Set<String> keys = h.keySet();

            for (String key : keys)
            {
                List<Double> list = h.get(key);
                c.getHistoricalweather()
                    .add(new HistoricalWeather(key,
                        list.get(0),
                        list.get(1),
                        c));
            }
        }


        int totalHistPopulationCount = 0;
        double totalHistPopulaion = 0;

//        int totalHistIncCount = 0;
//        double totalHistInc = 0;

        int totalHistIndCount = 0;
        double totalHistInd = 0;

        int totalHistHouseCount = 0;
        double totalHistHouse = 0;

        int totalHistoricalHousingCount = 0;
        double totalHistoricalHousing = 0;

        int totalCovidCount = 0;
        double totalCovid = 0;

        int totalPercCount = 0;
        double totalPerc = 0;

        int totalTempCount = 0;
        double totalTemp = 0;

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

        cityrepo.findAll()
            .iterator()
            .forEachRemaining(cities::add);

        for (int i = 0; i < cities.size(); i++)
        {
            totalCities++;
            City x = cities.get(i);
            totalLatitude += x.getLatitude();
            totalLongitude += x.getLogitude();
            totalPopulation += x.getPopulation();
            totalDensityMiSq += (c.getDensitymisq() != null) ? x.getDensitymisq() : 0;
            totalDensityKmSq += (c.getDensitykmsq() != null) ? x.getDensitykmsq() : 0;
            totalAge += x.getAverageage();
            totalHousehold += x.getHouseholdincome();
            totalIndividual += x.getIndividualincome();
            totalHousing += x.getAveragehouse();
            totalRent += x.getRent();

            costOfLivingIndex += (x.getCostoflivingindex() != null) ? x.getCostoflivingindex() : 0;
        }

        c.setCitynamestate(cityNameState);
        c.setLatitude(totalLatitude / totalCities);
        c.setLogitude(totalLongitude / totalCities);
        c.setPopulation(totalPopulation / totalCities);
        c.setDensitymisq(totalDensityMiSq / totalCities);
        c.setDensitykmsq(totalDensityKmSq / totalCities);
        c.setAverageage(totalAge / totalCities);
        c.setHouseholdincome(totalHousehold / totalCities);
        c.setIndividualincome(totalIndividual / totalCities);
        c.setAveragehouse(totalHousing / totalCities);
        c.setRent(totalRent / totalCities);
        c.setCostoflivingindex(costOfLivingIndex / totalCities);

        return c;
    }
}
