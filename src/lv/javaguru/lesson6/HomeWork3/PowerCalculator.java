package lv.javaguru.lesson6.HomeWork3;

import java.util.Scanner;

public class PowerCalculator {
    private int number;
    private int power;

//    šie dati ir jāievada testa klasē
    public void setNumber() {
        System.out.println("Ievadi bāzi ");
        Scanner scanner = new Scanner(System.in);
        this.number = scanner.nextInt();
    }

    public int getNumber() {
        return number;
    }

//    šie dati ir jāievada testa klasē
    public void setPower() {
        System.out.println("Ievadi kāpinātāju ");
        Scanner scanner = new Scanner(System.in);
        this.power = scanner.nextInt();
    }

    public int getPower() {
        return power;
    }

    //šīs metode nosaukuma ir jābūt "pow", un ta ir jāpieņem divi mainīgie number un power
    //un ta ir jāatgriež aprēķinātā vērtība
    public void boosting() {
        int i; //šīm mainīgajam ir jābūt definētam iekš "for": "for (int i = 1; i < power; i++) {"
        int result = number;
        for (i = 1; i < power; i++) {
            result = result * number; //rakstām šādi: result =* number
        }

        //šai izvadei ir jābūt testa klasē
        System.out.println("Rezultāts: " + result);
    }
}
