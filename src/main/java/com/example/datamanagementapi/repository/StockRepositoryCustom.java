package com.example.datamanagementapi.repository;

import com.example.datamanagementapi.entity.Stock;

import java.util.List;

public interface StockRepositoryCustom {
    int updateAllStockData(List<Stock> stockList);
}
