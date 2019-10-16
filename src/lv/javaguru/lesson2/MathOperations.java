package lv.javaguru.lesson2;

import java.text.DecimalFormat;   //neizmantotos importus dzēšam ārā
import java.util.Scanner;

//Ok
public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // DecimalFormat Decimal = new DecimalFormat("0.00");  //komentētu kodu izdzēšam, tas netiek izmantots un tādēl nav vajadzīgs


        System.out.println("Ievadi pirmo skaitli");

        int firstNumber = scanner.nextInt();
        System.out.println("Ievadi otro skaitli");
        int secondNumber = scanner.nextInt();

        double sum, difference, differenceReversed, multiplication, division, divisionReversed;  //izlabojam "typo"

        sum = firstNumber + secondNumber;

        difference = firstNumber - secondNumber;
        differenceReversed = secondNumber - firstNumber;
        multiplication = firstNumber * (long) secondNumber;  //šeit "kastings" nav nepieciešams
        division = firstNumber / (double) secondNumber;
        divisionReversed = secondNumber/ (double) firstNumber;
        System.out.println("Saskaitot abus skaitļus iegūstam: " + sum + "\n" +
                "Atņemot skaitļus vienu no otra iegūstam: " + difference + " vai " + differenceReversed +  "\n" +
                "Sareizinot skaitļus iegūstam: " + multiplication + "\n" +
                "Dalot skaitļus vienu ar otru iegūstam: " + String.format("%.2f", division) +" vai "+ String.format("%.2f", divisionReversed) );


    }
}