package com.example.datamanagementapi.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "daily_stock_transaction")
public class DailyStockTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_transaction")
    private String idTransaction;

    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    @Column(name = "open")
    private int open;

    @Column(name = "close")
    private int close;

    @Column(name = "change")
    private int change;

    @Column(name = "change_percentage")
    private double changePercentage;

    @Column(name = "transaction_datetime")
    private Date transactionDatetime;

    public DailyStockTransaction(){};

    public String getIdTransaction() {
        return idTransaction;
    }

    public void setIdTransaction(String idTransaction) {
        this.idTransaction = idTransaction;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOpen() {
        return open;
    }

    public void setOpen(int open) {
        this.open = open;
    }

    public int getClose() {
        return close;
    }

    public void setClose(int close) {
        this.close = close;
    }

    public int getChange() {
        return change;
    }

    public void setChange(int change) {
        this.change = change;
    }

    public double getChangePercentage() {
        return changePercentage;
    }

    public void setChangePercentage(double changePercentage) {
        this.changePercentage = changePercentage;
    }

    public Date getTransactionDatetime() {
        return transactionDatetime;
    }

    public void setTransactionDatetime(Date transactionDatetime) {
        this.transactionDatetime = transactionDatetime;
    }
}
