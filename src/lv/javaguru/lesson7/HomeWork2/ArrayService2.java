package lv.javaguru.lesson7.HomeWork2;

import java.util.Random;
import java.util.Arrays;

public class ArrayService2 {
    public int[] create(int n) {
        return new int[n];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random randomGenerator = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = randomGenerator.nextInt(101);//šo labak definēt kā konstanti
        }
    }

    public void printArrayToConsole(int[] array) {
        for (int elementOfArray : array) {
            System.out.println(elementOfArray);
        }
    }

    public void sortArray(int[] array) {
        //šeit bija jāizdara tas manuāli, bez utilītas
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public void swapArrays(int[] array){
        int j=0;
        int[] swappedArray = new int[array.length];

        for(int i = array.length-1; i>=0; i--){
           swappedArray[j]= array[i];
           j++;
        }
        System.out.println(Arrays.toString(swappedArray));
    }





}
