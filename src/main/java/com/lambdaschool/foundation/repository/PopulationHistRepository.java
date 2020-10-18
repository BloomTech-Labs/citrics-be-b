package com.lambdaschool.foundation.repository;

import com.lambdaschool.foundation.models.PopulationHist;
import org.springframework.data.repository.CrudRepository;

public interface PopulationHistRepository extends CrudRepository<PopulationHist, Long>
{
}
