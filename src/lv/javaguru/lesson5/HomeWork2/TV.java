package lv.javaguru.lesson5.HomeWork2;

public class TV {
    private int currentChannel;
    private int currentVolume;
    private String manufacturer;
    private boolean turnedOn = false;

    public void setCurrentChannel(int currentChannel) {
        this.currentChannel = currentChannel;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public boolean turnOn() {
        manufacturerLimitation();
        return turnedOn = true;
    }

    public boolean turnOff() {
        return turnedOn = false;
    }

    public void nextChannel() {
        if (turnedOn == true) {
            this.currentChannel++;
        }
    }

    public void previousChannel() {
        if (turnedOn == true) {
            this.currentChannel--;
        }
    }

    public void increaseVolume() {
        if (turnedOn == true) {
            this.currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (turnedOn == true) {
            if (currentVolume > 0) {
                this.currentVolume--;
            }
        }
    }

    public String toString() {

        return "Channel: " + currentChannel + "\n" +
                "Volume: " + currentVolume;
    }

    public void manufacturerLimitation() {
        if (getManufacturer().equals("LG")) {
            currentVolume = 20;
        }
    }

}
