package lv.javaguru.lesson8.HomeWork1;

//Uzdevumā bija teikts, ka "Kopīgajām īpašībām jābūt klasē Mašīna, bet citas īpašības ir jānorāda mantiniekos."
//tā kā bija nepieciešams arī aprakstī kādu unikālu īpašību katram no "mantiniekiem"
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

        return this.speed = speed;  //"this.speed = speed" nav nepieciešama, jo metode vienmēr atgriezīs vienu un to pašu - 13

    }

}
