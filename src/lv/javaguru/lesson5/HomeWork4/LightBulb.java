package lv.javaguru.lesson5.HomeWork4;

public class LightBulb {
    private boolean turnedOn;
    private int currentTurnOnCount;

    public LightBulb(boolean turnedOn, int currentTurnOnCount) {
        this.turnedOn = turnedOn;
        this.currentTurnOnCount = currentTurnOnCount;
    }


    public boolean switcher() {
        if (turnedOn == false && currentTurnOnCount <= 5) {
            currentTurnOnCount++;
            System.out.println("ieslēgts");
            return turnedOn = true;
        } else {
            turnedOn = false;
            System.out.println("izslēgts");
            return turnedOn = false;
        }
    }
}
