package com.lambdaschool.foundation.services;

import com.lambdaschool.foundation.models.HistoricalHousing;

import java.util.List;

public interface HistoricalHousingService
{
    List<HistoricalHousing> findAll();

    HistoricalHousing findById(long id);
}
