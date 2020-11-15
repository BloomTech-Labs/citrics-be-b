package com.lambdaschool.foundation.services;

import com.lambdaschool.foundation.exceptions.ResourceNotFoundException;
import com.lambdaschool.foundation.models.PopulationHistory;
import com.lambdaschool.foundation.repository.PopulationHistRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service(value = "populationHistService")
public class PopulationHistServiceImp implements PopulationHistService {

  @Autowired
  private PopulationHistRepository poprepo;

  @Override
  public List<PopulationHistory> findAll() {
    List<PopulationHistory> populations = new ArrayList<>();

    poprepo.findAll().iterator().forEachRemaining(populations::add);

    return populations;
  }

  @Override
  public PopulationHistory findById(long id) {
    return poprepo
      .findById(id)
      .orElseThrow(
        () ->
          new ResourceNotFoundException(
            "Historical Population id " + id + " not found!"
          )
      );
  }
}
