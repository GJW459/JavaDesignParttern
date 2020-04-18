package com.gjw.DayTwo.StrategyPattern.StrategyPattern;

import com.gjw.DayTwo.StrategyPattern.RecallSimpleFactoryPattern.CashNormal;
import com.gjw.DayTwo.StrategyPattern.RecallSimpleFactoryPattern.CashRebate;
import com.gjw.DayTwo.StrategyPattern.RecallSimpleFactoryPattern.CashReturn;
import com.gjw.DayTwo.StrategyPattern.RecallSimpleFactoryPattern.CashSuper;

/**
 * 定义了一个CashContext这个上下文来保管CashSuper子类:维护对这个类的使用
 */
public class CashContext {

    private CashSuper cs;

    /**
     * 策略模式结合简单工厂
     * @param type
     */
    public CashContext(String type) {
       this.getCs(type);
    }

    private CashSuper getCs(String type) {
        switch (type){
            case "正常收费":{
                this.cs=new CashNormal();
                break;
            }
            case "打五折":{
                this.cs=new CashRebate("0.5");
                break;
            }
            case "满300减200":{
                this.cs=new CashReturn("300","200");
                break;
            }
        }
        return this.cs;
    }

    public double getResult(double money){
       return  cs.acceptCash(money);
    }
}
