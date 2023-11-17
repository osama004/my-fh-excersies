package at.technikum.formatedinput;

import java.util.Scanner;

public class Geburtsdatum {

    /*
    Geburtsdatum: 101284
    Ausgabe: 841210
    Geburtsdatum: 010110
    Ausgabe: 100101
    Geburtsdatum: 010101
    Ausgabe: 010101
     */

    public static void main(String[] args) {

        /*
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Geburtsdatum: ");
            String birthdate = sc.nextLine();
            String reverseStr = new StringBuilder(birthdate).reverse().toString();
            System.out.printf("Ausgabe: %s", reverseStr);
        } catch (Exception e) {
            System.out.println("Invalid Input");
        }
        */
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Geburtsdatum: ");
            int birthdate = sc.nextInt();
            int year = birthdate % 100;
            birthdate /= 100;
            int day = birthdate / 100;
            int month = birthdate % 100;
            System.out.printf("Ausgabe: %02d%02d%02d",year, month, day);
        } catch (Exception e) {
            System.out.println("Invalid Input");
        }

    }
}
