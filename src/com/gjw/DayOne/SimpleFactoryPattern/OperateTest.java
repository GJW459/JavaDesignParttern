package com.gjw.DayOne.SimpleFactoryPattern;

public class OperateTest {

    public static void main(String[] args) throws Exception {

        Operation operation;
        operation=OperationFactory.createOperate(OperateType.ADD);
        operation.setNumberA(100);
        operation.setNumberB(150);
        double result = operation.getResult();
        System.out.println(result);
        System.out.println("==============");
        operation=OperationFactory.createOperate(OperateType.Div);
        operation.setNumberA(100);
        operation.setNumberB(30);
        result=operation.getResult();
        System.out.println(result);
    }
}
