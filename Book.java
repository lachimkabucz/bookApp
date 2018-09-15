package bookexeample;

public class Book {

    private final String title;
    private final String author;
    private final Integer year;
    private final Integer numberPage;
    private final String publishing;
    private final String type;
    private final String isbn;

    public Book(String title, String author, Integer year, Integer numberPage, String publishing, String type, String isbn) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.numberPage = numberPage;
        this.publishing = publishing;
        this.type = type;
        this.isbn = isbn;

    }

    @Override
    public String toString() {
        return "Title:" + title +
                " Author:" + author +
                " Year:" + year +
                " Number page:" + numberPage +
                " Publisher:" + publishing +
                " Type:" + type +
                " ISBN:" + isbn;
    }

    public String getTitle() {
        return title;
    }


    public String getAuthor() {
        return author;
    }


    public Integer getYear() {
        return year;
    }


    public Integer getNumberPage() {
        return numberPage;
    }


    public String getPublishing() {
        return publishing;
    }


    public String getType() {
        return type;
    }


    public String getIsbn() {
        return isbn;
    }


}

