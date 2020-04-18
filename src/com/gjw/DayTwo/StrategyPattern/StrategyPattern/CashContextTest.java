package com.gjw.DayTwo.StrategyPattern.StrategyPattern;

public class CashContextTest {

    public static void main(String[] args) {
        CashContext cashContext=new CashContext("打五折");
        double result = cashContext.getResult(500);
        System.out.println(result);
    }
}
