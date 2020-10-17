package com.lambdaschool.foundation.services;

import com.lambdaschool.foundation.exceptions.ResourceNotFoundException;
import com.lambdaschool.foundation.models.HistoricalWeather;
import com.lambdaschool.foundation.repository.HistoricalWeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "historicalWeatherService")
public class HistoricalWeatherServiceImp implements HistoricalWeatherService
{
    @Autowired
    private HistoricalWeatherRepository histrepo;

    @Override
    public List<HistoricalWeather> findAll()
    {
        List<HistoricalWeather> weather = new ArrayList<>();

        histrepo.findAll()
            .iterator()
            .forEachRemaining(weather::add);

        return weather;
    }

    @Override
    public HistoricalWeather findById(long id)
    {
        return histrepo.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Historical Weather id " + id + " not found!"));
    }
}
