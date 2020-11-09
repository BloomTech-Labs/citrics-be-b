package com.lambdaschool.foundation;

import com.lambdaschool.foundation.models.*;
import com.lambdaschool.foundation.services.CityService;
import com.lambdaschool.foundation.services.UserService;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.*;

/**
 * SeedData puts both known and random data into the database. It implements CommandLineRunner.
 * <p>
 * CoomandLineRunner: Spring Boot automatically runs the run method once and only once
 * after the application context has been loaded.
 */
@Transactional
@Component
public class SeedData
        implements CommandLineRunner
{
    /**
     * COMMENTED OUT CODE IN THIS CLASS IS ONLY NEEDED WHEN INITIALLY SEEDING DB
     * IF DS UPDATES DATA, NEW DATA WILL NEED TO BE PULLED IN
     */
    /**
     * Connects the user service to this process
     */
//    @Autowired
//    UserService userService;
//
    @Autowired
    CityService cityService;

    /**
     * Generates test, seed data for our application
     * First a set of known data is seeded into our database.
     * Second a random set of data using Java Faker is seeded into our database.
     * Note this process does not remove data from the database. So if data exists in the database
     * prior to running this process, that data remains in the database.
     *
     * @param args The parameter is required by the parent interface but is not used in this process.
     */
//    @Transactional
    @Override
    public void run(String[] args) throws
            Exception
    {
        RestTemplate restTemplate = new RestTemplate();
//        // telling our RestTemplate what format to expect, in this case Json
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        converter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));
        restTemplate.getMessageConverters()
                .add(converter);
//
        // create the responseType expected. In this case DSCity is the type
        ParameterizedTypeReference<ArrayList<CityIdName>> responseType = new ParameterizedTypeReference<>()
        {
        };

        ArrayList<CityIdName> ourCityData = new ArrayList<CityIdName>();
        // create responseEntity
        ResponseEntity<ArrayList<CityIdName>> responseEntity = restTemplate.exchange("https://labs27-c-citrics-api.herokuapp.com/cities/allid",
                HttpMethod.GET,
                null,
                responseType);

        ourCityData = responseEntity.getBody();
        System.out.println(ourCityData);
        for (CityIdName city : ourCityData) {
//            System.out.println(city.getCityid());
            RestTemplate restTemplate2 = new RestTemplate();
//        // telling our RestTemplate what format to expect, in this case Json
            MappingJackson2HttpMessageConverter converter2 = new MappingJackson2HttpMessageConverter();
            converter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));
            restTemplate.getMessageConverters()
                    .add(converter2);
//
            // create the responseType expected. In this case DSCity is the type
            ParameterizedTypeReference<City> responseType2 = new ParameterizedTypeReference<>()
            {
            };
            // create responseEntity
            ResponseEntity<City> responseEntity2 = restTemplate2.exchange("https://labs27-c-citrics-api.herokuapp.com/cities/city/" + city.getCityid(),
                    HttpMethod.GET,
                    null,
                    responseType2);

            City newCity = responseEntity2.getBody();
            cityService.save(newCity);
            System.out.println(newCity);
        }

        System.out.println("Completed");
    }
}