package lv.javaguru.lesson4.HomeWork1;

import lv.javaguru.lesson4.HomeWork1.LightColorDetector;

public class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetector first = new LightColorDetector();
        first.setWaveLength(450);
        first.detect();
    }
}
