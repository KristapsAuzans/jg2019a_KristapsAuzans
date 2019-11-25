package lv.javaguru.lesson9.HomeWork1;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordCollection {
    Set<String> word = new HashSet<String>();

    public void addWord() {
        word.add("UniqueWord1");
        word.add("UniqueWord1");
        word.add("UniqueWord3");
        word.add("UniqueWord5");
    }

    public void getUniqueWords() {
        int i = 0;
        for (String uniqueWord : word) {
            i++;
        }
        System.out.println("Number of entries " + i);
    }

    public void printToConsole() {
        System.out.println(word);
    }

}
