package lv.javaguru.lesson5.HomeWork4;

public class LightBulb {
    private boolean turnedOn;
    private int currentTurnOnCount;

    public LightBulb(boolean turnedOn, int currentTurnOnCount) {
        this.turnedOn = turnedOn;
        this.currentTurnOnCount = currentTurnOnCount;
    }


    //metodes nosaukums neatbilst saturam
    public boolean switcher() {
        //labāk šādi:
//        if (turnedOn && currentTurnOnCount <= 5) {
        // šeit bija nepieciešams izveidot konstanti priekš maksimalā skaita
        if (turnedOn == false && currentTurnOnCount <= 5) {
            currentTurnOnCount++;
            System.out.println("ieslēgts");
            return turnedOn = true;
        } else {
            turnedOn = false;
            System.out.println("izslēgts");
            return turnedOn = false; //ši pēdējā darbība nav nepieciešama, jo stāvoklis nemainās
        }
    }
}
