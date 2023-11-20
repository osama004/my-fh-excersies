package at.technikum.controlstructures;

import java.util.Scanner;

public class Notenstatistik {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            int grade = 0;
            double sum = 0.;
            int countGrades = 0;
            int countFives = 0;
            System.out.println("Noteneingabe:");
            do {
                if (grade >= 0 && grade <= 5) {
                    System.out.print(": ");
                    grade = scanner.nextInt();
                    if (grade != 0) {
                        countGrades++;
                        sum += grade;
                        if (grade == 5) countFives++;
                    }
                } else {
                    System.out.println("Falsche Eingabe!");
                    grade = 1;
                }
            } while (grade != 0);
            if (countGrades != 0)
                System.out.printf("Notendurchschnitt: %.2f Anzahl Fuenfer: %d\n", sum / countGrades, countFives);
        } catch (Throwable e) {
            System.out.println("Invalid Input:" + e);
        }
    }
}
