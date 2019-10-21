package lv.javaguru.lesson4.HomeWork2;

public class Stock {
    private String company;
    private double currentValue;
    private double max;
    private double min;

    public Stock(String company, double currentValue) {
        this.company = company;
        this.currentValue = currentValue;
        this.max = currentValue;
        this.min = currentValue;
    }

    public String getCompany() {
        return company;
    }

    public double getCurrentValue() {
        return currentValue;
    }


    public double getMax() {
        this.max = max;
        return max;
    }

    public double getMin() {
        this.min = min;
        return min;
    }

    public double updatePrice(double currentValue) {
        this.currentValue = currentValue;
        if (currentValue < min) {
            this.currentValue = currentValue;
            this.min = currentValue;
            return min;
        } else if (currentValue > max) {
            this.currentValue = currentValue;
            this.max = currentValue;
            return max;
        }
        return currentValue;

    }

    public void printInformation() {
        System.out.println("Current cost of " + getCompany() + " stock is " + getCurrentValue() + "\n" +
                "Minimal price was " + getMin() + "\n" +
                "Maximal price was " + getMax());
    }

}
