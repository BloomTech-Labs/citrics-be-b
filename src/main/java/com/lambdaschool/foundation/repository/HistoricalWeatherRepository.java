package com.lambdaschool.foundation.repository;

import com.lambdaschool.foundation.models.HistoricalWeather;
import org.springframework.data.repository.CrudRepository;

public interface HistoricalWeatherRepository extends CrudRepository<HistoricalWeather, Long>
{
}
