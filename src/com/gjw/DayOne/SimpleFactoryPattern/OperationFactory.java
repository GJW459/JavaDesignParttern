package com.gjw.DayOne.SimpleFactoryPattern;

/**
 * 生成计算器方法的工厂
 */
public class OperationFactory {

    public static Operation createOperate(String operate) {

        Operation operation = null;
        switch (operate) {

            case "+": {
                operation = new OperationAdd();
                break;
            }
            case "-": {
                operation = new OperationSub();
                break;
            }
            case "*": {
                operation = new OperationMul();
                break;
            }
            case "/": {
                operation = new OperationDiv();
                break;
            }


        }
        return operation;
    }
}
