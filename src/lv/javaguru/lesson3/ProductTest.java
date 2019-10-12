package lv.javaguru.lesson3;

public class ProductTest {
    public static void main(String[] args) {
        Product first = new Product();
        first.setName("Lētas šmotkas");
        first.setRegularPrice(44.99);
        first.setDiscount(35);

        System.out.println("Veikalā pārdod " + first.getName() + "\n" +
                "Cena: " + first.getRegularPrice() + " EUR" + "\n" +
                "Atlaide " + first.getDiscount() + "%" + "\n" +
                "Cena pēcatlaides " + first.getActualPrice() + " EUR");
    }
}
