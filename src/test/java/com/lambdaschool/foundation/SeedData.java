
package com.lambdaschool.foundation;

import com.lambdaschool.foundation.services.CityService;
import com.lambdaschool.foundation.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * SeedData puts both known and random data into the database. It implements CommandLineRunner.
 * <p>
 * CoomandLineRunner: Spring Boot automatically runs the run method once and only once
 * after the application context has been loaded.
 */
@Transactional
//@Component
public class SeedData
    implements CommandLineRunner {
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
                                   Exception {

    }
}