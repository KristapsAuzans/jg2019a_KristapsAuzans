package lv.javaguru.lesson5.HomeWork1;

public class BookTest {
    public static void main(String[] args) {
        Book first = new Book();
        first.setTitle("Harry Potter");
        first.setAuthor("JKR");
        first.setPageCount(895);
        System.out.println(first.getAuthor() +first.getTitle() +first.getPageCount());

        first.equals();
        first.toString();

        System.out.println(first.toString());





    }
}
