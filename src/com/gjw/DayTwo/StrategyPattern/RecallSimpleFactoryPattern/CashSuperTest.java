package com.gjw.DayTwo.StrategyPattern.RecallSimpleFactoryPattern;

public class CashSuperTest {
    public static void main(String[] args) {
        CashSuper cashAccept = CashFactory.createCashAccept("打五折");
        double cash = cashAccept.acceptCash(200);
        System.out.println(cash);
        CashSuper cashAccept1 = CashFactory.createCashAccept("满300减200");
        double v = cashAccept1.acceptCash(500);
        System.out.println(v);
    }
}
