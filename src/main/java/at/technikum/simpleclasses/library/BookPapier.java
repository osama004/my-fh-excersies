package at.technikum.simpleclasses.library;

public class BookPapier extends Book {

    private int pages;
    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public BookPapier(String id, String title, String isbn, Author author, int pages) {
        super(id, title, isbn, author);
        this.pages = pages;
    }

    public BookPapier(String id, Member member, String title, String isbn, Author author, int pages) {
        super(id, member, title, isbn, author);
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "BookPapier{ " +
                super.toString() +
                " pages=" + pages +
                '}';
    }
}
