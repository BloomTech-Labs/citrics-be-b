package com.lambdaschool.foundation.services;

import com.lambdaschool.foundation.exceptions.ResourceNotFoundException;
import com.lambdaschool.foundation.models.HistoricalIncome;
import com.lambdaschool.foundation.repository.HistoricalIncomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "historicalIncomeService")
public class HistoricalIncomeServiceImp implements HistoricalIncomeService
{
    @Autowired
    private HistoricalIncomeRepository histrepo;

    @Override
    public List<HistoricalIncome> findAll()
    {
        List<HistoricalIncome> incomes = new ArrayList<>();

        histrepo.findAll()
            .iterator()
            .forEachRemaining(incomes::add);

        return incomes;
    }

    @Override
    public HistoricalIncome findById(long id)
    {
        return histrepo.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Historical Housing id " + id + " not found!"));
    }
}
