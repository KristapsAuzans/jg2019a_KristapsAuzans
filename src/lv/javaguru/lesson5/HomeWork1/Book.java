package lv.javaguru.lesson5.HomeWork1;

public class Book {
    private String author;
    private String title;
    private int pageCount;
    //šis stāvoklis ir jāistata ar set metodēm vai konstruktoru
    //nekādā gadijumā ne šādi, jo citādi izveidojot objektu visiem būs jau iesetots stavoklis
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

    //šeit ir jābūt pārrakstītai "@Overriden" metodei "equals", skatīt piektās nodarbības materialus
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

