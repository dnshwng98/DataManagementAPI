package com.example.datamanagementapi.repository;

import com.example.datamanagementapi.entity.Stock;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.*;
import jakarta.transaction.Transactional;

import java.util.List;

public class StockRepositoryCustomImpl implements StockRepositoryCustom {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public int updateAllStockData(List<Stock> stockList) {
        CriteriaBuilder cb = this.entityManager.getCriteriaBuilder();

        int numberOfUpdatedItems = 0;

        for (Stock stockElement : stockList) {
            CriteriaUpdate<Stock> update = cb.createCriteriaUpdate(Stock.class);
            Root<Stock> stock = update.from(Stock.class);
            update.set("dailyReturn", stockElement.getDailyReturn());
            update.set("relativeDailyPerformance", stockElement.getRelativeDailyPerformance());
            update.where(cb.equal(stock.get("code"), stockElement.getCode()));

            numberOfUpdatedItems += this.entityManager.createQuery(update).executeUpdate();
        }

        return numberOfUpdatedItems;
    }
}
