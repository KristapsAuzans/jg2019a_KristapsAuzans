package lv.javaguru.lesson4.HomeWork1;

public class LightColorDetector {
    private int waveLength;

    public void setWaveLength(int waveLength) {
        this.waveLength = waveLength;
    }

    public void detect() {
        if (waveLength >= 380 && waveLength < 450) {
            System.out.println("Šī ir violeta krāsa");
        } else if (waveLength >= 450 && waveLength < 495) {
            System.out.println("Šī ir zila krāsa");
        } else if (waveLength >= 495 && waveLength < 570) {
            System.out.println("Šī ir zaļa krāsa");
        } else if (waveLength >= 570 && waveLength < 590) {
            System.out.println("Šī ir dzeltena krāsa");
        } else if (waveLength >= 590 && waveLength < 620) {
            System.out.println("Šī ir oranža krāsa");
        } else if (waveLength >= 620 && waveLength < 750) {
            System.out.println("Šī ir sarkana krāsa");
        } else {
            System.out.println("Krāsa nav redzama");
        }
    }

}
