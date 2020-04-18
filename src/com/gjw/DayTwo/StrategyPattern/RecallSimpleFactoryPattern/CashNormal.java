package com.gjw.DayTwo.StrategyPattern.RecallSimpleFactoryPattern;

/**
 * 具体策略类
 */
public class CashNormal extends CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
