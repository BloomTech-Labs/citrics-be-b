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
public class SeedDataTest
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
*/
        /**
         * Extra dummy data for 5 cities until DS gets V2 completed
         */
        City c1 = cityService.findByName("Washington, District of Columbia");
        City c2 = cityService.findByName("Fort Lauderdale, Florida");
        City c3 = cityService.findByName("Rancho Cucamonga, California");
        City c4 = cityService.findByName("Little Rock, Arkansas");
        City c5 = cityService.findByName("Beverly Hills, California");

        c1.setPopulationdensityrating(20);
        c1.setSafteyratingscore(90);
        c1.setCostoflivingscore(15);
        c1.setAverageincome(110287d);
        c1.setAveragetemperature(100);
        c1.setLat(33.3367f);
        c1.setLon(-90.1234f);

        c2.setPopulationdensityrating(43);
        c2.setSafteyratingscore(86);
        c2.setCostoflivingscore(12);
        c2.setAverageincome(39477d);
        c2.setAveragetemperature(70);
        c2.setLat(32.7673f);
        c2.setLon(-96.7776f);

        c3.setPopulationdensityrating(6);
        c3.setSafteyratingscore(2);
        c3.setCostoflivingscore(77);
        c3.setAverageincome(100245d);
        c3.setAveragetemperature(68);
        c3.setLat(35.0768f);
        c3.setLon(-85.3082f);

        c4.setPopulationdensityrating(42);
        c4.setSafteyratingscore(6);
        c4.setCostoflivingscore(45);
        c4.setAverageincome(40677d);
        c4.setAveragetemperature(65);
        c4.setLat(40.3086f);
        c4.setLon(-76.846f);

        c5.setPopulationdensityrating(51);
        c5.setSafteyratingscore(78);
        c5.setCostoflivingscore(51);
        c5.setAverageincome(87091d);
        c5.setAveragetemperature(57);
        c5.setLat(39.7495f);
        c5.setLon(-89.606f);
    }
}