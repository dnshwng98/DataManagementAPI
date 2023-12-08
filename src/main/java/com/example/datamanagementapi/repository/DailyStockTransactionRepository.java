package com.example.datamanagementapi.repository;

import com.example.datamanagementapi.entity.DailyStockTransaction;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface DailyStockTransactionRepository extends CrudRepository<DailyStockTransaction, Integer> {
    @Query(
            value = "SELECT * FROM daily_stock_transaction WHERE transaction_datetime = :datetime",
    nativeQuery = true)
    List<Map<String, String>> findAllByTransactionDate(@Param("datetime") Date datetime);
}
