package com.lambdaschool.foundation.services;

import com.fasterxml.jackson.databind.JsonNode;
import com.lambdaschool.foundation.exceptions.ResourceNotFoundException;
import com.lambdaschool.foundation.models.User;
import com.lambdaschool.foundation.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Implements UserService Interface
 */
@Transactional
@Service(value = "userService")
public class UserServiceImpl
    implements UserService
{
    /**
     * Connects this service to the User table.
     */
    private final UserRepository userRepository;

    private final HelperFunctions helperFunctions;

    public UserServiceImpl(UserRepository userRepository, HelperFunctions helperFunctions) {
        this.userRepository = userRepository;
        this.helperFunctions = helperFunctions;
    }

    @Override
    public User findUserById(long id) throws
                                      ResourceNotFoundException
    {
        return userRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("User id " + id + " not found!"));
    }

    @Override
    public List<User> findByNameContaining(String username)
    {

        return userRepository.findByUsernameContainingIgnoreCase(username.toLowerCase());
    }

    @Override
    public List<User> findAll()
    {
        List<User> list = new ArrayList<>();
        /*
         * findAll returns an iterator set.
         * iterate over the iterator set and add each element to an array list.
         */
        userRepository.findAll()
            .iterator()
            .forEachRemaining(list::add);
        return list;
    }

    @Transactional
    @Override
    public void delete(long id)
    {
        userRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("User id " + id + " not found!"));
        userRepository.deleteById(id);
    }

    @Override
    public User findByName(String name)
    {
        User uu = userRepository.findByUsername(name.toLowerCase());
        if (uu == null)
        {
            throw new ResourceNotFoundException("User name " + name + " not found!");
        }
        return uu;
    }

    @Transactional
    @Override
    public User save(User user)
    {

        User newUser = new User();

        if (user.getUserId() != 0)
        {
            userRepository.findById(user.getUserId())
                .orElseThrow(() -> new ResourceNotFoundException("User id " + user.getUserId() + " not found!"));
            newUser.setUserId(user.getUserId());
        }

        newUser.setUsername(user.getUsername()
            .toLowerCase());

        return userRepository.save(newUser);
    }

    @Transactional
    @Override
    public User update(
        JsonNode newValues,
        long id)
    {
        User currentUser = findUserById(id);

        // update own thing
        // admin update
//        if (helperFunctions.isAuthorizedToMakeChange(currentUser.getUsername()))
        if (true)
        {
            currentUser.update(newValues);
            return userRepository.save(currentUser);
        } else
        {
            throw new ResourceNotFoundException("This user is not authorized to make change");
        }
    }

    @Transactional
    @Override
    public void deleteAll()
    {
        userRepository.deleteAll();
    }
}
