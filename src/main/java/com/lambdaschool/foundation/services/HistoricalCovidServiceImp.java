package com.lambdaschool.foundation.services;

import com.lambdaschool.foundation.exceptions.ResourceNotFoundException;
import com.lambdaschool.foundation.models.HistoricalCovid;
import com.lambdaschool.foundation.repository.HistoricalCovidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "historicalCovidService")
public class HistoricalCovidServiceImp implements HistoricalCovidService
{
    @Autowired
    private HistoricalCovidRepository historicalCovidRepository;

    @Override
    public List<HistoricalCovid> findAll()
    {
        List<HistoricalCovid> cases = new ArrayList<>();

        historicalCovidRepository.findAll()
            .iterator()
            .forEachRemaining(cases::add);

        return cases;
    }

    @Override
    public HistoricalCovid findById(long id)
    {
        return historicalCovidRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Covid id " + id + " not found!"));
    }
}
