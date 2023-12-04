package at.technikum.simpleclasses;

public class MusicPlayer {
    public static void main(String[] args) {
        // artist1 artist2 artist2 artist1 artist1 artist3 artist2
        Artist artist1 = new Artist("Raul gonzo", 20);
        Song track1 = new Song("Time to say goodbye", artist1, "Pop", 400);
        // System.out.println(track1.toString());
        // System.out.println(track1);
        Playlist playlist1 = new Playlist("My favorites", 8);
        System.out.println(playlist1.getSongsCount());

    }
    /*
    public static void main(String[] args) {
        // artist1 artist2 artist2 artist1 artist1 artist3 artist2
        Playlist playlist1 = new Playlist("My favorites", 8);
        Artist artist1 = new Artist("Raul gonzo", 20);
        Artist artist2 = new Artist("Mike Kick", 19);
        Artist artist3 = new Artist("CJ", 22);
        Song track1 = new Song("Time to say goodbye", artist1, "Pop", 400);
        Song track2 = new Song("show me the meaning", artist2, "Pop", 200);
        Song track3 = new Song("Love you", artist2, "Pop", 400);
        Song track4 = new Song("Got you", artist1, "Pop", 200);
        Song track5 = new Song("Shut up", artist1, "Pop", 200);
        Song track6 = new Song("He got destroyed", artist3, "Pop", 200);
        Song track7 = new Song("love yourself", artist2, "Pop", 200);
        Song track8 = new Song("love yourself", artist2, "Pop", 200);
        playlist1.addSong(track1);
        playlist1.addSong(track2);
        playlist1.addSong(track3);
        playlist1.addSong(track4);
        playlist1.addSong(track5);
        playlist1.addSong(track6);
        playlist1.addSong(track7);
        playlist1.addSong(track8);
        System.out.println(playlist1);
        System.out.println(playlist1.getUniqueArtist());
        playlist1.removeSong(track2);
        System.out.println(playlist1);
        System.out.printf("Total Runtime in Seconds: %d", playlist1.getTotalRuntime()); // 1000
    }

     */
}
