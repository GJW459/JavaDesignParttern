package com.gjw.DayTwo.StrategyPattern.RecallSimpleFactoryPattern;

/**
 * 超市收银
 * 抽象策略类 定义算法的共有接口
 */
public abstract class CashSuper {

    /**
     * 参数 为原价
     * @return
     */
    public abstract double acceptCash(double money);
}
