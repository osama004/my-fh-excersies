package at.technikum.simpleclasses.library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library("Thalia");
        Author luca = new Author("luca");
        Member osama = new Member(1, "Osama");
        BookPapier prince = new BookPapier("B-1", "prince", "353253253", luca, 150);
        BookPapier boaredBook = new BookPapier("B-2", osama, "lifes purpose", "3523846431", luca, 210);
        AudioBook storyOfMe = new AudioBook("B-3", osama, "Story of me", "3253251223", luca, 210);
        library.addItems(prince, boaredBook, storyOfMe);
        System.out.println("rent: " + library.rent(prince, osama)); // true
        System.out.println("rent: " + library.rent(boaredBook, osama)); // false
        library.returnItem(prince);
        System.out.println(prince);

    }
}
