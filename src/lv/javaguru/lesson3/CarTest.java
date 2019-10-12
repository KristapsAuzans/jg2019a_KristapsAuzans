package lv.javaguru.lesson3;

public class CarTest {
    public static void main(String[] args) {
        Car first = new Car();
        first.setColor("Grey");
        first.setManufacturer("Ford");
        first.setYear(2017);

        System.out.println("The car is in " + first.getColor() + "\n" + "The brand of the car is "
                + first.getManufacturer() + "\n" + "it has been produced in " + first.getYear());


    }
}
