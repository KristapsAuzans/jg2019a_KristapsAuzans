package lv.javaguru.lesson7.HomeWork2;

//rakstām ktram testa gadījumam metodi atsevišķi
public class ArrayServiceTest2 {
    public static void main(String[] args) {
        ArrayService2 first = new ArrayService2();
        int[] array = first.create(10);
        first.fillArrayWithRandomNumbers(array);
        first.printArrayToConsole(array);
        first.sortArray(array);
        first.swapArrays(array);


    }

}
