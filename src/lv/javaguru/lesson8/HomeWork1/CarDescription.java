package lv.javaguru.lesson8.HomeWork1;

public class CarDescription {
    public static void main(String[] args) {
        CarDescription carDescription = new CarDescription();
        carDescription.passengerCar();
        carDescription.Truck();
        carDescription.Bus();

    }



    private void vehicleDescription(Car vehicle) {
        vehicle.getSpeed();
        System.out.println(vehicle.drive());
        System.out.println(vehicle.stops());
    }


    private void passengerCar() {
        Car Honda = new PassengerCar("Honda");
        vehicleDescription(Honda);
    }

    private void Truck() {
        Truck Mercedes = new Truck("Mercedes");
        vehicleDescription(Mercedes);
    }

    private void Bus() {
        Bus Amoplant = new Bus("Amoplant");
        vehicleDescription(Amoplant);

    }




}
