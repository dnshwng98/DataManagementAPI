package com.example.datamanagementapi.repository;

import com.example.datamanagementapi.entity.DailyStockTransaction;
import com.example.datamanagementapi.entity.Stock;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.CriteriaUpdate;
import jakarta.persistence.criteria.Root;
import jakarta.transaction.Transactional;

import java.util.List;

public class DailyStockTransactionRepositoryCustomImpl implements DailyStockTransactionRepositoryCustom{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public int saveAllData(List<DailyStockTransaction> dailyStockTransactions) {
        CriteriaBuilder cb = this.entityManager.getCriteriaBuilder();

        int numberOfUpdatedItems = 0;

//        for (DailyStockTransaction dailyStockTransaction : dailyStockTransactions) {
//            CriteriaQuery<DailyStockTransaction> insert = cb.createQuery(DailyStockTransaction.class);
//            insert.
//            CriteriaUpdate<Stock> update = cb.createCriteriaUpdate(Stock.class);
//            Root<Stock> stock = update.from(Stock.class);
//            update.set("dailyReturn", stockElement.getDailyReturn());
//            update.set("relativeDailyPerformance", stockElement.getRelativeDailyPerformance());
//            update.where(cb.equal(stock.get("code"), stockElement.getCode()));
//
//            numberOfUpdatedItems += this.entityManager.createQuery(update).executeUpdate();
//        }

        return numberOfUpdatedItems;
    }
}
