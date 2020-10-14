package com.lambdaschool.foundation.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lambdaschool.foundation.models.City;
import com.lambdaschool.foundation.models.UserCities;
import com.lambdaschool.foundation.services.CityService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.lambdaschool.foundation.FoundationApplication;
import com.lambdaschool.foundation.models.User;
import com.lambdaschool.foundation.services.UserService;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
    classes = FoundationApplication.class)
@AutoConfigureMockMvc

class UserControllerTest {

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;

    @MockBean
    private CityService cityService;

    List<User> userList;

    @BeforeEach
    void setUp() {
        userList = new ArrayList<>();

//        UserCities uc1 = new UserCities();

        City c1 = cityService.findByName("Washington, District of Columbia");
        c1.setPopulationdensityrating(20);
        c1.setSafteyratingscore(90);
        c1.setCostoflivingscore(15);
        c1.setAverageincome(110287d);
        c1.setAveragetemperature(100);
        c1.setLat(33.3367f);
        c1.setLon(-90.1234f);

        City c2 = cityService.findByName("Fort Lauderdale, Florida");
        c2.setPopulationdensityrating(43);
        c2.setSafteyratingscore(86);
        c2.setCostoflivingscore(12);
        c2.setAverageincome(39477d);
        c2.setAveragetemperature(70);
        c2.setLat(32.7673f);
        c2.setLon(-96.7776f);

        User u1 = new User("Arthur");

        userList.add(u1);
        User u2 = new User("James");
        userList.add(u2);

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void listAllUsers() throws Exception {
        String apiUrl = "/users/users";

        Mockito.when(userService.findAll())
            .thenReturn(userList);

        RequestBuilder rb = MockMvcRequestBuilders.get(apiUrl)
            .accept(MediaType.APPLICATION_JSON);

        // the following actually performs a real controller call
        MvcResult r = mockMvc.perform(rb)
            .andReturn(); // this could throw an exception
        String tr = r.getResponse()
            .getContentAsString();

        ObjectMapper mapper = new ObjectMapper();
        String er = mapper.writeValueAsString(userList);

        System.out.println("Expect: " + er);
        System.out.println("Actual: " + tr);

        assertEquals("Rest API Returns List",
            er,
            tr);
    }

    @Test
    void getUserById() {
    }

    @Test
    void getUserByName() {
    }

    @Test
    void getUserLikeName() {
    }

    @Test
    void addNewUser() {
    }

    @Test
    void updateFullUser() {
    }

    @Test
    void updateUser() {
    }

    @Test
    void deleteUserById() {
    }

    @Test
    void getCurrentUserInfo() {
    }
}