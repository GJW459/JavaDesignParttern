package com.gjw.DayOne.SimpleFactoryPattern;

public class OperationDiv extends Operation {

    @Override
    public double getResult() throws Exception {
        double result=0;
        //这里可能出现异常
        if (getNumberB()==0){
            throw new Exception("除数不能为0");
        }
        result=getNumberA()/getNumberB();
        return result;
    }
}
