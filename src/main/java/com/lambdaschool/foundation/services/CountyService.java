package com.lambdaschool.foundation.services;

import com.lambdaschool.foundation.models.County;

import java.util.List;

public interface CountyService
{
    List<County> findAll();

    County findById(long id);
}
