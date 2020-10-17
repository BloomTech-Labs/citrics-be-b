package com.lambdaschool.foundation.services;

import com.lambdaschool.foundation.models.HistoricalWeather;

import java.util.List;

public interface HistoricalWeatherService
{
    List<HistoricalWeather> findAll();

    HistoricalWeather findById(long id);
}
