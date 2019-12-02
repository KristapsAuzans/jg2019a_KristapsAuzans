package lv.javaguru.lesson8.HomeWork3;

//skatīt komentārus "AdditionOperation"
public class DivisionOperation implements MathOperation{
    double firstNumber;
    double secondNumber;
    public DivisionOperation(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    @Override
    public double execute(double firstNumber, double secondNumber) {
        double result = firstNumber/secondNumber;
        System.out.println("Rezultāts dalot " + firstNumber + " un " + secondNumber + " ir " + result);
        return result;
    }
}
