package com.lambdaschool.foundation.services;

import com.lambdaschool.foundation.exceptions.ResourceFoundException;
import com.lambdaschool.foundation.models.County;
import com.lambdaschool.foundation.repository.CountyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "countyService")
public class CountyServiceImp implements CountyService
{
    @Autowired
    private CountyRepository countyrepo;

    @Override
    public List<County> findAll()
    {
        List<County> counties = new ArrayList<>();

        countyrepo.findAll()
            .iterator()
            .forEachRemaining(counties::add);

        return counties;
    }

    @Override
    public County findById(long id)
    {
        return countyrepo.findById(id)
            .orElseThrow(() -> new ResourceFoundException("County id " + id + " not found!"));
    }
}
