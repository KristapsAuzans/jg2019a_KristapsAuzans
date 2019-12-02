package lv.javaguru.lesson8.HomeWork2;

public abstract class   AbstractShape implements Shape {

    abstract String color();
    abstract int edges();

    public String toString() {
        return "\n Name of the Figure is called " +getName()+ " it is "+ color() +
                "\n It has " + edges() + " edges "+
                "\n it's area is " + getArea();
    }
}

