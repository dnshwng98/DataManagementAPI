package com.example.datamanagementapi.repository;

import com.example.datamanagementapi.entity.DailyStockTransaction;

import java.util.List;

public interface DailyStockTransactionRepositoryCustom {
    int saveAllData(List<DailyStockTransaction> dailyStockTransactions);
}
