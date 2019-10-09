package lv.javaguru.lesson3;

public class CircleTest {
    public static void main(String[] args) {
        Circle first = new Circle();
        first.setRadius(40);

        System.out.println("Ja R =" + first.getRadius() + " tad laukums ir " + first.calculateArea());
    }
}
