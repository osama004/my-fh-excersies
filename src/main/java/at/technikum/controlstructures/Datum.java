package at.technikum.controlstructures;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Datum {

    enum Months {
        PLACEHOLDER,
        Januar,
        Februar,
        Maerz,
        April,
        Mai,
        Juni,
        Juli,
        August,
        September,
        Oktober,
        November,
        Dezember
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            /*
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddMMyyyy");
            String nowTimeString = dtf.format(LocalDateTime.now());
            int now = Integer.parseInt(nowTimeString);
             */
            System.out.print("Datum: ");
            int birthdate = sc.nextInt();
            int year = birthdate % 10000;
            int month = birthdate / 10000 % 100;
            int day = birthdate / 1000000;
            if (day < 1 || day > 31) {
                System.out.println("Tag muss zwischen 1 und 31 liegen!");
                return;
            }
            if (month < 1 || month > 12) {
                System.out.println("Monat muss zwischen 1 und 12 liegen!");
                return;
            }
            if (year <= 1581) {
                System.out.println("Jahr muss groesser als 1581 sein!");
                return;
            }
            if (birthdate == 1011582) {
                System.out.println("Datum muss nach dem 14.10.1582 liegen!");
                return;
            }
            System.out.printf("%02d. %s %4d\n", day, Months.values()[month], year);

        } catch (Throwable e) {
            System.out.println("Invalid Input:" + e);
        }
    }
}
