package com.gjw.DayTwo.StrategyPattern.RecallSimpleFactoryPattern;

/**
 * 具体策略类
 */
public class CashReturn extends CashSuper {

    private double moneyCondition =0.0d;
    private double moneyReturn=0.0d;

    public CashReturn(String moneyCondition, String moneyReturn) {
        this.moneyCondition =Double.parseDouble(moneyCondition);
        this.moneyReturn = Double.parseDouble(moneyReturn);
    }

    @Override
    public double acceptCash(double money) {

        if (money>= moneyCondition){
            money-=moneyReturn;
        }
        return money;
    }
}
