package com.example.datamanagementapi.util;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class Util {
    public List<Map<String, String>> reformatDailyStockTransactionData() {
        List<Map<String, String>> reformattedDailyStockTransactionData = new ArrayList<>();
        return reformattedDailyStockTransactionData;
    }
}
