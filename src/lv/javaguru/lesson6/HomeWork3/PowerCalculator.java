package lv.javaguru.lesson6.HomeWork3;

import java.util.Scanner;

public class PowerCalculator {
    private int number;
    private int power;

    public void setNumber() {
        System.out.println("Ievadi bāzi ");
        Scanner scanner = new Scanner(System.in);
        this.number = scanner.nextInt();
    }

    public int getNumber() {
        return number;
    }

    public void setPower() {
        System.out.println("Ievadi kāpinātāju ");
        Scanner scanner = new Scanner(System.in);
        this.power = scanner.nextInt();
    }

    public int getPower() {
        return power;
    }

    public void boosting() {
        int i;
        int result = number;
        for (i = 1; i < power; i++) {
            result = result * number;
        }

        System.out.println("Rezultāts: " + result);
    }
}
