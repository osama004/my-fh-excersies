package at.technikum.simpleclasses;

public class Song {
    private String title;

    private String genre;

    private Artist artist;
    private int length;
    public Song(String title, Artist artist, String genre, int length) {
        setTitle(title);
        setArtist(artist);
        setGenre(genre);
        setLength(length);
    }

    public Song(String title, String genre, Artist artist) {
        this.title = title;
        this.genre = genre;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        if (genre == null) {
            this.genre = "";
            return;
        }
        this.genre = genre;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length < 0) {
            this.length = 0;
            return;
        }
        this.length = length;
    }


    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", genre='" + genre + '\'' +
                ", length=" + length +
                '}';
    }
}
