package com.lambdaschool.foundation.services;

import com.lambdaschool.foundation.models.Zipcode;

import java.util.List;

public interface ZipcodeService
{
    List<Zipcode> findAll();

    Zipcode findById(long id);
}
