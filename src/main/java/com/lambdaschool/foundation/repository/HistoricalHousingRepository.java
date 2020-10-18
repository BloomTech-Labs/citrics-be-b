package com.lambdaschool.foundation.repository;

import com.lambdaschool.foundation.models.HistoricalHousing;
import org.springframework.data.repository.CrudRepository;

public interface HistoricalHousingRepository extends CrudRepository<HistoricalHousing, Long>
{
}
