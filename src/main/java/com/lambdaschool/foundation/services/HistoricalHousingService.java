package com.lambdaschool.foundation.services;

import com.lambdaschool.foundation.models.HistoricalHomeCost;

import java.util.List;

public interface HistoricalHousingService
{
    List<HistoricalHomeCost> findAll();

    HistoricalHomeCost findById(long id);
}
