package lv.javaguru.lesson8.HomeWork2;

//"implements Shape" nav nepieciešams, jo AbstractShape šo interfeisu jau implementē
public class Circle extends AbstractShape implements Shape {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public String getName() {
        return "circle";
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);

    }


    @Override
    String color() {
        return "zils";
    }

    @Override
    int edges() {
        return 0;
    }
}
