package com.lambdaschool.foundation.services;

import com.lambdaschool.foundation.models.PopulationHist;

import java.util.List;

public interface PopulationHistService
{
    List<PopulationHist> findAll();
    PopulationHist findById(long id);
}
