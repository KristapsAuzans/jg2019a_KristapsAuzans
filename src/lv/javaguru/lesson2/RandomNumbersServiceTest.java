package lv.javaguru.lesson2;

import java.util.Random;

//OK
//šis gan nebūs īsti tests, "RandomNumbersServiceTest" klasei ir jatestē klase - "RandomNumbersService"
public class RandomNumbersServiceTest {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int generatedNumber1 = randomGenerator.nextInt(1001);
        int generatedNumber2 = randomGenerator.nextInt(1001);
        int generatedNumber3 = randomGenerator.nextInt(1001);
        int result = generatedNumber1 + generatedNumber2 + generatedNumber3;

        System.out.println("Sistēma nejauši izvēlējusies trīs skaitļus, " +
                "\n" + "Pirmais - " + generatedNumber1
                + "\n" + "Pirmais - " + generatedNumber2
                + "\n" + "Pirmais - " + generatedNumber3 +
                "\n" + "\n" + "Šo skaitļu summa ir " + result);
    }
}