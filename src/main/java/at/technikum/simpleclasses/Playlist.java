package at.technikum.simpleclasses;

import java.util.Arrays;

public class Playlist {
    private String title;

    private Artist artist;
    private int songsCount = 0;
    private Song[] songs;

    public Playlist(String title, int maxNumberOfSongs) {
        setTitle(title);
        setArtist(new Artist("dummyFirst",  25));
        this.songs = new Song[maxNumberOfSongs];
        // this.songsCount = 0;
    }

    public Playlist(String newTitle, Artist artist, int maxNumberOfSongs) {
        this.title = newTitle;
        this.artist = artist;
        // this.songsCount = 0;
        this.songs = new Song[maxNumberOfSongs];
    }

    public void addSong(Song song) {
        if (song == null) {
            System.out.println("Invalid song");
            return;
        }
        if (songsCount + 1 > songs.length) { // songsCount == songs.length
            System.out.println("Your Playlist is full!!");
            return;
        }
        songs[songsCount] = song;
        songsCount++;
    }

    public void removeSong(Song song) {
        if (song == null) {
            System.out.println("Invalid Song");
            return;
        }
        for(int i = 0; i < songsCount; i++) {
            if (songs[i].getTitle().equals(song.getTitle())) {
                songsCount--;
                for (; i < songsCount; i++)
                    songs[i] = songs[i + 1];
            }
        }
    }

    public int getTotalRuntime() {
        // cal all the lengths of songs
        int totalRuntime = 0;
        for (Song song: songs)
            if (song != null)
                totalRuntime += song.getLength();
        return totalRuntime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null) {
            System.out.println("Invalid title Null");
            return;
        }
        this.title = title;
    }

    public Song[] getSongs() {
        return songs;
    }

    public int getSongsCount() {
        return songsCount;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public int getUniqueArtist() {
        int uniqueCount = 0;
        Song[] uniqueSongs = new Song[songsCount];
            for (int i = 0; i < songsCount; i++) {
                Song song = songs[i];
                if (!containsArtistName(uniqueSongs, song)) {
                    uniqueSongs[i] = song;
                    uniqueCount++;
                }
            }
        return uniqueCount;
    }

    public boolean containsArtistName(Song[] songs, Song song) {
        for (int i = 0; i < songsCount; i++) {
            Song elem = songs[i];
            if (elem != null)
                if (elem.getArtist().getName().equalsIgnoreCase(song.getArtist().getName()))
                    return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "title='" + title + '\'' +
                ", countSongs=" + songsCount +
                ", songs=" + Arrays.toString(songs) +
                '}';
    }
}
