package com.example.datamanagementapi.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "stock")
public class Stock {
    @Id
    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    @Column(name = "relative_daily_performance")
    private double relativeDailyPerformance;

    @Column(name = "daily_return")
    private double dailyReturn;

    public Stock(){}

    public Stock(String code, String name, double relativeDailyPerformance, double dailyReturn){
        this.code = code;
        this.name = name;
        this.relativeDailyPerformance = relativeDailyPerformance;
        this.dailyReturn = dailyReturn;
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

    public double getRelativeDailyPerformance() {
        return relativeDailyPerformance;
    }

    public void setRelativeDailyPerformance(double relativeDailyPerformance) {
        this.relativeDailyPerformance = relativeDailyPerformance;
    }

    public double getDailyReturn() {
        return dailyReturn;
    }

    public void setDailyReturn(double dailyReturn) {
        this.dailyReturn = dailyReturn;
    }
}
