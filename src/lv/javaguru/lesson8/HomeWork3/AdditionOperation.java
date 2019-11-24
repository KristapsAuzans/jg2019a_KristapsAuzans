package lv.javaguru.lesson8.HomeWork3;

public class AdditionOperation implements MathOperation {
    double firstNumber;
    double secondNumber;
    public AdditionOperation(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    @Override
    public double execute(double firstNumber, double secondNumber) {
        double result = firstNumber+secondNumber;
        System.out.println("Rezultāts saskaitot " + firstNumber + " un " + secondNumber + " ir " + result);
        return result;
    }
}
