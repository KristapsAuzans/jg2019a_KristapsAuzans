package lv.javaguru.lesson6.HomeWork2;

public class CarTest {
    public static void main(String[] args) {
        Car first = new Car("Ford", "Grey", 210, 67);

        first.accelerate();
        first.slowDown();
        first.isDriving();
        first.canAccelerate();
        first.speedUp();

        System.out.println("Current speed is " + first.getCurrentSpeed());
    }
}
