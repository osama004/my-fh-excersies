package at.technikum.controlstructures;

import java.util.Scanner;

public class Noten {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("Noten: ");
            int grades = scanner.nextInt();
            int firstGrade = grades / 100;
            int secondGrade = grades / 10 % 10;
            int thirdGrade = grades % 10;
            if (grades < 100 || grades > 999) {
                System.out.println("Erwarte genau 3 Noten!");
                return;
            }
            if (firstGrade < 1 || firstGrade > 5) {
                System.out.println("Erste Note muss zwischen 1 und 5 liegen!");
                return;
            } else if (secondGrade < 1 || secondGrade > 5) {
                System.out.println("Zweite Note muss zwischen 1 und 5 liegen!");
                return;
            } else if (thirdGrade < 1 || thirdGrade > 5) {
                System.out.println("Dritte Note muss zwischen 1 und 5 liegen!");
                return;
            }
            if (grades == 111) {
                System.out.println("Ausgezeichneter Erfolg!");
                return;
            }
            if (firstGrade == 5 || secondGrade == 5 || thirdGrade == 5) {
                System.out.println("Nicht bestanden!");
                return;
            }
            if (firstGrade + secondGrade + thirdGrade == 4) {
                System.out.println("Guter bestanden!");
                return;
            }
            System.out.println("Bestanden.");
        } catch (Throwable e) {
            System.out.println("Invalid Input:" + e );
        }
    }
}
