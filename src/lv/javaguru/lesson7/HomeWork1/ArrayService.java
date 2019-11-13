package lv.javaguru.lesson7.HomeWork1;

import java.util.Random;

//OK
public class ArrayService {

    public int[] create(int n) {
        return new int[n];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random randomGenerator = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = randomGenerator.nextInt(101); //šo labak definēt kā konstanti
        }
    }

    public void printArrayToConsole(int[] array) {
        for (int elementOfArray : array) {
            System.out.println(elementOfArray);
        }
    }

    public void sumInArray(int[] array) {
        int sumOfArray=0;
        for (int elementOfArray : array){
            sumOfArray = sumOfArray +elementOfArray;
        }
        System.out.println(sumOfArray);

    }

}


