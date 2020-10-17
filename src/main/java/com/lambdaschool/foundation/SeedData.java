package com.lambdaschool.foundation;

import com.lambdaschool.foundation.models.City;
import com.lambdaschool.foundation.models.DSCity;
import com.lambdaschool.foundation.services.CityService;
import com.lambdaschool.foundation.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

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
     * Connects the user service to this process
     */
    @Autowired
    UserService userService;

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
    @Transactional
    @Override
    public void run(String[] args) throws
                                   Exception
    {
        // URL of the API we are accessing
        String requestURL = "http://citrics-ds.eba-jvvvymfn.us-east-1.elasticbeanstalk.com/";
        //        String requestURL = "https://labs27-c-citrics-api.herokuapp.com/cities/all";
        /*
         * Creates the object that is needed to do a client side Rest API call.
         * WE are the client getting data from a remote API.
         */
        RestTemplate restTemplate = new RestTemplate();

        // telling our RestTemplate what format to expect, in this case Json
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        converter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));
        restTemplate.getMessageConverters()
            .add(converter);

        // create the responseType expected. In this case DSCity is the type
        ParameterizedTypeReference<DSCity> responseType = new ParameterizedTypeReference<>() {
        };

        /**
         * Loop to fetch cities from DS API
         */
        for (int i = 1; i < 126; i++)
        {
            // create responseEntity
            ResponseEntity<DSCity> responseEntity = restTemplate.exchange(requestURL + i,
                HttpMethod.GET,
                null,
                responseType);

            // print to the console
            DSCity ourCityData = responseEntity.getBody();

            cityService.saveDs(ourCityData);
        }
    }
}