package lv.javaguru.lesson8.HomeWork1;

public class PassengerCar implements Car {
    private String name;
    private int speed = 0;

    public PassengerCar(String name) {
        this.name = name;
    }

    @Override
    public String drive() {
      return "Car " + name + " is driving with " + speed + " km/h";
    }

    @Override
    public String stops() {
    return  "Car " + name + " does not drive.";

    }

    @Override
    public int getSpeed() {
        speed = 67;
        return this.speed = speed;
    }


}
