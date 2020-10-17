package com.lambdaschool.foundation.services;

import com.lambdaschool.foundation.exceptions.ResourceNotFoundException;
import com.lambdaschool.foundation.models.PopulationHist;
import com.lambdaschool.foundation.repository.PopulationHistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "populationHistService")
public class PopulationHistServiceImp implements PopulationHistService
{
    @Autowired
    private PopulationHistRepository poprepo;

    @Override
    public List<PopulationHist> findAll()
    {
        List<PopulationHist> populations = new ArrayList<>();

        poprepo.findAll()
            .iterator()
            .forEachRemaining(populations::add);

        return populations;
    }

    @Override
    public PopulationHist findById(long id)
    {
        return poprepo.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Historical Population id " + id + " not found!"));
    }
}
