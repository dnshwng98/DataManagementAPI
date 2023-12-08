package com.example.datamanagementapi.controller;

import com.example.datamanagementapi.entity.DailyStockTransaction;
import com.example.datamanagementapi.repository.DailyStockTransactionRepository;
import com.example.datamanagementapi.util.Util;
import jakarta.json.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@RestController
public class DailyStockTransactionController {
    @Autowired
    Util util;


    private final DailyStockTransactionRepository dailyStockTransactionRepository;

    public DailyStockTransactionController(DailyStockTransactionRepository dailyStockTransactionRepository) {
        this.dailyStockTransactionRepository = dailyStockTransactionRepository;
    }

    @GetMapping("/retrieveAllDailyStockTransaction")
    public Iterable<DailyStockTransaction> retrieveDailyStockTransaction() {
        return this.dailyStockTransactionRepository.findAll();
    }

    @PostMapping("/retrieveDailyStockTransactionBasedOnDate")
    public List<Map<String, String>> retrieveDailyStockTransactionBasedOnDate(@RequestBody String transactionDate) throws Exception {
        try {
            String pattern = "yyyy-MM-dd";
            SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
            Date date = dateFormat.parse(transactionDate);
            return this.dailyStockTransactionRepository.findAllByTransactionDate(date);
        } catch (ParseException e) {
            throw new Exception("Failed to retrieve daily stock transaction based on date...");
        }
    }

    @PostMapping("/saveAllDailyStockTransaction")
    public String saveMultipleDailyStockMarketTransaction(@RequestBody List<DailyStockTransaction> dailyStockTransactions) {
        try {
            this.dailyStockTransactionRepository.saveAll(dailyStockTransactions);
            return "Daily stock transaction data was saved";
        } catch (Exception e) {
            return "Failed to save daily stock transaction...";
        }
    }
}
