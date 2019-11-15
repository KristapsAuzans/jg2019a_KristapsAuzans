package lv.javaguru.lesson7.HomeWork3;

import java.util.Arrays;

public class Palindrome {
    public boolean palindromeTest;

    public boolean isPalindrome(int[] array) {
        int j = 0;
        int[] swappedArray = new int[array.length];

        for (int i = array.length - 1; i >= 0; i--) {
            swappedArray[j] = array[i];
            j++;
        }

        if (Arrays.equals(array, swappedArray)) {
            palindromeTest = true;
            System.out.println("true");
        } else {
            palindromeTest = false;
            System.out.println("false");
        }

        return palindromeTest;
    }

}


