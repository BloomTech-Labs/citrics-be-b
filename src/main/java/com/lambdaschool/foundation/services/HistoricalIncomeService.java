package com.lambdaschool.foundation.services;

import com.lambdaschool.foundation.models.HistoricalIncome;

import java.util.List;

public interface HistoricalIncomeService
{
    List<HistoricalIncome> findAll();

    HistoricalIncome findById(long id);
}
