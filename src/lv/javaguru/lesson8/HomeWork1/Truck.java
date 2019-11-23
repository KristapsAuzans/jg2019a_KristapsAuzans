package lv.javaguru.lesson8.HomeWork1;

public class Truck implements Car {
    private String name;
    private int speed = 0;

    public Truck(String name) {
        this.name = name;
    }

    @Override
    public String drive() {
        return "Truck " + name + " is driving with " + speed + " km/h";
    }

    @Override
    public String stops() {
        return "Truck " + name + " does not drive.";
    }

    @Override
    public int getSpeed() {
        speed = 89;
        return this.speed = speed;
    }
}
