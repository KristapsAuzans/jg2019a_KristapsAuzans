package lv.javaguru.lesson3;

public class Product {
    private String name;
    private double regularPrice;
    private double discount;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }


    double getActualPrice() {
        double actualPrice = regularPrice - regularPrice * discount / 100;
        double actualPriceRounded = Math.round(actualPrice * 100.00) / 100.00;
        return actualPriceRounded;
    }


}
