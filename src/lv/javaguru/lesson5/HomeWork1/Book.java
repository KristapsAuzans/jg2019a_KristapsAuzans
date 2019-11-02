package lv.javaguru.lesson5.HomeWork1;

public class Book {
    private String author;
    private String title;
    private int pageCount;
    private String firstTitle = "Harry Potter";
    private String firstAuthor  = "JKR";


    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public boolean equals() {
        if (firstTitle.equals(getTitle()) && firstAuthor.equals(getAuthor())) {
            System.out.println("Grāmatas ir identiskas");
            return true;
        } else {
            System.out.println("Šīs nav identiskas grāmatas");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Grāmatas autors: " + getAuthor() + "\n" +
                "Grāmaatas nosaukums: " + getTitle() + "\n" +
                "lappušu skaits: " + pageCount;
    }


}

