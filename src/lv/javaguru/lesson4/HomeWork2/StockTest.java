package lv.javaguru.lesson4.HomeWork2;

public class StockTest {
    public static void main(String[] args) {
        Stock ibm = new Stock("IBM", 150);

        ibm.updatePrice(150.37);
        ibm.updatePrice(145.82);
        ibm.updatePrice(150.12);
        ibm.printInformation();


    }
}

