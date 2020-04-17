package com.gjw.DayOne.SimpleFactoryPattern;

public class OperationAdd extends Operation {

    /**
     * 和父类不同的就是计算的方式
     * @return
     */
    @Override
    public double getResult() {
        double result=0;
        result=getNumberA()+getNumberB();
        return result;
    }
}
