package at.technikum.simpleclasses.library;

public abstract class Book extends Item {

    private String title;

    private String isbn;

    private Author author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Book(String id,String title, String isbn, Author author) {
        super(id);
        this.title = title;
        this.isbn = isbn;
        this.author = author;
    }

    public Book(String id, Member member,String title, String isbn, Author author) {
        super(id, member);
        this.title = title;
        this.isbn = isbn;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", author=" + author +
                '}';
    }
}
