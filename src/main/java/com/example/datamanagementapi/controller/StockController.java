package com.example.datamanagementapi.controller;

import com.example.datamanagementapi.entity.DailyStockTransaction;
import com.example.datamanagementapi.entity.Stock;
import com.example.datamanagementapi.repository.StockRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StockController {
    private final StockRepository stockRepository;

    public StockController(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    @GetMapping("/retrieveAllStockData")
    public Iterable<Stock> retrieveStockData() {
        return this.stockRepository.findAll();
    }

    @PostMapping("/saveAllStockData")
    public String saveAllStockData(@RequestBody List<Stock> stockList) {
        try {
            this.stockRepository.saveAll(stockList);
            return "All stock data was saved";
        } catch (Exception e) {
            return "Failed to save stock data...";
        }
    }

    @PostMapping("/updateAllStockData")
    public String updateAllStockData(@RequestBody List<Stock> stockList) {
        return this.stockRepository.updateAllStockData(stockList) + " entities was updated";
    }
}
