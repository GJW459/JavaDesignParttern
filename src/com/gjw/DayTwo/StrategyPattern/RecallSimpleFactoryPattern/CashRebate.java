package com.gjw.DayTwo.StrategyPattern.RecallSimpleFactoryPattern;

/**
 * 打折场景
 * 具体策略类
 */
public class CashRebate extends CashSuper {

    private double moneyRebate=1.0d;
    public CashRebate(String moneyRebate){
        this.moneyRebate=Double.parseDouble(moneyRebate);
    }


    @Override
    public double acceptCash(double money) {
        return money *moneyRebate;
    }
}
