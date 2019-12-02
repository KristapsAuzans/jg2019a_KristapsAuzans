package lv.javaguru.lesson8.HomeWork1;

//Uzdevumā bija teikts, ka "Kopīgajām īpašībām jābūt klasē Mašīna, bet citas īpašības ir jānorāda mantiniekos."
//tā kā bija nepieciešams arī aprakstī kādu unikālu īpašību katram no "mantiniekiem"
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
        return this.speed = speed;//"this.speed = speed" nav nepieciešama, jo metode vienmēr atgriezīs vienu un to pašu - 67
    }


}
