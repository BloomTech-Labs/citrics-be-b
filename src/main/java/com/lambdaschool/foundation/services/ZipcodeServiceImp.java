package com.lambdaschool.foundation.services;

import com.lambdaschool.foundation.exceptions.ResourceNotFoundException;
import com.lambdaschool.foundation.models.Zipcode;
import com.lambdaschool.foundation.repository.ZipcodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "zipCodeService")
public class ZipcodeServiceImp implements ZipcodeService
{
    @Autowired
    private ZipcodeRepository ziprepo;

    @Override
    public List<Zipcode> findAll()
    {
        List<Zipcode> zips = new ArrayList<>();

        ziprepo.findAll()
            .iterator()
            .forEachRemaining(zips::add);

        return zips;
    }

    @Override
    public Zipcode findById(long id)
    {
        return ziprepo.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Zipcode id " + id + " not found!"));
    }
}
