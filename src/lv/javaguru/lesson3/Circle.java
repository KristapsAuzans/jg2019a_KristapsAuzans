package lv.javaguru.lesson3;

public class Circle {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }


    double calculateArea() {
        double areaNotRound = Math.PI * Math.pow(radius, 2);
        double area = Math.round(areaNotRound * 100.0) / 100.0;
        return area;
    }


}
