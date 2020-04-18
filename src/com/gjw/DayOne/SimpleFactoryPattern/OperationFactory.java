package com.gjw.DayOne.SimpleFactoryPattern;

/**
 * 生成计算器方法的工厂
 */
public class OperationFactory {

    public static Operation createOperate(OperateType operate) {

        Operation operation = null;
        switch (operate) {

            case ADD: {
                operation = new OperationAdd();
                break;
            }
            case Sub: {
                operation = new OperationSub();
                break;
            }
            case Mul: {
                operation = new OperationMul();
                break;
            }
            case Div: {
                operation = new OperationDiv();
                break;
            }


        }
        return operation;
    }
}
