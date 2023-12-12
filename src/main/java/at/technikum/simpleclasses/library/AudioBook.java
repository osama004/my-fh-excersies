package at.technikum.simpleclasses.library;

public class AudioBook extends Book {

    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public AudioBook(String id, String title, String isbn, Author author, int length) {
        super(id, title, isbn, author);
        this.length = length;
    }

    public AudioBook(String id, Member member, String title, String isbn, Author author, int length) {
        super(id,member, title, isbn, author);
        this.length = length;
    }

    @Override
    public String toString() {
        return "AudioBook{ " +
                "Book=" + super.toString() +
                "length=" + length +
                '}';
    }
}
