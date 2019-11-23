package lv.javaguru.lesson8.HomeWork1;

public class Bus implements Car {
    private String name;
    private int speed = 0;

    public Bus(String name) {
        this.name = name;
    }

    @Override
    public String drive() {
        return "Bus " + name + " is driving with " + speed + " km/h";
    }

    @Override
    public String stops() {
        return  "Bus " + name + " does not drive.";
    }

    @Override
    public int getSpeed() {
        speed = 13;

        return this.speed = speed;
    }

}
