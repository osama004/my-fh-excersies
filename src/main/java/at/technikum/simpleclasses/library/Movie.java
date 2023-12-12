package at.technikum.simpleclasses.library;

public class Movie extends Item {

    private String title;

    private int rating;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Movie(String id, String title, int rating) {
        super(id);
        this.title = title;
        this.rating = rating;
    }

    public Movie(String id, Member member, String title, int rating) {
        super(id, member);
        this.title = title;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id='" + super.getId() + '\'' +
                ", title='" + title + '\'' +
                ", rating=" + rating +
                '}';
    }
}
