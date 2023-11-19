package at.technikum.controlstructures;

import java.util.Scanner;

public class GroesseGewicht {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("Groesse: ");
            int size = scanner.nextInt();
            System.out.print("Gewicht: ");
            int weight = scanner.nextInt();
            // size < 50 || weight > 200 (*)
            if (size <= 0 || size > 300 || weight <= 0 || weight > 1000) {
                System.out.println("Ungueltig!");
                return;
            }
            if (weight <= 90)
                if (size <= 200)
                    if (size >= 50)
                        System.out.println("normal");
                    else
                        System.out.println("normal (*)");
                 else
                    System.out.println("hager");
             else
                // weight > 90
                if (size <= 200)
                    if (size >= 50)
                        System.out.println("Uebergewichtig");
                    else
                        System.out.println("Uebergewichtig (*)");
                 else
                    if (weight <= 200)
                        System.out.println("riesig");
                    else
                        System.out.println("riesig (*)");
        } catch (Throwable e) {
            System.out.println("Invalid input:" + e);
        }
    }
}
