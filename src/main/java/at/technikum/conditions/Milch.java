package at.technikum.conditions;

import java.util.Scanner;

public class Milch {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("Fettgehalt: ");
            double fatContent = scanner.nextDouble();
            if (fatContent < 0) {
                System.out.println("Fettgehalt ist eine nicht-negative Kommazahl!!");
                return;
            }
            System.out.print("Haltbar: ");
            byte durability = scanner.nextByte();
            if (durability != 0 && durability != 1) {
                System.out.print("Ungueltig Eingabe (Haltbarkeit): " + durability);
                return;
            }
            if (durability == 1)
                if (fatContent < 3)
                    System.out.println("Leichtmilch (frisch) ");
                else if (fatContent > 7)
                    System.out.println("Extravollmilch (frisch)");
                else
                    System.out.println("Normalmilch (frisch)");
             else
                if (fatContent < 3)
                    System.out.println("Leichtmilch (haltbar) ");
                else if (fatContent > 7)
                    System.out.println("Extravollmilch (haltbar)");
                else
                    System.out.println("Normalmilch (haltbar)");
        } catch (Throwable e) {
            System.out.println("Invalid Input:" + e);
        }
    }
}
