package com.lambdaschool.foundation.services;

import com.lambdaschool.foundation.models.PopulationHistory;
import java.util.List;

public interface PopulationHistService {
  List<PopulationHistory> findAll();
  PopulationHistory findById(long id);
}
