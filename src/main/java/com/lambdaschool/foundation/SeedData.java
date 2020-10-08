package com.lambdaschool.foundation;

import com.lambdaschool.foundation.models.City;
import com.lambdaschool.foundation.models.User;
import com.lambdaschool.foundation.services.CityService;
import com.lambdaschool.foundation.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

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
        // The following is an example user!

        // admin, data, user
        User u1 = new User("admin");
        /*
            "password",
            "admin@lambdaschool.local");
        u1.getRoles()
            .add(new UserRoles(u1,
                r1));
        u1.getRoles()
            .add(new UserRoles(u1,
                r2));
        u1.getRoles()
            .add(new UserRoles(u1,
                r3));
        u1.getUseremails()
            .add(new Useremail(u1,
                "admin@email.local"));
        u1.getUseremails()
            .add(new Useremail(u1,
                "admin@mymail.local"));
*/
        userService.save(u1);

        City c1 = new City("Tucson",
            "Arizona",
            20,
            18,
            43d,
            110287,
            66,
            31.9701f,
            -111.8907f);
        City c2 = new City("Dallas",
            "Texas",
            43,
            86,
            12,
            39477d,
            70,
            32.7673f,
            -96.7776f);
        City c3 = new City("Chattonooga",
            "Tennessee",
            6,
            2,
            77,
            100245d,
            68,
            35.0768f,
            -85.3082f);
        City c4 = new City("Harrisburg",
            "Pennsylvania",
            42,
            6,
            45,
            40677d,
            65,
            40.3086f,
            -76.846f);
        City c5 = new City("Springfield",
            "Illinois",
            51,
            78,
            51,
            87091d,
            57,
            39.7495f,
            -89.606f);

        cityService.save(c1);
        cityService.save(c2);
        cityService.save(c3);
        cityService.save(c4);
        cityService.save(c5);
    }
}