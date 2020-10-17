package com.lambdaschool.foundation.services;

import com.lambdaschool.foundation.exceptions.ResourceNotFoundException;
import com.lambdaschool.foundation.models.HistoricalHousing;
import com.lambdaschool.foundation.repository.HistoricalHousingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "historicalHousingServiceImp")
public class HistoricalHousingServiceImp implements HistoricalHousingService
{
    @Autowired
    private HistoricalHousingRepository histrepo;

    @Override
    public List<HistoricalHousing> findAll()
    {
        List<HistoricalHousing> cost = new ArrayList<>();

        histrepo.findAll()
            .iterator()
            .forEachRemaining(cost::add);

        return cost;
    }

    @Override
    public HistoricalHousing findById(long id)
    {
        return histrepo.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Historical Housing id " + id + " not found!"));
    }
}
