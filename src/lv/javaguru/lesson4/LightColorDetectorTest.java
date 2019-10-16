package lv.javaguru.lesson4;

public class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetector first = new LightColorDetector();
        first.setWaveLength(450);
        first.detect();
    }
}
