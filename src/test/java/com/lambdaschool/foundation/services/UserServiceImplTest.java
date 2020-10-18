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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@SpringBootTest
class UserServiceImplTest {

    @Autowired
    UserService userService;

    @MockBean
    private UserRepository userrepos;

    List<User> userList;

    @BeforeEach
    void setUp() {
        userList = new ArrayList<>();

        User u1 = new User("Arthur");
        u1.setUserid(1);
        userList.add(u1);
        User u2 = new User("James");
        u2.setUserid(2);
        userList.add(u2);

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

        Mockito.doReturn(Arrays.asList(u1,
            u2))
            .when(userrepos)
            .findByUsernameContainingIgnoreCase("art");

        // intentional capital R to test ignoring case functionality
        List<User> users = userService.findByNameContaining("aRt");

        assertEquals(2,
            userService.findByNameContaining("art")
                .size());
    }

    @Test
    void findAll() {
        User u1 = new User("Arthur");
        User u2 = new User("Cathcart");
        User u3 = new User("Edward");

        Mockito.doReturn(Arrays.asList(u1,
            u2,
            u3))
            .when(userrepos)
            .findAll();

        List<User> users = userService.findAll();

        assertEquals(3,
            users.size());
    }

    @Test
    void delete() throws Exception {
    }

    @Test
    void findByName() {
        User u1 = new User("Arthur");
        User u2 = new User("Cathcart");

        Mockito.doReturn(u1)
            .when(userrepos)
            .findByUsername(any());

        u1 = userService.findByName("arthur");

        assertEquals(u1,
            userService.findByName("arthur"));
    }

    @Test
    void save() {
        User u1 = new User("Arthur");

        Mockito.doReturn(u1)
            .when(userrepos)
            .save(any());

        User newUser = userService.save(u1);

        assertSame(u1,
            newUser);
    }

    @Test
    void update() {
    }

    @Test
    void deleteAll() {
    }
}