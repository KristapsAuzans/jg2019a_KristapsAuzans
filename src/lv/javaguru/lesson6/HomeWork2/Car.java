package lv.javaguru.lesson6.HomeWork2;

public class Car {
    private String model;
    private String color;
    private int maxSpeed;
    private int currentSpeed;

    public Car(String model, String color, int maxSpeed, int currentSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = currentSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void accelerate() {
        if(currentSpeed<maxSpeed){
            currentSpeed++;
        }
    }



    public void slowDown() {
        if(currentSpeed>0){
        currentSpeed--;
               }
    }

    public boolean isDriving() {
        if (currentSpeed > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean canAccelerate(){
        if (currentSpeed<maxSpeed){
            return true;
        }
        else{
            return false;
        }
    }

    public void speedUp() {
        int i;
        for (i = currentSpeed; i <= maxSpeed; i++) {
            currentSpeed = i;
        }
    }

    /*

metode (speedUp), kas palielina pašreizējo ātrumu (currentSpeed) par 1 vienību līdz maksimumam. Jūs varat izmantot metodi accelerate ciklā.
Pārbaudiet klases Car darbu.

     */
}
