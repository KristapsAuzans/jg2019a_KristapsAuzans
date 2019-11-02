package lv.javaguru.lesson5.HomeWork1;

public class Book {
    private String author;
    private String title;
    private int pageCount;

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

    public String equals() {
        if (title.equals(getTitle()) && author.equals(getAuthor())) {
            System.out.println("Grāmatas ir identiskas");
        } else {
            System.out.println("Šīs nav identiskas grāmatas");
        }

        @Override
        public String toString() {
            return "Grāmatas autors: " + getAuthor() + "\n" +
                    "Grāmaatas nosaukums: " + getTitle() + "\n" +
                    "lappušu skaits: " + getPageCount();
        }


    }
}

