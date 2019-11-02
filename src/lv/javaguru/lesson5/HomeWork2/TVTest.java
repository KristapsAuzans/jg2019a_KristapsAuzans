package lv.javaguru.lesson5.HomeWork2;

public class TVTest {
    public static void main(String[] args) {
        TV first = new TV();
        first.setCurrentChannel(4);
        first.setCurrentVolume(54);
        first.setManufacturer("LG");

        first.turnOn();
        first.nextChannel();
        first.nextChannel();
        first.decreaseVolume();
        first.decreaseVolume();

        System.out.println(first.toString());

    }
}
