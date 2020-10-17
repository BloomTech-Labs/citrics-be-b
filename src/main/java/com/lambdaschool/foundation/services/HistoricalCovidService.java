package com.lambdaschool.foundation.services;

import com.lambdaschool.foundation.models.HistoricalCovid;

import java.util.List;

public interface HistoricalCovidService
{
    List<HistoricalCovid> findAll();

    HistoricalCovid findById(long id);
}
