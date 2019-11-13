package lv.javaguru.lesson7.HomeWork1;

//rakstām katram testa gadījumam metodi atsevišķi
public class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayService first = new ArrayService();
        int[] array = first.create(5);
        first.fillArrayWithRandomNumbers(array);
        first.printArrayToConsole(array);
        first.sumInArray(array);
    }

}
