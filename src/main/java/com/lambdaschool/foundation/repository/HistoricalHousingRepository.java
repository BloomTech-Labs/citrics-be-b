package com.lambdaschool.foundation.repository;

import com.lambdaschool.foundation.models.HistoricalHomeCost;
import org.springframework.data.repository.CrudRepository;

public interface HistoricalHousingRepository extends CrudRepository<HistoricalHomeCost, Long>
{
}
