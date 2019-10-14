package lv.javaguru.lesson3;

public class ProductTest {
    public static void main(String[] args) {
        Product first = new Product();
        first.setName("Lētas šmotkas");
        first.setRegularPrice(54.99);
        first.setDiscount(35);
        first.printInformation();


        /*System.out.println("Veikalā pārdod " + first.getName() + "\n" +
                "Cena: " + first.getRegularPrice() + " EUR" + "\n" +
                "Atlaide " + first.getDiscount() + "%" + "\n" +
                "Cena pēcatlaides " + first.getActualPrice() + " EUR");*/
    }
}
