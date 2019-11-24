package lv.javaguru.lesson8.HomeWork2;

public class ShapeTest {
    public static void main(String[] args) {
        Circle circle = new Circle(6);
        Rectangle rectangle = new Rectangle(65, 32);


        Shape[] nextShape = {circle, rectangle};
        for (Shape shape: nextShape){
            System.out.println(shape);
        }



    }
}
