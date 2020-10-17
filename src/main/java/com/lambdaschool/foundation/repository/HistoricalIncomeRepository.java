package com.lambdaschool.foundation.repository;

import com.lambdaschool.foundation.models.HistoricalIncome;
import org.springframework.data.repository.CrudRepository;

public interface HistoricalIncomeRepository extends CrudRepository<HistoricalIncome, Long>
{
}
