package lv.javaguru.lesson8.HomeWork3;

import java.util.List;

/*
public abstract class MathOperations implements MathOperation {

    abstract double executeAll();
    //Nav skaidrs, ko darīt ar to ExecuteAll ?!?!

    @Override
    public double execute(double firstNumber, double secondNumber) {
        return 0;
    }
}
*/
public class MathOperations {

    void executeAll(List<MathOperation> operationList,
                      double operandOne,
                      double operandTwo) {

        for(MathOperation operation : operationList) {
            System.out.println(operation.execute(operandOne, operandTwo));
        }
    }
}





