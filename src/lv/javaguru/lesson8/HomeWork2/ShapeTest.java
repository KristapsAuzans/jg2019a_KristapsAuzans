package lv.javaguru.lesson8.HomeWork2;

public class ShapeTest {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        Rectangle rectangle = new Rectangle(59, 32);


        Shape[] nextShape = {circle, rectangle};
        for (Shape shape: nextShape){
            System.out.println(shape);
        }



    }
}
