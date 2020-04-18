package com.gjw.DayTwo.StrategyPattern.RecallSimpleFactoryPattern;

public class CashFactory {

    public static CashSuper createCashAccept(String type){

        CashSuper cashSuper=null;
        switch (type){
            case "正常收费":{
                cashSuper=new CashNormal();
                break;
            }
            case "打五折":{
                cashSuper=new CashRebate("0.5");
                break;
            }
            case "满300减200":{
                cashSuper=new CashReturn("300","200");
                break;
            }
        }
        return cashSuper;
    }
}
