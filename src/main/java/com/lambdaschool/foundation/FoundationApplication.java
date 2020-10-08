package com.lambdaschool.foundation;

import com.lambdaschool.foundation.models.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

/**
 * Main class to start the application.
 */
@EnableJpaAuditing
@SpringBootApplication
public class FoundationApplication
{
    /**
     * Connect to the system environment where environment variables live.
     */
    @Autowired
    private static Environment env;

    /**
     * If an environment variable is not found, set this to true
     */
    private static boolean stop = false;

    /**
     * If an application relies on an environment variable, check to make sure that environment variable is available!
     * If the environment variable is not available, you could set a default value, or as is done here, stop execution of the program
     *
     * @param envvar The system environment where environment variable live
     */
    private static void checkEnvironmentVariable(String envvar)
    {
        if (System.getenv(envvar) == null)
        {
            stop = true;
        }
    }

    /**
     * Main method to start the application.
     *
     * @param args Not used in this application.
     */
    public static void main(String[] args)
    {
        // Check to see if the environment variables exists. If they do not, stop execution of application.
//        checkEnvironmentVariable("OAUTHCLIENTID");
//        checkEnvironmentVariable("OAUTHCLIENTSECRET");
//        checkEnvironmentVariable("OKTA_CLIENT_ID:");

        /*
         * Creates the object that is needed to do a client side Rest API call.
         * WE are the client getting data from a remote API.
         */
        RestTemplate restTemplate = new RestTemplate();

        // telling our RestTemplate what format to expect, in this case Json
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        converter.setSupportedMediaTypes(Collections.singletonList(MediaType.APPLICATION_JSON));
        restTemplate.getMessageConverters()
            .add(converter);

        // URL of the API we are accessing
        String requestURL = "http://citrics-ds.eba-jvvvymfn.us-east-1.elasticbeanstalk.com/1";

        // create the responseType expected. In this case YearFact is the type
        ParameterizedTypeReference<City> responseType = new ParameterizedTypeReference<>() {
        };

        // create responseEntity
        ResponseEntity<City> responseEntity = restTemplate.exchange(requestURL,
            HttpMethod.GET,
            null,
            responseType);

        // print to the console
        City ourCityData = responseEntity.getBody();
        System.out.println(ourCityData);


        if (!stop)
        {
            SpringApplication.run(FoundationApplication.class,
                args);
        } else
        {
            System.out.println("Environment Variables NOT SET CORRECTLY");
        }
    }
}
