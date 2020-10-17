package com.lambdaschool.foundation.services;

import com.lambdaschool.foundation.models.User;
import com.lambdaschool.foundation.repository.UserRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;

@SpringBootTest
class UserServiceImplTest {

    @Autowired
    UserService userService;

    @MockBean
    private UserRepository userrepos;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void findUserById() {
        User u1 = new User("Arthur");
        u1.setUserid(1);

        Mockito.doReturn(Optional.of(u1))
            .when(userrepos)
            .findById(1L);

        u1 = userService.findUserById(1);

        // will return lowercase name.
        assertEquals("arthur",
            u1.getUsername());
    }

    @Test
    void findByNameContaining() {
        User u1 = new User("Arthur");
        User u2 = new User("Cathcart");

        Mockito.doReturn(Arrays.asList(u1, u2))
            .when(userrepos)
            .findByUsernameContainingIgnoreCase("art");

        // intentional capital R to test ignoring case functionality
        List<User> users = userService.findByNameContaining("aRt");

        // will return lowercase name
        assertEquals(2,
            userService.findByNameContaining("art")
                .size());
    }

    @Test
    void findAll() {
    }

    @Test
    void delete() {
    }

    @Test
    void findByName() {
    }

    @Test
    void save() {
    }

    @Test
    void update() {
    }

    @Test
    void deleteAll() {
    }
}