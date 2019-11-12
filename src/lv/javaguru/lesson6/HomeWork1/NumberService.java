package lv.javaguru.lesson6.HomeWork1;

import java.util.Scanner;

//datu ivadei ir janotiek ārpus NUmberService klases
public class NumberService {
    private int firstNumber;
    private int secondNumber;

    public void setFirstNumber() {
        System.out.println("Ievadi pirmo skaitli ");
        Scanner scanner = new Scanner(System.in);
        this.firstNumber = scanner.nextInt();

    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setSecondNumber() {
        System.out.println("Ievadi otro skaitli ");
        Scanner scanner = new Scanner(System.in);
        this.secondNumber = scanner.nextInt();

    }

    public int getSecondNumber() {
        return secondNumber;
    }

    //šai metode ir jāpadod nepieciešamās ieejas vērtības kā metodes parametri un atdot aprēķināto vērtību
    public void sumInRange() {
        int i = getSecondNumber();
        int j = getFirstNumber();
        int sum = 0;

        if (getFirstNumber() > getSecondNumber()) {
            //šo loģiku jāiznes atsevišķā metodē, jo tā atkārtojās
            while (getFirstNumber() - 1 > i) {
                sum = sum + i + 1;
                i++;
            }

        } else if (getFirstNumber() < getSecondNumber()) {
            while (getSecondNumber() - 1 > j) {
                sum = sum + j + 1;
                j++;
            }
        }
//        šai izvadei ir jābūt testa klasē
        System.out.println("Starpskaitļu summa ir: " + sum);
    }

//skatīt iepriekšējos komentārus
    public void getEvenNumberCount() {
        int i = getFirstNumber();
        int j = getSecondNumber();
        int sum = 0;
        if (getFirstNumber() < getSecondNumber()) {
            for (i = getFirstNumber(); i <= j; i++) {
                if (i % 2 == 0) {
                    sum = i + sum;
                }
            }

        } else if (getFirstNumber() > getSecondNumber()) {
            for (j = getSecondNumber(); j <= i; j++) {
                if (j % 2 == 0) {
                    sum = j + sum;
                }
            }
        }
        System.out.println("Pāra skaitļu summa ir: " + sum);
    }
}

