package com.lambdaschool.foundation.repository;

import com.lambdaschool.foundation.models.HistoricalCovid;
import org.springframework.data.repository.CrudRepository;

public interface HistoricalCovidRepository extends CrudRepository<HistoricalCovid, Long>
{
}
