package lv.javaguru.lesson2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // DecimalFormat Decimal = new DecimalFormat("0.00");


        System.out.println("Ievadi pirmo skaitli");

        int firstNumber = scanner.nextInt();
        System.out.println("Ievadi otro skaitli");
        int secondNumber = scanner.nextInt();

        double sum, difference, differenceReversed, multipication, division, divisionReversed;

        sum = firstNumber + secondNumber;

        difference = firstNumber - secondNumber;
        differenceReversed = secondNumber - firstNumber;
        multipication = firstNumber * (long) secondNumber;
        division = firstNumber / (double) secondNumber;
        divisionReversed = secondNumber/ (double) firstNumber;
        System.out.println("Saskaitot abus skaitļus iegūstam: " + sum + "\n" +
                "Atņemot skaitļus vienu no otra iegūstam: " + difference + " vai " + differenceReversed +  "\n" +
                "Sareizinot skaitļus iegūstam: " + multipication + "\n" +
                "Dalot skaitļus vienu ar otru iegūstam: " + String.format("%.2f", division) +" vai "+ String.format("%.2f", divisionReversed) );


    }
}
