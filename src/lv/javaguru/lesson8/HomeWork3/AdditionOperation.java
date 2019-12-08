package lv.javaguru.lesson8.HomeWork3;

//lietojam "ctrl + alt + l"
public class AdditionOperation implements MathOperation {

    //šeit nav nepieciešams stāvoklis, jo metodē izdara savu daramo un atgriež rezultātu
    //jābūt iekapsulētiem - "private"
    double firstNumber;
    double secondNumber;

    //šis konstruktors nav izmantots
    public AdditionOperation(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    @Override
    public double execute(double firstNumber, double secondNumber) {
        double result = firstNumber + secondNumber;
        //šādas "sout" izvades var likt tikai
        System.out.println("Rezultāts saskaitot " + firstNumber + " un " + secondNumber + " ir " + result);
        return result;
    }
}
