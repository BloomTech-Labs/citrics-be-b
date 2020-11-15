package com.lambdaschool.foundation.repository;

import com.lambdaschool.foundation.models.PopulationHistory;
import org.springframework.data.repository.CrudRepository;

public interface PopulationHistRepository
  extends CrudRepository<PopulationHistory, Long> {}
