package lv.javaguru.lesson4.Homework4;

import java.util.Scanner;

public class CreditCard {
    private String cardName;
    private int cardPin;
    private double balance;
    private double creditLimit;
    private double usedCredit;
    private int inputedPin;
    private double inputedAmount;
    private String action;


    public CreditCard(int cardPin, double balance, double creditLimit, double usedCredit) {
        this.cardPin = cardPin;
        this.balance = balance;
        this.creditLimit = creditLimit;
        this.usedCredit = usedCredit;
    }

    public void currentStatus() {
        System.out.println("Your balance: " + balance + "\n" +
                "Your Credit: " + usedCredit + "\n" +
                "Your CreditLimit: " + creditLimit);
    }


    public void chooseAction() {
        Scanner inputPin = new Scanner(System.in);
        System.out.println("Input Pin ");
        this.inputedPin = Integer.parseInt(inputPin.nextLine());
        if (cardPin == inputedPin) {
            currentStatus();
            System.out.println("Choose what you want to do, type: 'withdraw' or 'deposit'");
            Scanner inputAction = new Scanner(System.in);
            this.action = inputAction.nextLine();
            if (action.equals("withdraw")) {
                withdraw();
            } else if (action.equals("deposit")) {
                deposit();
            }
        } else {
            System.out.println("Nepreizs PIN");
            chooseAction();
        }
    }


    public void withdraw() {
        Scanner inputAmount = new Scanner(System.in);
        System.out.println("Input Withdrawal amount ");
        this.inputedAmount = Double.parseDouble(inputAmount.nextLine());
        if (inputedAmount <= balance) {
            this.balance = balance - inputedAmount;
            currentStatus();
        } else if (inputedAmount > balance && creditLimit >= inputedAmount - balance + usedCredit) {
            this.usedCredit = usedCredit + inputedAmount - balance;
            this.balance = 0;
            currentStatus();
        } else {
            System.out.println("Jūsu kredītlimits ir pārsniegts; ");
        }
    }


    public void deposit() {

        Scanner inputAmount = new Scanner(System.in);
        System.out.println("Input Deposit amount ");
        this.inputedAmount = Double.parseDouble(inputAmount.nextLine());
        if (usedCredit == 0) {
            this.balance = balance + inputedAmount;
            currentStatus();
        } else if (usedCredit > 0 && usedCredit >= inputedAmount) {
            usedCredit = usedCredit - inputedAmount;
            currentStatus();
        } else if (usedCredit > 0 && usedCredit <= inputedAmount) {
            balance = balance + inputedAmount - usedCredit;
            usedCredit = 0;
            currentStatus();
        }


    }
}
