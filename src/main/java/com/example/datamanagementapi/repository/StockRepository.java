package com.example.datamanagementapi.repository;

import com.example.datamanagementapi.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StockRepository extends JpaRepository<Stock, String>, StockRepositoryCustom {
}
